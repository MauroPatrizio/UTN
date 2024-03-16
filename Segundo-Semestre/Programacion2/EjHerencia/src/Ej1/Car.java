package Ej1;

public class Car extends Vehicle{
    protected float speed;
    protected int displacement;

    public Car() {
    }

    public Car(float speed, int displacement) {
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
    public int getWheels() {
        return 4;
    }

    @Override
    public String toString() {
        return "Ej1.Car{" +
                "speed=" + speed +
                ", displacement=" + displacement +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
