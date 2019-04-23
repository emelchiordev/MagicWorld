public class Rodeur extends Personnages{
    public Rodeur() {
    }

    public Rodeur(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }
    @Override
    public void basicAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Tir à l'arc et inflige "+getAgility()+" dommages" );
        System.out.println(player2.getNamePlayer()+" perd " + getAgility() + " points de vie");
        player2.setLifePlayer(player2.getLifePlayer()-getAgility());
        player2.deathSentence();
    }
    @Override
    public void specialAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Tir à l'arc et inflige 0 dommages" );
        System.out.println(player1.getNamePlayer() +" gagne "+ getAgility()+(getLevel()/2)+ " en agilité");
        setAgility(getAgility()+(getLevel()/2));
        player2.deathSentence();
    }

    @Override
    public String toString(){
        return "Je suis le Rodeur ";
    }
}
