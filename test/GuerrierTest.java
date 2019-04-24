import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {

    @Test
    void When_Player1UseBasicAttackGuerrierOnPlayer2_Then_Player2LooseLife() {
        Guerrier guerrierPlayer1 = new Guerrier(10,0,10,0,0);
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        player2.setLifePlayer(100);
        guerrierPlayer1.basicAttack(player1,player2);
        assertEquals(90,player2.getLifePlayer());

    }

    @Test
    void When_Player1UseSpecialAttackGuerrierOnplayer2_Then_Player2AndPlayer1LooseLife() {
        Guerrier guerrierPlayer1 = new Guerrier(10,0,10,0,0);
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        player1.setLifePlayer(100);
        player2.setLifePlayer(100);
        guerrierPlayer1.specialAttack(player1,player2);
        assertEquals(80,player2.getLifePlayer());
        assertEquals(95,player1.getLifePlayer());
    }
}