package lessColl.Student;

import java.util.LinkedList;

public class Student {

    private String name;
    private String group;
    private int course;
    private int grade;
    static LinkedList<Student>students = new LinkedList<>();

    public static void main(String[] args) {
        Students();
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }
        expelStudent();
        nextCourse();
        System.out.println("________________________");
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i));
        }

        System.out.println("______________________");
        printStudents(students,4);
    }

    public Student(){Students();}
    public Student(String name, String group, int course, int grade){
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public static void Students(){
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

    public static void expelStudent(){
        for (int i =0;i<students.size();i++){
            if(students.get(i).grade < 3){
                students.remove(i);
            }
        }
    }
    public static void nextCourse(){
        for (int i =0;i<students.size();i++) {
            if (students.get(i).grade >= 3) {
                students.get(i).course++;
            }
        }
    }

    public static void printStudents(LinkedList<Student> students, int course){
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
