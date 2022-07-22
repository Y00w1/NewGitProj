package co.edu.cue.firstProject;

public class Bill {
    private int totValue;

    private Product products[];

    public int getTotValue() {
        return totValue;
    }

    public void setTotValue(int totValue) {
        this.totValue = totValue;
    }

    public Bill() {
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
