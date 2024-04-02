package lessColl.Student;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student {

    private String name;
    private String group;
    private int course;
    private int grade;
    static ArrayList<Student>students = new ArrayList<>();



    public Student(){students();}
    public Student(String name, String group, int course, int grade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public void students(){
        Student []s = new Student[6];
        s[0] = new Student("Dasha","Informatics",1,5);
        s[1] = new Student("Natali","Economy",3,3);
        s[2] = new Student("Aslan","Informatics",5,2);
        s[3] = new Student("Michael","Philosophy",2,4);
        s[4] = new Student("Leonard","Economy",4,2);
        s[5] = new Student("Dias","Economy",3,5);

        for(int i =0;i<s.length;i++){
            students.add(s[i]);
        }
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void expelStudent(){ //Понимаю что тут надо везде проставить параметром метода - список студетов... Но у меня есть НО, поэтому сделаю это позже
        for (int i =0;i<students.size();i++){
            if(students.get(i).grade < 3){ // так лучше не делать
                students.remove(i);
                i--;
            }
        }
    }

    public void removeAllStudent(){
        for(int i = students.size(); i>0;i--){
            students.remove(i-1);
        }
    }
    public void nextCourse(){
        for (int i =0;i<students.size();i++) {
            if (students.get(i).grade >= 3) {
                students.get(i).course++;
            }
        }
    }

    public void printStudents(ArrayList<Student> students, int course){
        for (int i = 0; i<students.size();i++){
            if(students.get(i).course == course) {
                System.out.println(students.get(i).name + ", " + students.get(i).course);
            }
        }
    }
    @Override
    public String toString(){
        return name+", "+group+ ", " + course + ", " + grade;
    }


}
