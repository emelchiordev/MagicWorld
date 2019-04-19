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

        while(perso1.getLife() <= 0 || perso2.getLife() <=0) {
            System.out.println(joueur1.getNamePlayer()+" ("+joueur1.getLifePlayer()+" Vitalité) "+ "Veuillez choisir votre action : (1 - Attaque basique, 2 - Attaque spéciale :");
            switch (sc.nextInt()){
                case 1 : System.out.println(joueur1.getNamePlayer()+perso1.basicAttack());
                break;
                case 2 : System.out.println(joueur1.getNamePlayer()+perso1.specialAttack());
                break;
            }
            System.out.println(joueur2.getNamePlayer()+" ("+joueur2.getLifePlayer()+" Vitalité) "+ "Veuillez choisir votre action : (1 - Attaque basique, 2 - Attaque spéciale :");
            switch (sc.nextInt()){
                case 1 : System.out.println(joueur2.getNamePlayer()+perso2.basicAttack());
                    break;
                case 2 : System.out.println(joueur2.getNamePlayer()+perso2.specialAttack());
                    break;
            }

        }
}

public static void stopBattle(){

}


}
