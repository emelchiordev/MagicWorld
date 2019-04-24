import java.util.Scanner;

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


    /**
     * Permet au joueur de choisir entre une attaque basique ou spéciale lors du combat
     * @param player1 le joueur qui lance l'attaque
     * @param player2 le joueur qui reçoit les dommages
     * @param perso le personnage qui est utilisé pour lancer l'attaque
     */
    public void chooseAction(Player player1, Player player2, Personnages perso){
        Scanner sc = new Scanner(System.in);
        System.out.println(this.getNamePlayer()+" ("+this.getLifePlayer()+ " Vitalité) "+ "Veuillez choisir votre action : (1 - Attaque basique, 2 - Attaque spéciale :");
        switch (sc.nextInt()) {
            case 1:
                perso.basicAttack(player1, player2);
                break;
            case 2:
                perso.specialAttack(player1, player2);
                break;
        }
    }

    /**
     * Affiche un message quand le personnage est mort
     *
     */
    public void deathSentence(){
        if (this.getLifePlayer()<=0){
            System.out.println(this.getNamePlayer() + " est mort");
        }
    }
}
