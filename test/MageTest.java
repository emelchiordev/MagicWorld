import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MageTest {

    @Test
    void When_PersoPlayer1UseBasicAttackOnPlayer2_Then_Player2LooseLife() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Rodeur persoPlayer1 = new Rodeur(10,0,5,3,2);
        player2.setLifePlayer(100);
        persoPlayer1.basicAttack(player1,player2);
        assertEquals(97,player2.getLifePlayer());

    }

    @Test
    void When_PersoPlayer1UseSpecialAttackOnPlayer2_Then_Player11RecoveryLife() {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Mage persoPlayer1 = new Mage(10,0,5,3,2);

        player1.setLifePlayer(2);
        persoPlayer1.specialAttack(player1,player2);
        assertEquals(6,player1.getLifePlayer());

        player1.setLifePlayer(49);
        persoPlayer1.specialAttack(player1,player2);
        assertEquals(50,player1.getLifePlayer());

    }

}