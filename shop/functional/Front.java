package lessColl.shop.functional;

import lessColl.shop.Shopping.Category;
import lessColl.shop.Shopping.Product;
import lessColl.shop.Users.User;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Front implements Back {

    private static Scanner scan = new Scanner(System.in);
    private boolean inAuthorization = false;
    public void authorization(String login, String password){

        setUsers();
        Iterator<User>iterateLogin = users.iterator();
        Iterator<User>iteratePassword = users.iterator();

        while (iterateLogin.hasNext()){
            String l = iterateLogin.next().getLogin();
            if(l.equals(login)){
                while (iteratePassword.hasNext()){
                    String p = iteratePassword.next().getPassword();
                    if(p.equals(password)){
                        inAuthorization = true;
                        break;
                    }else if (!iteratePassword.hasNext()) {
                        System.err.println("Wrong login or password");
                    }
                }break;
            }else if(!iterateLogin.hasNext()) {
                System.err.println("Wrong login or password");
            }
        }
    }
    public boolean getInAuthorization(){return inAuthorization;}
    public void menu(){
        setProducts();
        while (inAuthorization){
            System.out.println("1.Вывести все товары\n2.Вывести товары из категории...");

            while (!scan.hasNextInt()){
                System.err.println("Wrong element");
                scan.nextLine();
            }
            int i = scan.nextInt();
            switch (i){
                case 1-> {
                    System.out.println("Продукт     Цена    Рейтинг\n____________________________");
                    Iterator<Map<String, List<Product>>>iterateProduct = products.iterator();
                    while (iterateProduct.hasNext()){
                        Product p = iterateProduct.next();
                        System.out.println(p.formatedToString(products));
                    }
                    System.out.println("________________");
                }
                case 2-> {
                    System.out.println("");
                    Iterator<Category>iterateProduct = categories.i;
                    while (iterateProduct.hasNext()){
                        Category c = iterateProduct.next();
                        System.out.println(c.formatedToString(products));
                    }
                    System.out.println("________________");
                }
            }
        }
    }

    public void choiceCategory(){
        System.out.println("1.Man\n2.Woman");
        while (!scan.hasNextInt());
        int i = scan.nextInt();
        switch (i){
            case 1->{}
            case 2->{}
        }
    }

    public void test(){
        Iterator<Product>iterateProduct = products.iterator();
        while (iterateProduct.hasNext()){
            Product p = iterateProduct.next();
            System.out.println(p);
        }
    }


}
