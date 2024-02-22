package lessColl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionLesson {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*for(int i =0; i<oneQuesion().size();i++){
            System.out.println(oneQuesion().get(i));
        } firs prog*/

        twoQuestion();
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
}
