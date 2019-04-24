import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);
      int nbLevel;     // Niveau du personnage

    /**
     * Permet de choisir le personnage du joueur, ainsi que tous ses attributs.
     * @return Le personnage choisi par le joueur
     */
    public Personnages makeCharacter(Player player){
        try {
            System.out.println("Création du personnage du "+player.getNamePlayer());
            System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
            int numChara = sc.nextInt() - 1;
                Personnages type[] = {new Guerrier(), new Rodeur(), new Mage()}; // tableau qui contient les différentes instances de personnage
                this.chooseLevel(type[numChara]); // on choisit le niveau du personnage
                this.chooseStrength(type[numChara]); // on choisit la force du personnage
                this.chooseAgility(type[numChara]); // on choisit l'agilité du personnage
                this.chooseIntelligence(type[numChara]); // on choisit l'intelligence
                player.setLifePlayer(type[numChara].getLevel()*5); // on calcule la vie du personnage
                System.out.println(type[numChara].toString() + player.getNamePlayer() + " Niveau " +type[numChara].getLevel()+
                " je possède "+player.getLifePlayer()+" de vitalité, "+type[numChara].getStrength()+ " de force, "+
                type[numChara].getAgility()+" d'agilité, "+ type[numChara].getIntelligence()+" d'intelligence !");
        return type[numChara];
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Veuillez choisir l'un des personnages proposés :");
        }return makeCharacter(player);
    }

    /** Demande au joueur de choisir le niveau du personnage
     * @return Le niveau du personnage
     */
    public void chooseLevel(Personnages type){
     System.out.println("Niveau du personnage ?");
     type.setLevel(sc.nextInt());
     nbLevel = type.getLevel(); // on récupère le niveau du personnage dans un attribut
    }

    /** Demande au joueur de choisir la force du personnage
     * @return La force du personnage
     */
    public int chooseStrength(Personnages type) {

           try {
               System.out.println("Force du personnage ?");
               int strength = sc.nextInt();
               type.setStrength(strength);
               this.levelTest(strength);
               nbLevel -= strength;
               return strength;
           } catch (AbilityTooMuchExceptions e) {

               System.err.println("ATTENTION ! la force de votre personnage dépasse le niveau de votre joueur !");

           }
           return chooseStrength(type);
       }

    /** Demande au joueur de choisir l'agilité du personnage
     * @return L'agilité du personnage
     */
    public int chooseAgility(Personnages type){
        try {
            System.out.println("Agilité du personnage ?");
            int agility = sc.nextInt();
            type.setAgility(agility);
            this.levelTest(agility);
            nbLevel -= agility;
            return agility;
        } catch (AbilityTooMuchExceptions e) {
            System.err.println("ATTENTION! le total de votre force et de votre agilité dépasse le niveau de votre personnage ");
        }   return chooseAgility(type);
    }

    /** Demande au joueur de choisir l'intelligence de son personnage
     * dépasse celui du njoueur
     * @return Intelligence of Character
     */
    public int chooseIntelligence(Personnages type){
        try {
            System.out.println("Intelligence du personnage ?");
            int intelligence = sc.nextInt();
            type.setIntelligence(intelligence);
            this.levelTest(intelligence);
            return intelligence;
        } catch (AbilityTooMuchExceptions e) {
            System.err.println("ATTENTION ! la somme de votre force, agilité et intelligence dépasse le niveau de votre personnage ");
        }
        return chooseIntelligence(type);
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
