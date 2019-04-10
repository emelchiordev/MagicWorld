public class Mage extends Personnages {
    public Mage() {
    }

    public Mage(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    @Override
    public String toString() {
        return "Abracadabra je suis le Mage ";
    }
}
