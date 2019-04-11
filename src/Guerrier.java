public class Guerrier extends Personnages {
    public Guerrier() {
    }

    public Guerrier(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    // Coup d'épée
    @Override
    public int basicAttack(){
    return this.getStrength();
    }

    // Coup de rage
    @Override
    public int specialAttack(){
    return this.getStrength()*2;
    }

    @Override
    public String toString() {
       return "Woarg je suis le Guerrier ";
    }
}
