package lessColl.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class run {

    public static void main(String[] args) {
        Student student = new Student();

        for (int i=0;i<student.getStudents().size();i++){
            System.out.println(student.getStudents().get(i));
        }
        student.expelStudent();
        student.nextCourse();
        System.out.println("________________________");
        for (int i=0;i<student.getStudents().size();i++){
            System.out.println(student.getStudents().get(i));
        }

        System.out.println("______________________");
        student.printStudents(student.getStudents(),2);

        System.out.println("______________________");
        student.removeAllStudent();
        for (int i=0;i<student.getStudents().size();i++){
            System.out.println(student.getStudents().get(i));
        }
        System.out.println("Not element");

        Set<String> c = new HashSet<>();
        c.add("col");
        c.add("tol");
        c.add("fol");
        c.add("lol");
        for (int i = 0; i<c.size();i++){
            System.out.println(c);
        }
        for (int i = 0;i<c.size();i++){
            if(c.contains("col")){
                c.remove("col");
            }
            if (c.contains("fol")) {
                c.remove("kfol");
            }
        }
        System.out.println("________________________________________");
        for (int i = 0; i<c.size();i++){
            System.out.println(c);
        }
    }
}
