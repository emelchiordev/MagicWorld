public class Guerrier extends Personnages {
    public Guerrier() {
    }

    public Guerrier(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    // Coup d'épée
    @Override
    public void basicAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Coup d'épée et inflige "+getStrength()+" dommages" );
        System.out.println(player2.getNamePlayer()+ " perd "+ getStrength()+" points de vie");
        player2.setLifePlayer(player2.getLifePlayer()- getStrength());
        player2.deathSentence();
    }

    // Coup de rage
    @Override
    public void specialAttack(Player player1, Player player2){
        System.out.println(player1.getNamePlayer()+ " utilise : Coup de Rage et inflige "+getStrength()*2+" dommages" );
        System.out.println(player2.getNamePlayer()+ " perd "+getStrength()*2+ " points de vie");
        player2.setLifePlayer(player2.getLifePlayer()-getStrength()*2);
        player2.deathSentence();
        System.out.println(player1.getNamePlayer()+ " perd "+getStrength()/2+ " points de vie");
        player1.setLifePlayer(player1.getLifePlayer()-getStrength()/2);

    }

    @Override
    public String toString() {
       return "Woarg je suis le Guerrier ";
    }
}
