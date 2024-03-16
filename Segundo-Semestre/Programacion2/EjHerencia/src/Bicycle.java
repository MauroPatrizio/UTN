public class Bicycle extends Vehicle{
    protected String type;

    public Bicycle() {
    }

    public Bicycle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", wheeels=" + wheeels +
                '}';
    }
}
