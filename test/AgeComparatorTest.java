import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeComparatorTest {
    Student adam=new Student("adam",20,"ground");
    Student eva=new Student("eva",15,"sky");
    @Test
    void comparator(){
        AgeComparator comparator=new AgeComparator();
        int result=comparator.compare(adam,eva);
        int expected=5;
        assertEquals(expected,result);
    }
}