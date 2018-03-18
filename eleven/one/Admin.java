package l.eleven.one;

import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		// implement
		HashMap<Key, Student> studentMap = new HashMap<Key, Student>();
		
		for (Student student : students) {
			studentMap.put(new Key(student.getFirstName(), student.getLastName()), student);
		}
		
		return studentMap;
	}
}
