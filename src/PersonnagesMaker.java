import java.util.Scanner;

public class PersonnagesMaker {
      Scanner sc = new Scanner(System.in);
      int nbLevel;     // Niveau du personnage

    /**
     * Processus de fabrication du personnage
     * Pose des questions à chaque joueur sur le choix du personnage et ses différents attributs
     * @return -> Le personnage choisi par le joueur
     */
    public Personnages sentenceMakeCharacter(Player player){
        System.out.println("Création du personnage du "+player.getNamePlayer());
        Personnages perso = this.chooseCharacter();
        this.chooseLevel(perso);
        this.chooseStrength(perso);
        this.chooseAgility(perso);
        this.chooseIntelligence(perso);
        this.definePlayerLife(player,perso);
        return perso;
    }

    /**
     * Permet de choisir le type du personnage : Guerrier, Rodeur ou Mage
     * @return le personnage choisi
     */
    public Personnages chooseCharacter() {
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage !)");
        int nbCharacter = sc.nextInt();
        Personnages typeCharacter=null;
        switch (nbCharacter) {
            case 1:
                typeCharacter = new Guerrier();
            break;
            case 2:
                typeCharacter = new Rodeur();
            break;
            case 3:
                typeCharacter = new Mage();
            break;
        }return typeCharacter;
    }

    /**
     * Permet de définir la vie du joueur
     * @param player -> le joeur où la vie est à définir
     * @param type -> Le personnage du joueur, pour récupérer son niveau
     */
    public void definePlayerLife(Player player, Personnages type){
        player.setLifePlayer(type.getLevel()*5); // on calcule la vie du personnage
        System.out.println(type.toString() + player.getNamePlayer() + " Niveau " +type.getLevel()+
                " je possède "+player.getLifePlayer()+" de vitalité, "+type.getStrength()+ " de force, "+
                type.getAgility()+" d'agilité, "+ type.getIntelligence()+" d'intelligence !");
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
        System.out.println("Force du personnage ?");
           try {
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
        System.out.println("Agilité du personnage ?");
        try {

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
        System.out.println("Intelligence du personnage ?");
        try {

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
