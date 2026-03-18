package school.faang.rpg_game;

import lombok.Data;

@Data
public abstract class Character {
    private static final Integer POWER = 5;
    private static final Integer AGILITY = 5;
    private static final Integer INTELLECT = 5;
    private static final Integer HP = 100;
    private static final Integer MIN_HP = 0;

    private final String name;
    private Integer power;
    private Integer agility;
    private Integer intellect;
    private Integer healthPoint;

    public Character(String name) {
        this(name, POWER, AGILITY, INTELLECT);
    }

    public Character(String name, Integer power, Integer agility, Integer intellect) {
        this.name = name;
        this.power = power;
        this.agility = agility;
        this.intellect = intellect;
        this.healthPoint = HP;
    }

    public abstract void attack(Character opponent);

    protected void setHealth_point(Character opponent, Integer damage) {
        opponent.healthPoint = opponent.healthPoint - Math.min(damage, opponent.healthPoint);
    }

    public void printStats() {
        System.out.printf("%s's health is %d\n", this.name, this.healthPoint);
    }
}
