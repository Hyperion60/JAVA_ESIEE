package tp1;

import java.io.IOException;
import java.net.Socket;


public class Principale {
    public static void main(String[] args) throws IOException {
        String line = "";
        Socket my_socket = new Socket("127.0.0.1", 867);
        IOCommandes my_stream = new IOCommandes(my_socket);
        while (true) {
            line = my_stream.lireEcran();
            my_stream.ecrireEcran(line);
            my_stream.ecrireReseau(line);
            my_stream.ecrireEcran(my_stream.lireReseau());
            if (line.equals("quit")) {
                break;
            }
        }
        System.exit(0);
    }
}
