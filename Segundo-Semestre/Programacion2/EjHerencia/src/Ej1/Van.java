package Ej1;

public class Van extends Car {
    private float load;

    public Van() {
    }

    public Van(float speed, int displacement, float load) {
        super(speed, displacement);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public String toString() {
        return "Ej1.Van{" +
                "load=" + load +
                ", speed=" + speed +
                ", displacement=" + displacement +
                ", color='" + color + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}