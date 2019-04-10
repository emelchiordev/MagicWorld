import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);




    /**
     * Choose the Character to fight and differents abilities and features
     */
    public void chooseCharacter(int nbPlayer){
        System.out.println("Création du personnage du joueur"+nbPlayer);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
        int numChara = sc.nextInt()-1;
        Personnages type[] = {new Guerrier(), new Rodeur(), new Mage()};

                type[numChara].setLevel(chooseLevel());
                type[numChara].setStrength(chooseStrength());
                type[numChara].setAgility(chooseAgility());
                type[numChara].setIntelligence(chooseIntelligence());
                type[numChara].setLife(type[numChara].getLevel()*5);


                System.out.println(type[numChara].toString() + "Joueur"+nbPlayer + " Niveau " +type[numChara].getLevel()+
                        " je possède "+type[numChara].getLife()+" de vitalité, "+type[numChara].getStrength()+ " de force, "+
                        type[numChara].getAgility()+" d'agilité, "+ type[numChara].getIntelligence()+" d'intelligence !"
                );

    }

    /**
     * @return Level of Character
     */
    public int chooseLevel(){
     System.out.println("Niveau du personnage ?");
     int level = sc.nextInt();
     return level;
    }

    /**
     *
     * @return Strength of Character
     */
    public int chooseStrength(){
        System.out.println("Force du personnage ?");
        int strength = sc.nextInt();
        return strength;
    }

    /**
     *
     * @return Agility of Character
     */
    public int chooseAgility(){
        System.out.println("Agilité du personnage ?");
        int agility = sc.nextInt();
        return agility;
    }

    /**
     *
     * @return Intelligence of Character
     */
    public int chooseIntelligence(){
        System.out.println("Intelligence du personnage ?");
        int intelligence = sc.nextInt();
        return intelligence;
    }


}
