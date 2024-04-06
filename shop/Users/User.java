package lessColl.shop.Users;

import lessColl.shop.Shopping.Basket;
import lessColl.shop.Shopping.Product;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    private Basket usersCart;

    public User(String login, String password, Basket usersCart){
        this.login = login;
        this.password = password;
        this.usersCart = usersCart;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getUsersCart() {
        return usersCart;
    }
    public void setUsersCart(Basket usersCart){this.usersCart = usersCart;}

    public void addToUsersCart(Product p) {
        this.usersCart.addBasket(p);
    }
}
