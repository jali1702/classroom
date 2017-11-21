import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import otherclasses.Classroom;
import otherclasses.Student;

public class ClassroomTest {

	ArrayList<Student> students = new ArrayList<Student>();
	Classroom classroom = new Classroom("Kvalit17", "HT17", students);
	@Test
	public void test() {
		assertEquals(classroom.getClassroomName().equals("Kvalit17"),true);
		assertEquals(classroom.getClassroomTerm().equals("HT17"),true);
		assertEquals(classroom.getStudents().equals(students),true);
		
	}

}
