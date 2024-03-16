public class Motorcycle extends Bicycle{
    private float speed;
    private int displacement;

    public Motorcycle() {
    }

    public Motorcycle(float speed, int displacement) {
        this.speed = speed;
        this.displacement = displacement;
    }

    public Motorcycle(String type, float speed, int displacement) {
        super(type);
        this.speed = speed;
        this.displacement = displacement;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "speed=" + speed +
                ", displacement=" + displacement +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", wheeels=" + wheeels +
                '}';
    }
}
