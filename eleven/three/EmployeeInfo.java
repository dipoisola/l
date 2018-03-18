package l.eleven.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import l.eleven.three.util.Util;

public class EmployeeInfo {

	/**
	 * Removes from a copy of the input list all duplicate Employees, and then
	 * returns this list.
	 * 
	 * An Employee instance is considered to be a duplicate of another Employee
	 * instance if the two instances have the same name and salary.
	 */
	public static List<Employee> removeDuplicates(List<Employee> employees) {
		List<Employee> noDups = new ArrayList<Employee>();
		Iterator<Employee> eIterator = employees.iterator();
		
		while(eIterator.hasNext()) {
			Employee current = eIterator.next();
			
			if (!noDups.contains(current)) {
				noDups.add(current);
			}
		}
		
		return noDups;
	}

	// DO NOT MODIFY
	/**
	 * Use the main method to test your solution
	 */
	public static void main(String[] args) {
		List<Employee> myDupsRemoved = removeDuplicates(TestData.originalList);
		boolean dupsCorrectlyRemoved = Util.listsAreEqual(TestData.dupsRemoved, myDupsRemoved);
		System.out.println("Is answer correct? " + dupsCorrectlyRemoved);
	}

}
