public abstract class Personnages {
    protected int level;
    protected int life;
    protected int strength;
    protected int agility;
    protected int intelligence;

    public Personnages(int level, int life, int strength, int agility, int intelligence) {
        this.level = level;
        this.life = life;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }
    public Personnages(){
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * Lance une attaque basique
     * @param player1 est le personnage qui lance l'attaque
     * @param player2 est le personnage qui subit les dommages
     */
    public abstract void basicAttack(Player player1, Player player2);

    /**
     * Lance une attaque spéciale
     * @param player1 est le personnage qui lance l'attaque
     * @param player2 est le personnage qui subit les dommages
     */
    public abstract void specialAttack(Player player1, Player player2);
}
