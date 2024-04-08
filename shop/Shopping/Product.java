package lessColl.shop.Shopping;

import lessColl.shop.Shopping.Category;

import java.util.ArrayList;

public class Product {
    private String name;
    private int price;
    private double rating;
    private int index;
    private Category category = new Category();

    public Product(){}

    public Product(int index, String name, int price, double rating){
        this.index = index;
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

    public int getIndex(){
        return index;
    }


    @Override
    public String toString(){
        return index + " , " + name + "   "+  "$" + price + "      " + rating ;
    }

    public String formatedToString(ArrayList<Product>p){
        int maxNameLength = 0;
        int maxPriceLength = 5;//Тут можно взять int to string но... Допустим оно есть:)

        for (int i =0;i<p.size();i++) {
            if (p.get(i).getName().length() > maxNameLength) {
                maxNameLength = p.get(i).getName().length();
            }
        }

        return String.format("%s "+"%-" + maxNameLength + "s price=%-" + maxPriceLength+ "s rate=%.1f",index, name, price, rating);
    }


}
