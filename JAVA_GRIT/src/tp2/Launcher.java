package tp2;

import tp1.IOCommandes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Launcher {
    public static void main_1() throws IOException {
        ServerSocket server = new ServerSocket(867);
        Socket client;
        while ((client = server.accept()) == null) {}
        IOCommandes client_on = new IOCommandes(client);
        String line;
        while (true) {
            if ((line = client_on.lireReseau()) != null) {
                client_on.ecrireEcran("echo>" + line);
                client_on.ecrireReseau("echo>" + line);
                if (line.equals("quit")) {
                    client.close();
                    System.exit(0);
                }
            }
        }
    }

    private static void check_clients(ArrayList<ServerThread> clients) {
        clients.removeIf(client -> !client.status());
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        int limit = 1;
        ArrayList<ServerThread> list_client = new ArrayList<>();
        try {
            serverSocket = new ServerSocket(867);
        } catch (IOException exception) {
            exception.printStackTrace();
            System.exit(-1);
        }
        Socket new_client = null;
        while (true) {
            if (list_client.toArray().length < limit) {
                new_client = serverSocket.accept();
                System.out.println("Socket accepted");
            }
            if (new_client != null) {
                ServerThread client = new ServerThread(new_client, "log.txt");
                list_client.add(client);
                Thread t = new Thread(client);
                t.start();
                client.setThread(t);
                System.out.println("Thread lancé");
                new_client = null;
            }
            check_clients(list_client);
        }
    }
}
