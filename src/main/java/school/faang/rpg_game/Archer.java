package school.faang.rpg_game;

public class Archer extends Character {
    private static final Integer POWER = 3;
    private static final Integer AGILITY = 10;
    private static final Integer INTELLECT = 5;

    public Archer(String name) {
        super(name, POWER, AGILITY, INTELLECT);
    }

    @Override
    public void attack(Character opponent) {
        setHealth_point(opponent, getAgility());
    }
}

