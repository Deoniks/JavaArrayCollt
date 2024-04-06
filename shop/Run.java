package lessColl.shop;

import lessColl.shop.Shopping.Basket;
import lessColl.shop.Shopping.Product;
import lessColl.shop.Users.User;
import lessColl.shop.functional.Front;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Run {
    private static Scanner scan = new Scanner(System.in);
    private static Front f = new Front();

    public static void main(String[] args) {
        System.out.println("Please enter login");
        String login = scan.nextLine();

        System.out.println("Please enter password");
        String password = scan.nextLine();

        f.authorization(login,password);
        if(f.getInAuthorization()){
            f.menu();
        }
    }

}
