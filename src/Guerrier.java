public class Guerrier extends Personnages {
    public Guerrier() {
    }

    public Guerrier(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    /**
     * Lance une attaque coup d'épée
     * @param player1 est le personnage qui lance l'attaque
     * @param player2 est le personnage qui subit les dommages.
     * Les dommages subits par l'adversaire sont égales à la force du player1
     *
     */
    @Override
    public void basicAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Coup d'épée et inflige "+getStrength()+" dommages" );
        System.out.println(player2.getNamePlayer()+ " perd "+ getStrength()+" points de vie");
        player2.setLifePlayer(player2.getLifePlayer()- getStrength());
        player2.deathSentence();
    }

    /**
     * Lance une attaque coup de rage
     * @param player1 est le personnage qui lance l'attaque
     * @param player2 est le personnage qui subit les dommages
     * Les dommages subits par l'adversaire sont égales à la force du player1 x2.
     * Le joueur qui lance cette attaque perd des points de vie.
     */
    @Override
    public void specialAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Coup de Rage et inflige "+getStrength()*2+" dommages" );
        System.out.println(player2.getNamePlayer()+ " perd "+getStrength()*2+ " points de vie");
        player2.setLifePlayer(player2.getLifePlayer()-getStrength()*2);
        player2.deathSentence();
        System.out.println(player1.getNamePlayer()+ " perd "+getStrength()/2+ " points de vie");
        player1.setLifePlayer(player1.getLifePlayer()-getStrength()/2);

    }

    /**
     * Affiche une phrase de présentation pour le personnage
     */
    @Override
    public String toString() {
       return "Woarg je suis le Guerrier ";
    }
}
