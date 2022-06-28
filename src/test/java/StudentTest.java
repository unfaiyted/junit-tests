import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    Student fer;  // student with id = 1, name = "Fer"
    /**
     * > The `setup()` function is called before each test
     */
    @Before
    public void setup() {
        fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
    }

    /**
     * > This function tests that the student object is created correctly
     */
    @Test
    public void testCreateStudent(){
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }

    /**
     * It asserts that the student's id is 1, the name is "fer", and that the student has 2 grades
     */
    @Test
    public void testStudentFields(){
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(2, fer.getGrades().size());
    }


    /**
     * The function tests that the grades are added to the list of grades
     */
    @Test
    public void testAddGrade(){
        assertSame(100, fer.getGrades().get(0));
        assertSame(80, fer.getGrades().get(1));
    }

    /**
     * The function `testAverageGrade` tests that the average grade of the student is 90
     */
    @Test
    public void testAverageGrade(){
        assertEquals(90, fer.getGradeAverage(), 0);
    }



    @Test
    public void testUpdateGrade() {
        // modify the value of an existing grade correctly

        // what grade to update
        // the new value

        fer.updateGrade(1, 100);
        int grade = fer.getGrades().get(1);

        assertEquals(100, grade,0);


    }

    @Test
    public void testDeleteGrade() {

    }


}