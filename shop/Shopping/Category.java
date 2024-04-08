package lessColl.shop.Shopping;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product>products;

    public Category(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String formatedToString(ArrayList<Product>p){
        int maxNameLength = 0;
        int maxCategNameLenght = 0;
        for (int i =0;i<p.size();i++) {
            if (p.get(i).getName().length() > maxNameLength) {
                maxNameLength = p.get(i).getName().length();
            }
        }
        return String.format("%-" + maxNameLength, name);
    }

    @Override
    public String toString(){
        return getName();
    }
}
