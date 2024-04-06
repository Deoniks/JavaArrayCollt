package lessColl.shop.Shopping;

import lessColl.shop.Shopping.Category;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private double rating;
    private Category category = new Category();

    public Product(){}

    public Product(String name, int price, double rating){
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String toString(){
        return name + "   "+  "$" + price + "      " + rating ;
    }

    public String formatedToString(ArrayList<Product>p){
        int maxNameLength = 0;
        for (int i =0;i<p.size();i++) {
            if (p.get(i).getName().length() > maxNameLength) {
                maxNameLength = p.get(i).getName().length();
            }
        }
        return String.format("%-" + maxNameLength + "s price=%d, rate=%.1f", name, price, rating);
    }
}
