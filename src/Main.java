import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Student>lists=new ArrayList<Student>();
        generateStudents(lists);
        Collections.sort(lists);
        printStudentsList(lists);

        System.out.println("_______________________");

        AgeComparator comparator=new AgeComparator();
        Collections.sort(lists,comparator);
        printStudentsList(lists);
    }

    private static void printStudentsList(List<Student> lists) {
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }

    public static void generateStudents(List<Student> lists){
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
    }
}