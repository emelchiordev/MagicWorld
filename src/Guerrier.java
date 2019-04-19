public class Guerrier extends Personnages {
    public Guerrier() {
    }

    public Guerrier(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    // Coup d'épée
    @Override
    public int basicAttack(Player player){
        System.out.println(player.getNamePlayer()+ " utilise : Coup d'épée et inflige "+this.strength+" à l'adversaire" );
        return this.getStrength();
    }

    // Coup de rage
    @Override
    public int specialAttack(Player player){
        System.out.println(player.getNamePlayer()+ " utilise : Coup de Rage et inflige "+this.strength*2+" à l'adversaire" );
        this.setStrength(this.getStrength()/2);
    return this.getStrength()*2;
    }

    @Override
    public String toString() {
       return "Woarg je suis le Guerrier ";
    }
}
