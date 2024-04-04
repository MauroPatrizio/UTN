package Ej2;

public class Rogue extends BaseChar{
    private float critRate;

    public Rogue(String name) {
        super(name);
        attack = 100 * level;
        defense = 50 * level;
        hp = 1000 * level;
        mp = 300 * level;
        level = 1;
        critRate = (int) (2 * (level*0.7));
    }

    @Override
    public int attack() {
        return (attack*2);
    }

    @Override
    public int defense() {
        return (int) (defense*0.9);
    }
}
