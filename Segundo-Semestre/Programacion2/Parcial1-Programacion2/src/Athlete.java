public class Athlete extends Person implements Contract {

    private double height;
    private int age;
    private double weight;

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int getDni() {
        return super.getDni();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double calculcalIMC() {
        return  weight / Math.pow(height, 2);
    }

    @Override
    public boolean extraWeight() {
        return calculcalIMC()>25;
    }

    @Override
    public double takePulses() {
        return 0;
    }

    @Override
    public String toString() {
        return "height=" + height +
                ", age=" + age +
                ", weight=" + weight;
    }
}
