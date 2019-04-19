import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);
      int nbLevel;     // Niveau du personnage

    /**
     * Permet de choisir le personnage du joueur, ainsi que tous ses attributs.
     * Cette méthode calcul également la vie du joueur
     * @return Le personnage choisi par le joueur
     *
     */
    public Personnages makeCharacter(Player player){

        System.out.println("Création du personnage du "+player.getNamePlayer());
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
        int numChara = sc.nextInt()-1;

        Personnages type[] = {new Guerrier(), new Rodeur(), new Mage()}; // tableau qui contient les différentes instances de personnage

                type[numChara].setLevel(chooseLevel()); // on choisit le niveau du personnage
                nbLevel = type[numChara].getLevel(); // on récupère le niveau du personnage dans un attribut
                type[numChara].setStrength(chooseStrength()); // on choisit la force du personnage
                type[numChara].setAgility(chooseAgility()); // // on choisit l'agilité du personnage
                type[numChara].setIntelligence(chooseIntelligence()); // on choisit l'intelligence
                player.setLifePlayer(type[numChara].getLevel()*5); // on calcule la vie du personnage

        System.out.println(type[numChara].toString() + player.getNamePlayer() + " Niveau " +type[numChara].getLevel()+
                        " je possède "+player.getLifePlayer()+" de vitalité, "+type[numChara].getStrength()+ " de force, "+
                        type[numChara].getAgility()+" d'agilité, "+ type[numChara].getIntelligence()+" d'intelligence !"
                );
        return type[numChara];
    }

    /** Demande au joueur de choisir le niveau du personnage
     * @return Le niveau du personnage
     */
    public int chooseLevel(){
     System.out.println("Niveau du personnage ?");
     int level = sc.nextInt();
     return level;
    }

    /** Demande au joueur de choisir la force du personnage
     * @return La force du personnage
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

    /** Demande au joueur de choisir l'agilité du personnage
     * @return L'agilité du personnage
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

    /** Demande au joueur de choisir l'intelligence de son personnage
     * dépasse celui du njoueur
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

    /** Cette méthode permet de lever une exception si la somme de la force, de l'agilité et de l'intelligence
     * dépasse le niveau du personnage.
     * @param nbAbility prend en paramètre le niveau de l'abilité.
     */
    public void levelTest(int nbAbility){
        if (nbLevel - nbAbility <0){
            throw new AbilityTooMuchExceptions();
        }
    }


}
