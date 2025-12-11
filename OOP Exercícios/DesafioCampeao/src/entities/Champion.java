package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(int armor, int attack, int life, String name) {
        this.armor = armor;
        this.attack = attack;
        this.life = life;
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void takeDamage()
}
