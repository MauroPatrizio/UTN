public abstract class Vehicle {
    protected String color;
    protected int wheels;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract int getWheels();

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

}
