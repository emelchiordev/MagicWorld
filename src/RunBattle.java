
public class RunBattle {


    /**
     * Cette méthode permet de créer les deux joueurs et de lancer le processus de création du personange pour chaque joueur.
     * Une fois que les personnages sont créés, le combat commence.
     * à la fin on affiche l'utilisateur qui a perdu.
     */
    public static void startBattle() {
        Player joueur1 = new Player("Joueur 1"); // on initialise le joueur1
        PersonnagesMaker makePerso1 = new PersonnagesMaker();
        Personnages persoPlayer1 = makePerso1.sentenceMakeCharacter(joueur1); // on crée le personnage du joueur1
        Player joueur2 = new Player("Joueur 2"); // on initialise le joueur2
        PersonnagesMaker makePerso2 = new PersonnagesMaker();
        Personnages persoPlayer2 = makePerso2.sentenceMakeCharacter(joueur2); // on crée le personnage du joueur2

        while (joueur1.getLifePlayer() > 0 && joueur2.getLifePlayer() > 0) {
            if (joueur1.getLifePlayer() > 0) {
                joueur1.chooseAction(joueur1, joueur2, persoPlayer1);
            }

            if (joueur2.getLifePlayer() > 0) {
                joueur2.chooseAction(joueur2, joueur1, persoPlayer2);
            }

        }
        if (joueur1.getLifePlayer() <=0){
            System.out.println ("le "+joueur1.getNamePlayer()+ " a perdu");
        }else {
            System.out.println ("le "+joueur2.getNamePlayer()+ " a perdu");        }

    }
}

