public class Guerrier extends Personnages {
    public Guerrier() {
    }

    public Guerrier(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    @Override
    public String toString() {
       return "Woarg je suis le Guerrier ";
    }
}
