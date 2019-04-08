import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);



    /*
    * Allows to inform all the characteristics of the character, level, agility etc.
    * FR : Permet de renseigner toutes les caractéristiques du personnage, niveau, agilité etc.
    * */

    public int featureCharac(){
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
        int numPerso = sc.nextInt();
        switch (numPerso) {
            case 1:
                Personnages guerrier = new Guerrier();
                break;
            case 2 :
                Personnages rodeur = new Rodeur();
                break;
            case 3 :
                Personnages mage = new Mage();
                break;
        }
        return numPerso;




    }

    public void sentenceCharac(){
        System.out.println("Niveau du personnage :");
        int nb = sc.nextInt();



    }
}
