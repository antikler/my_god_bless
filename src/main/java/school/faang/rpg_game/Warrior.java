package school.faang.rpg_game;

public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 10, 5, 3);
    }

    @Override
    public void attack(Character opponent) {
        setHealth_point(opponent, getPower());
    }
}
