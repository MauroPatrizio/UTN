package Ej2;

public abstract class BaseChar implements Character{
    protected int attack, defense, hp, mp, level;
    protected String name;

    public BaseChar(String name) {
        this.attack = 0;
        this.defense = 0;
        this.hp = 0;
        this.mp = 0;
        this.level = 0;
        this.name = name;
    }

}
