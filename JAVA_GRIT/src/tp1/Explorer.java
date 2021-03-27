package tp1;

import java.io.*;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Explorer {

    private static boolean isPathValid(String path) {
        try {
            Paths.get(path);
        } catch (InvalidPathException exception) {
            return false;
        }
        return true;
    }

    private static void ViewFile(File root, String path) throws IOException {
        IOCommandes file = new IOCommandes(root.getAbsolutePath() + "\\" + path);
        String line = file.lireFichier();
        while (line != null) {
            file.ecrireEcran(line);
            line = file.lireFichier();
        }
    }

    private static void ViewDir(File root) {
        System.out.println("Répertoire courant : " + root.getAbsolutePath());
        System.out.println("Contenu :\n.");
        System.out.println(root.getParent() != null ? root.getParent() : "..");
        for (File file : Objects.requireNonNull(root.listFiles())) {
            if (file.isDirectory()) {
                System.out.println("rep. " + file.getName());
            } else {
                System.out.println("file. " + file.getName());
            }
        }
    }

    private static String toParent(String path) {
        int len = path.length() - 1;
        int i = 0;
        if (path.charAt(len) == '\\') {
            --len;
        }
        while (path.charAt(len--) != '\\') {}
        return path.substring(0, len + 1);
    }

    public static void main(String[] args) throws IOException {
        Pattern view = Pattern.compile("^view .*");
        Pattern enter = Pattern.compile("^enter .*");
        Pattern space = Pattern.compile(" ");
        Pattern rooter = Pattern.compile("^[A-Z]:.*");
        Matcher view_matcher;
        Matcher enter_matcher;


        System.out.println("Entrez le chemin d'accès à explorer :");
        Scanner input = new Scanner(System.in);
        String path = input.nextLine();
        while (!isPathValid(path)) {
            path = input.nextLine();
        }
        File root = new File(path);
        ViewDir(root);
        while (true) {
            System.out.println("Tapez votre commande (view <fichier> ou enter <rep> ou quit pour quitter) : ");
            String line = input.nextLine();
            enter_matcher = enter.matcher(line);
            view_matcher = view.matcher(line);
            if (line.equals("quit")) {
                System.exit(0);
            } else if (enter_matcher.find()) {
                String arg_path = space.split(line)[1];
                if (arg_path.equals("..")) {
                    String parent_path = toParent(root.getAbsolutePath());
                    root = new File(parent_path);
                } else {
                    Matcher root_match = rooter.matcher(arg_path);
                    if (root_match.find()) {
                        root = new File(arg_path);
                    } else {
                        File tmp = new File(root.getAbsolutePath() + "\\" + arg_path);
                        if (!tmp.isDirectory())
                            System.out.println("Action impossible : Le chemin est un fichier");
                        else
                            root = tmp;
                    }
                }
                ViewDir(root);
            } else if (view_matcher.find()) {
                ViewFile(root, space.split(line)[1]);
            }
        }
    }
}
