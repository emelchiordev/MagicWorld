import java.util.Scanner;

public class RunBattle {


    /**
     * Cette méthode permet d'initialiser les deux joueurs et de lancer le processus de création de personange.
     * Une fois que les personnages sont créés, le combat commence.
     */
    public static void startBattle(){
    Scanner sc = new Scanner(System.in);

    Player joueur1 = new Player("Joueur1"); // on initialise le joueur1
    PersonnagesMaker makePerso1 = new PersonnagesMaker();
    Personnages perso1 = makePerso1.makeCharacter(joueur1); // on crée le personnage du joueur1

    Player joueur2 = new Player("Joueur2"); // on initialise le joueur2
    PersonnagesMaker makePerso2 = new PersonnagesMaker();
    Personnages perso2 = makePerso2.makeCharacter(joueur2); // on crée le personnage du joueur2

        while(joueur1.getLifePlayer() > 0 && joueur2.getLifePlayer() > 0) {
            joueur1.chooseAction();
            switch (sc.nextInt()){
                case 1 : perso1.basicAttack(joueur1,joueur2,perso1);
                break;
                case 2 : perso1.specialAttack(joueur1,joueur2,perso1);
                break;
            }
            joueur2.deathSentence();
            joueur2.chooseAction();
            switch (sc.nextInt()){
                case 1 : perso2.basicAttack(joueur2,joueur1,perso2);
                    break;
                case 2 : perso2.specialAttack(joueur2,joueur1,perso2);
                    break;
            }
            joueur1.deathSentence();
        }
}

public static void stopBattle(){

}


}
