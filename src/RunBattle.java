public class RunBattle {


    /**
     * this method allows to initiate all progress of the fight.
     * From the creation of the character, until the end of the fight.
     *
     * Cette méthode permet d'initialsier tout le déroulement du combat.
     * Depuis la création du personnage jusqu'à la fin du combat.
     */

    public static void initBattle(){

        // Initialisation du joueur 1 et de son personnage
        PersonnagesMaker character1 = new PersonnagesMaker();
        Player Joueur1 = new Player("Joueur1");
        Personnages persoPlayer1 = character1.chooseCharacter(Joueur1);

        // initialisation du joueur 2 et de son personnage
        PersonnagesMaker character2 = new PersonnagesMaker();
        Player Joueur2 = new Player("Joueur2");
        Personnages persoPlayer2 = character2.chooseCharacter(Joueur2);

    }

}
