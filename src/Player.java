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
}
