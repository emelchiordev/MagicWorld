import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);


    public void chooseCharacter(){
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
        int numChara = sc.nextInt();
        Personnages type = null;
        switch (numChara) {
            case 1:
                type = new Guerrier();
                type.setLevel(chooseLevel());
                type.setStrength(chooseStrength());
                type.setAgility(chooseAgility());
                type.setIntelligence(chooseIntelligence());
                break;
            case 2 :
                type = new Rodeur();
                break;
            case 3 :
                type = new Mage();
                break;
        }


    }

    /**
     * @return Level of Character
     */
    public int chooseLevel(){
     System.out.println("Niveau du personnage ?");
     int level = sc.nextInt();
     return level;
    }

    public int chooseStrength(){
        System.out.println("Force du personnage ?");
        int strength = sc.nextInt();
        return strength;
    }
    public int chooseAgility(){
        System.out.println("Agilité du personnage ?");
        int agility = sc.nextInt();
        return agility;
    }
    public int chooseIntelligence(){
        System.out.println("Agilité du personnage ?");
        int intelligence = sc.nextInt();
        return intelligence;
    }


}
