package school.faang.rpg_game;

public class Main {
    public static void main(String[] args) {
        Character npc = new Character("Lutic");
        npc.printStats();

        Warrior gerolt = new Warrior("Gerolt");
        Archer greenArrow = new Archer("Oliver Quinn");

        greenArrow.attack(gerolt);
        gerolt.attack(greenArrow);

        gerolt.printStats();
        greenArrow.printStats();
    }
}
