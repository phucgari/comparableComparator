import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void generateStudents() {
        List<Student> students=new LinkedList<>();
        Main.generateStudents(students);

        String result = students.get(0).toString();
        String expected="Student@name=Kien,age=30,address=HT";
        assertEquals(result,expected);

        result = students.get(1).toString();
        expected="Student@name=Nam,age=26,address=HN";
        assertEquals(result,expected);
    }
}