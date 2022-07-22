package co.edu.cue.firstProject;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double total=0;
        Product productos[];
        Bill bill1=new Bill();
        for (int i = 0; i < 2; i++) {
            String name = JOptionPane.showInputDialog("Write the name of the product");
            double price = Integer.parseInt(JOptionPane.showInputDialog("Write the price of the product"));
            int amount = Integer.parseInt(JOptionPane.showInputDialog("Write the amount"));
            Product product1 = new Product(name, price, amount);
            total+=price*amount;
        }
    }
}