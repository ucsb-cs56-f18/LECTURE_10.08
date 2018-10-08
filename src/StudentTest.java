import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class StudentTest {
	

    @Test
    public void test_construct_student() {
		Student cg = new Student("Chris","Gaucho",1234567);
		assertEquals("Chris",cg.getFirstName());
    }

    
}
