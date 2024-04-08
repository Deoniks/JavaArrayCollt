package lessColl.shop.functional;

import lessColl.shop.Shopping.Basket;
import lessColl.shop.Shopping.Category;
import lessColl.shop.Shopping.Product;
import lessColl.shop.Users.User;

import java.time.LocalDate;
import java.util.*;

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
        setUsers();
        setProducts();
        setCategory();
        while (inAuthorization){
            System.out.println("1.Вывести все товары\n2.Вывести товары из категории\n3.Купить Товар\n4.Выйти...");

            while (!scan.hasNextInt()){
                System.err.println("Wrong element");
                scan.nextLine();
            }
            int i = scan.nextInt();
            switch (i){
                case 1-> {
                    System.out.println("Продукт     Цена    Рейтинг\n____________________________");
                    Iterator<Product>iterateProduct = products.iterator();
                    while (iterateProduct.hasNext()){
                        Product p = iterateProduct.next();
                        System.out.println(p.formatedToString(products));
                    }
                    System.out.println("________________________________");
                }
                case 2-> {
                    choiceCategory();
                }
                case 3-> {
                    buyProduct();
                }
                case 4->{
                    System.out.println("Good buy");
                    inAuthorization = false;
                }
            }
        }
    }

    public void choiceCategory(){
        System.out.println("1.Man\n2.Woman");
        while (!scan.hasNextInt()){
            scan.nextLine();
        }
        int ch = scan.nextInt();

        Iterator<Map.Entry<String,List<Product>>>iterateCategory = categories.entrySet().iterator();
        while (iterateCategory.hasNext()){
            System.out.println("Продукт     Цена    Рейтинг    Категория\n______________________________________");
            Map.Entry<String, List<Product>> c = iterateCategory.next();
            String key = c.getKey();
            if(ch == 1 && key.equals("Man")){
                List<Product> value = c.getValue();
                for (Product product : value) {
                    System.out.println(product.formatedToString(products) + "  " +  key);
                }
                break;
            } else if (ch == 2 && key.equals("Woman")) {
                List<Product> value = c.getValue();
                for (Product product : value) {
                    System.out.println(product.formatedToString(products) + "  " +  key);
                }
                break;
            }
        }
        System.out.println("________________");
    }
    public void buyProduct(){

        Basket bask = new Basket();
        System.out.println("Пожалуйста выбирите товар(введите индекс товара)");
        while (!scan.hasNextInt()){
            System.err.println("It's not int element");
            scan.nextLine();
        }
        int index = scan.nextInt();
        scan.nextLine();

        try{
            System.out.println("Для продолжения покупки введите пароль"); // Ну тип доп. подтверждение пользователя, от мошеников получивших доступ к акку с привязанной картой...
            String password = scan.nextLine();
            Iterator<User>iteratePassword = users.iterator();
            while (iteratePassword.hasNext()) {
                String pasw = iteratePassword.next().getPassword();
                if (pasw.equals(password)) {
                    int exit= 1;
                    do {
                        if (index == products.get(index).getIndex()) {
                            bask.addBasket(products.get(index));
                            System.out.println("Желаете ли продолжить покупки?\n(1-да / 2-нет");
                            while (!scan.hasNextInt()){
                                System.out.println();
                                scan.nextLine();
                            }
                            exit = scan.nextInt();
                            if(exit == 1){
                                System.out.println("Пожалуйста выбирите товар(введите индекс товара)");
                                while (!scan.hasNextInt()){
                                    System.err.println("It's not int element");
                                    scan.nextLine();
                                }
                                index = scan.nextInt();
                            }
                        }
                    }while (exit == 1);
                    for (int i=0;i<users.size();i++){
                        if(users.get(i).getPassword().equals(password)){
                            users.get(i).setUsersCart(bask);
                            LocalDate localDate = LocalDate.now();
                            System.out.println("Date buy :"+localDate + "\n"+users.get(i).getUsersCart().toString());
                            break;
                        }
                    }
                    break;
                } else if (!iteratePassword.hasNext()) {
                    System.err.println("Wrong password");
                    inAuthorization = false;
                }
            }
        }catch (IndexOutOfBoundsException ex){
            System.err.println("It's not find index");
        }
    }

    public void test(){
        Iterator<Product>iterateProduct = products.iterator();
        while (iterateProduct.hasNext()){
            Product p = iterateProduct.next();
            System.out.println(p);
        }
    }
    public void test2(){
        setProducts();
        setCategory();
        System.out.println("1.Man\n2.Woman");
        while (!scan.hasNextInt()){
            scan.nextLine();
        }
        int ch = scan.nextInt();
        Iterator<Map.Entry<String,List<Product>>>iterateCategory = categories.entrySet().iterator();
        while (iterateCategory.hasNext()){
            System.out.println("Продукт     Цена    Категория    Категория\n____________________________");
            Map.Entry<String, List<Product>> c = iterateCategory.next();
            String key = c.getKey();
            if(ch == 1 && key.equals("Man")){
                List<Product> value = c.getValue();
                for (Product product : value) {
                    System.out.println(product.formatedToString(products) + "  " +  key);
                }
                break;
            }
        }
    }
    public void test3(){}


}
