package lessColl;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionLesson {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*for(int i =0; i<oneQuesion().size();i++){
            System.out.println(oneQuesion().get(i));
        } firs prog*/

        //twoQuestion();
        //threeQuestion(oneQuesion(),"White");
        //fourQuestion(oneQuesion(),1);
        //fiveQuestion(oneQuesion(),2);
    }

    public static ArrayList<String> oneQuesion(){
        ArrayList<String> color = new ArrayList<>();
        color.add(0,"Red"); //
        color.add(1,"Green");
        color.add(2,"Blue");

        return color;
    }
    public static void twoQuestion(){
        Iterator<String> iterationColor = oneQuesion().listIterator();
        while (iterationColor.hasNext()){
            System.out.println(iterationColor.next());
        }
    }
    public static void threeQuestion(ArrayList<String>color, String clr){
        color.add(0,clr);
        Iterator<String>iteratorColor = color.listIterator();
        while (iteratorColor.hasNext()){
            System.out.println(iteratorColor.next());
        }
    }
    public static void fourQuestion(ArrayList<String>color, int index){
        System.out.println(color.get(index));
    }
    public static void fiveQuestion(ArrayList<String>color, int index){
        color.set(index,"Purple");
    }
    public static void sixQuestion(ArrayList<String>color, int index){
        color.remove(index);
    }
    public static void sevenQuestion(ArrayList<String>color, String clr){
        for(int i=0;i<color.size();i++){//С целочисленным так же сработает
            if(color.get(i).equals(clr)){
                System.out.println(color.get(i));
            }
        }
    }
    public static void eightQuestion(){
        Collections.sort(oneQuesion());
    }
    public static void nineQuestion(ArrayList<String>color){
        ArrayList<String>copyColor = new ArrayList<>();//можно было сразу тут объявить ещё
        copyColor.addAll(color);
    }
}
