package Ej2;

public class Mage extends BaseChar{
    private int intelligence;

    public Mage(String name) {
        super(name);
        attack = 100 * level;
        defense = 50 * level;
        hp = 1000 * level;
        mp = 300 * level;
        level = 1;
        intelligence = 100 * level;
    }

    @Override
    public int attack() {
        return (int) (intelligence*1.5);
    }

    @Override
    public int defense() {
        return (int) (defense*1.1);
    }
}
