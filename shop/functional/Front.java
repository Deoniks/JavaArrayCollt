package lessColl.shop.functional;

public class Front implements Back {

    public void authorization(){

        setProducts();
        setUsers();
        if(users.get(1).getLogin().equals("user")){
            users.get(1).addToUsersCart(products.get(2));
        }
        if(users.get(2).getLogin().equals("Benny")){
            users.get(1).addToUsersCart(products.get(3));
        }
        System.out.println(users.get(1).getUsersCart());
    }
}
