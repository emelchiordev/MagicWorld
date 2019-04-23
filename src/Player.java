public class Player {
    protected String namePlayer;
    protected int lifePlayer;

    public Player(String namePlayer) {
        this.lifePlayer = 0;
        this.namePlayer = namePlayer;
    }


    public int getLifePlayer() {
        return lifePlayer;
    }

    public void setLifePlayer(int lifePlayer) {
        this.lifePlayer = lifePlayer;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public void chooseAction(Player player2){
        System.out.println(this.getNamePlayer()+" ("+this.getLifePlayer()+ " Vitalité) "+ "Veuillez choisir votre action : (1 - Attaque basique, 2 - Attaque spéciale :");

    }
    public void deathSentence(){
        if (this.getLifePlayer()<=0){
            System.out.println(this.getNamePlayer() + " est mort");
        }
    }
}
