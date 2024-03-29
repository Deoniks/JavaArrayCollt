package lessColl.Student;

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
        student.printStudents(student.getStudents(),4);

        System.out.println("______________________");
        student.removeAllStudent();
        for (int i=0;i<student.getStudents().size();i++){
            System.out.println(student.getStudents().get(i));
        }
        System.out.println("Not element");
    }
}
