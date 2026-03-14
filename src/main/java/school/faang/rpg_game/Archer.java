package school.faang.rpg_game;

public class Archer extends Character{
    public Archer(String name) {
        super(name, 3, 10, 5);
    }

    @Override
    public void attack(Character opponent) {
        setHealth_point(opponent, getAgility());
    }
}

