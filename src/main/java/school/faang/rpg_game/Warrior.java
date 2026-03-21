package school.faang.rpg_game;

public class Warrior extends Character {
    private static final Integer POWER = 10;
    private static final Integer AGILITY = 5;
    private static final Integer INTELLECT = 3;

    public Warrior(String name) {
        super(name, POWER, AGILITY, INTELLECT);
    }

    @Override
    public void attack(Character opponent) {
        setHealth_point(opponent, getPower());
    }
}
