package Ej2;

public class Warrior extends BaseChar{
    private int armor;

    public Warrior(String name) {
        super(name);
        attack = 100 * level;
        defense = 50 * level;
        hp = 1000 * level;
        mp = 300 * level;
        level = 1;
        armor = 100 * level;
    }

    @Override
    public int attack() {
        return (int) (attack*1.3);
    }

    @Override
    public int defense() {
        return (int) (this.defense()*1.8*(armor*0.7));
    }
}
