package school.faang.rpg_game;

import lombok.Data;

@Data
public class Character {
    private String name;
    private Integer power;
    private Integer agility;
    private Integer intellect;
    private Integer health_point;

    public Character(String name) {
        this.name = name;
        this.power = 5;
        this.agility = 5;
        this.intellect = 5;
        this.health_point = 100;
    }

    public Character(String name, Integer power, Integer agility, Integer intellect) {
        this.name = name;
        this.power = power;
        this.agility = agility;
        this.intellect = intellect;
        this.health_point = 100;
    }

    public void attack(Character opponent) {
    }

    public void setHealth_point(Character opponent, Integer damage) {
        if (opponent.health_point-damage < 0) {
            opponent.health_point = 0;
        } else {
            opponent.health_point -= damage;
        }
    }

    public void printStats(){
        System.out.println("Name: " + this.name + " "
                + "Power: " + this.power + " "
                + "Agility: " + this.agility + " "
                + "Intellect: " + this.intellect + " "
                + "HP: " + this.health_point);
    }
}
