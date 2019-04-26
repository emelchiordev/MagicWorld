import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonnagesMakerTest {


    @Test
    void When_levelOfGuerrierIs10_Then_PlayerLifeIs50() {
        Player player = new Player();
        Personnages guerrier = new Guerrier();
        guerrier.setLevel(10);
        PersonnagesMaker makeGuerrier = new PersonnagesMaker();
        makeGuerrier.definePlayerLife(player,guerrier);
        assertEquals(50,player.getLifePlayer());

    }
    @Test
    void When_TotalAbilitiesIsMoreHighOfLevelOfCharacter_Then_DisplayAbilityTooMuchExceptions() {
        PersonnagesMaker makeGuerrier = new PersonnagesMaker();
        makeGuerrier.nbLevel = 50;
        assertThrows(AbilityTooMuchExceptions.class, () -> makeGuerrier.levelTest(51));



    }
}