import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RodeurTest {

    @Test
    void When_RodeurOfPlayer1UseBasicAttackOnPersoPlayer2_Then_Player2looseLife() {
        Personnages persoPlayer1 = new Rodeur(10,0,5,2,3);
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        player2.setLifePlayer(100);
        persoPlayer1.basicAttack(player1,player2);
        assertEquals(98, player2.getLifePlayer());

    }

    @Test
    void When_RodeurOfPlayer1UseSpecialAttackOnPersoPlayer2_Then_Player1getAgility() {
        Personnages persoPlayer1 = new Rodeur(10,0,5,2,3);
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        persoPlayer1.specialAttack(player1,player2);
        assertEquals(7, persoPlayer1.getAgility());
    }
}