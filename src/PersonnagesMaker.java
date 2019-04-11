import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);

      // Attribut pour tester
      int nbLevel;

    /**
     * Choose the Character to fight and differents abilities and features
     */
    public int chooseCharacter(int nbPlayer){
        System.out.println("Création du personnage du Joueur "+nbPlayer);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
        int numChara = sc.nextInt()-1;
        Personnages type[] = {new Guerrier(), new Rodeur(), new Mage()};

                type[numChara].setLevel(chooseLevel());
                nbLevel = type[numChara].getLevel();
                type[numChara].setStrength(chooseStrength());
                type[numChara].setAgility(chooseAgility());
                type[numChara].setIntelligence(chooseIntelligence());
                type[numChara].setLife(type[numChara].getLevel()*5);


                System.out.println(type[numChara].toString() + "Joueur"+nbPlayer + " Niveau " +type[numChara].getLevel()+
                        " je possède "+type[numChara].getLife()+" de vitalité, "+type[numChara].getStrength()+ " de force, "+
                        type[numChara].getAgility()+" d'agilité, "+ type[numChara].getIntelligence()+" d'intelligence !"
                );
    return type[numChara].getLife();
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
    public int chooseStrength() {

           try {
               System.out.println("Force du personnage ?");
               int strength = sc.nextInt();
               this.levelTest(strength);
               nbLevel -= strength;
               return strength;
           } catch (AbilityTooMuchExceptions e) {

               System.err.println("ATTENTION ! la force de votre personnage dépasse le niveau de votre joueur !");

           }
           return chooseStrength();
       }






    /**
     *
     * @return Agility of Character
     */
    public int chooseAgility(){
        try {
            System.out.println("Agilité du personnage ?");
            int agility = sc.nextInt();
            this.levelTest(agility);
            nbLevel -= agility;
            return agility;
        } catch (AbilityTooMuchExceptions e) {
            System.err.println("ATTENTION! le total de votre force et de votre agilité dépasse le niveau de votre personnage ");
        }   return chooseAgility();
    }

    /**
     *
     * @return Intelligence of Character
     */
    public int chooseIntelligence(){
        try {
            System.out.println("Intelligence du personnage ?");
            int intelligence = sc.nextInt();
            this.levelTest(intelligence);
            return intelligence;
        } catch (AbilityTooMuchExceptions e) {
            System.err.println("ATTENTION ! la somme de votre force, agilité et intelligence dépasse le niveau de votre personnage ");
        }
        return chooseIntelligence();
    }

    public void levelTest(int nbAbility){
        if (nbLevel - nbAbility <0){
            throw new AbilityTooMuchExceptions();
        }
    }


}
