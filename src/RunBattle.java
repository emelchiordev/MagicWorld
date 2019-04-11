public class RunBattle {

    public void initBattle(){

        // Création du joueur et du personnage

        PersonnagesMaker character1 = new PersonnagesMaker();
        Player Joueur1 = new Player(character1.chooseCharacter(1),"Joueur1");

        PersonnagesMaker character2 = new PersonnagesMaker();
        Player Joueur2 = new Player(character2.chooseCharacter(2),"Joueur2");
    }
    public void battleSart(){

    }
}
