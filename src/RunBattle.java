
public class RunBattle {


    /**
     * Cette méthode permet d'initialiser les deux joueurs et de lancer le processus de création de personange.
     * Une fois que les personnages sont créés, le combat commence.
     */
    public static void startBattle() {
        Player joueur1 = new Player("Joueur1"); // on initialise le joueur1
        PersonnagesMaker makePerso1 = new PersonnagesMaker();
        Personnages persoPlayer1 = makePerso1.makeCharacter(joueur1); // on crée le personnage du joueur1
        Player joueur2 = new Player("Joueur2"); // on initialise le joueur2
        PersonnagesMaker makePerso2 = new PersonnagesMaker();
        Personnages persoPlayer2 = makePerso2.makeCharacter(joueur2); // on crée le personnage du joueur2

        while (joueur1.getLifePlayer() > 0 && joueur2.getLifePlayer() > 0) {
             if (joueur1.getLifePlayer() > 0) {
                joueur1.chooseAction(joueur1, joueur2, persoPlayer1);
             }
             if (joueur2.getLifePlayer() > 0) {
                 joueur2.chooseAction(joueur2, joueur1, persoPlayer2);
             }

        }

    }

}

