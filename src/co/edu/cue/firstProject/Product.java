package co.edu.cue.firstProject;

public class Product {
    public String name;
    public double value;
    private int amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Product(String name, double value, int amount) {
        this.name = name;
        this.value = value;
        this.amount = amount;
    }
}
