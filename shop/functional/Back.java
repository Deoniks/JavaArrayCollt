package lessColl.shop.functional;

import lessColl.shop.Shopping.Basket;
import lessColl.shop.Shopping.Category;
import lessColl.shop.Shopping.Product;
import lessColl.shop.Users.User;

import java.util.*;

public interface Back {

    ArrayList<Product> products = new ArrayList<>();
    Map<String, List<Product>>categories = new HashMap<>();
    LinkedList<User>users = new LinkedList<>();
    Basket baskets = new Basket();

    default void setProducts(){ // add product's
        Product[] p = new Product[10];
        p[0] = new Product("Юбка",1450,4.3);
        p[1] = new Product("Шарф",599,3.3);
        p[2] = new Product("Рубашка",950,2.4);
        p[3] = new Product("Кофта",2050,4.0);
        p[4] = new Product("Джинсы",1450,5.0);
        p[5] = new Product("Брюки",3550,3.5);
        p[6] = new Product("Шорты",1750,2.2);
        p[7] = new Product("Платье",5950,5.5);
        p[8] = new Product("Блузки",3450,4.5);
        p[9] = new Product("Футболки",550,3.0);
        for(int i =0; i<p.length;i++){
            products.add(p[i]);
        }
    }
    default void setCategory(){
         // add category
         //add product for man
        List<Product>man = new ArrayList<>();
        man.add(products.get(1));
        man.add(products.get(2));
        man.add(products.get(4));
        man.add(products.get(5));
        man.add(products.get(6));
        man.add(products.get(9));

        categories.put("Man",man); //// put to category man

        //add product for woman
        List<Product>woman = new ArrayList<>();
        woman.add(products.get(0));
        woman.add(products.get(1));
        woman.add(products.get(2));
        woman.add(products.get(3));
        woman.add(products.get(4));
        woman.add(products.get(5));
        woman.add(products.get(7));
        woman.add(products.get(8));

        categories.put("Woman",woman); // put to category woman
    }
    default void setUsers(){ // add user's
        User[] u = new User[4];
        u[0] = new User("buyer","buy",baskets);
        u[1] = new User("user","user",baskets);
        u[2] = new User("Benny","Girl",baskets);
        u[3] = new User("Manny","boy",baskets);
        for(int i =0; i<u.length;i++){
            users.add(u[i]);
        }
    }
    default void menuGetAllProduct(){

    }
    default void menuGetCategory(){

    }
}
