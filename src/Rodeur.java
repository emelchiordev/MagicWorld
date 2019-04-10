public class Rodeur extends Personnages{
    public Rodeur() {
    }

    public Rodeur(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }

    @Override
    public String toString(){
        return "Je suis le Rodeur ";
    }
}
