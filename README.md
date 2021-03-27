# TDs JAVA 
Dans ce dépot, vous pourrez y trouver mon travail réalisé au fur et à mesure
des TD de l'électif JAVA/POO de l'ESIEE Amiens.

## Remarques

- Les fichiers de codes se trouvent dans le dossier `TD_JAVA/src` et `JAVA_GRIT/src`.

### TD avec Mme RUSSO
- Les packages `feuilleX` correspondent à une séance de TD.
- Les sous-packages `exo.XXXX` correspondent à chaque exercices.
- Chaque sous-packages possèdent une fonction main non-exécutable pour tester les classes
- A la racine du projet (`src`), il y a un fichier appelé `main` qui contient une
  fonction exécutable qui est reliée à tous les fonctions main de chaque package avec un menu sélectif.
  
### TD avec la GRIT
- Chaque séance de TD est séparée dans un dossier `JAVA_GRIT/src/tpX/`
- Pour le TP1 :
    - La fonction de test pour la classe IOCommande se trouve dans le fichier `JAVA_GRIT/src/tp1/Principale.java`
    - La fonction qui réalise les taches d'explorations se trouve dans le fichier `JAVA_GRIT/src/tp1/Explorer.java`
- Pour le TP2 :
    - La fonction pour le serveur mono-client se trouve dans le fichier `JAVA_GRIT/src/tp2/Laucher.java` et s'appelle `main_1`. Pour pouvoir la tester, renommez-là "main" et commentez la deuxième fonction main du fichier.
    - La fonction pour le serveur multi-client se trouve dans le fichier `JAVA_GRIT/src/tp2/Launcher.java` et s'appelle `main`. Elle peut directement être testée.

## Comment lancer ?

### Avec Intellij

Ouvrez le dossier `TD_JAVA` comme projet IntelliJ. Pour lancer le programme, lancer la class `src/main`

Ouvrez le dossier `JAVA_GRIT` comme projet IntelliJ. Vous pouvez lancer les classes `JAVA_GRIT/src/tp1/Principale.java; JAVA_GRIT/src/tp1/Explorer.java; JAVA_GRIT/src/tp2/Launcher.java`

