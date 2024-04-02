package lessColl.shop.Shopping;

import java.util.ArrayList;
import java.util.LinkedList;

public class Basket {
    private ArrayList<Product> products;
    public Basket(){
        this.products = new ArrayList<>();
    }
    public void addBasket(Product product){
        this.products.add(product);
    }
    @Override
    public String toString(){
        return products.toString();
    }
}
