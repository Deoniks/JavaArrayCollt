package lessColl.shop;

import lessColl.shop.Shopping.Basket;
import lessColl.shop.Shopping.Product;
import lessColl.shop.Users.User;
import lessColl.shop.functional.Front;

import java.util.ArrayList;
import java.util.LinkedList;

public class Run {

    private static LinkedList<Product>products = new LinkedList<>();
    private static LinkedList<User>users = new LinkedList<>();
    private static ArrayList<Basket>baskets = new ArrayList<>();
    private static Front f = new Front();

    public static void main(String[] args) {
       f.authorization();
    }

    private static void setProducts(){
        Product[] p = new Product[10];
        p[0] = new Product("Milk",450,4.3);
        p[1] = new Product("Sugar",399,3.3);
        p[2] = new Product("Salt",250,2.4);
        p[3] = new Product("Cheese",4050,4.0);
        p[4] = new Product("Butter",1450,5.0);
        p[5] = new Product("Cream",550,3.0);
        p[6] = new Product("Cookie",750,2.2);
        p[7] = new Product("Chocolate",950,1.5);
        p[8] = new Product("Waffles",450,4.5);
        p[9] = new Product("Cake",4550,5.0);
        for(int i =0; i<p.length;i++){
            products.add(p[i]);
        }
    }
    private static void setUsers(){
        User[] u = new User[4];
        u[0] = new User("buyer","buy");
        u[1] = new User("user","user");
        u[2] = new User("Benny","Girl");
        u[3] = new User("Manny","boy");
        for(int i =0; i<u.length;i++){
            users.add(u[i]);
        }
    }
    private static void setBuy(){

    }
}
