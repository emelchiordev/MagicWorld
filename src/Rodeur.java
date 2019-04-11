public class Rodeur extends Personnages{
    public Rodeur() {
    }

    public Rodeur(int level, int life, int strength, int agility, int intelligence) {
        super(level, life, strength, agility, intelligence);
    }
    @Override
    public int basicAttack(){
    return 0;
    }
    @Override
    public int specialAttack(){
    return 0;
    }

    @Override
    public String toString(){
        return "Je suis le Rodeur ";
    }
}
