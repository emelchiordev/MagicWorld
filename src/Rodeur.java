public class Rodeur extends Personnages{
    public Rodeur() {
    }

    public Rodeur(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    /**
     * Lance une attaque tir à l'arc
     * @param player1 est le personnage qui lance l'attaque
     * @param player2 est le personnage qui subit les dommages
     * Les dommages infligés sont égaux à l'agilité du Rôdeur
     */
    @Override
    public void basicAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Tir à l'arc et inflige "+getAgility()+" dommages" );
        System.out.println(player2.getNamePlayer()+" perd " + getAgility() + " points de vie");
        player2.setLifePlayer(player2.getLifePlayer()- getAgility());
        player2.deathSentence();
    }

    /**
     * Lance une attaque concentration
     * @param player1 est le personnage qui lance l'attaque
     * @param player2 est le personnage qui subit les dommages
     * Aucun joueur ne subit de dommages.
     * Le joueur lançant l'attaque gagne de l'agilité
     */
    @Override
    public void specialAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Concentration et inflige 0 dommages" );
        System.out.println(player1.getNamePlayer() +" gagne "+(getAgility()+(getLevel()/2))+ " en agilité");
        setAgility(getAgility()+(getLevel()/2));
        player2.deathSentence();
    }

    /**
     * Affiche une phrase de présentation pour le personnage
     */
    @Override
    public String toString(){
        return "Je suis le Rodeur ";
    }
}
