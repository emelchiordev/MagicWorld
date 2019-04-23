public class Mage extends Personnages {
    public Mage() {
    }

    public Mage(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    @Override
    public void basicAttack(Player player1, Player player2,Personnages perso){
        System.out.println(player1.getNamePlayer()+ " utilise : Boule de feu et inflige "+perso.getIntelligence()+" dommages" );
        System.out.println(player2.getNamePlayer()+" perd " + perso.getIntelligence() + " points de vie");
        player2.setLifePlayer(player2.getLifePlayer()-perso.getIntelligence());


    }
    @Override
    public void specialAttack(Player player1, Player player2,Personnages perso){
        System.out.println(player1.getNamePlayer()+ " utilise : Soin et gagne "+perso.getIntelligence()*2+" points de vie" );
        player1.setLifePlayer(player1.getLifePlayer()+perso.getIntelligence()*2);
        int lifePlayer = 5*level;
        if (player1.getLifePlayer()> lifePlayer){
            player1.setLifePlayer(lifePlayer);
        }

    }
    @Override
    public String toString() {
        return "Abracadabra je suis le Mage ";
    }
}
