package l.eleven.two;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input list
	 * socSecNums and whose salary is > 80000. The list must be ordered by social
	 * security number, from lowest to highest. To sort, you must use a Collections
	 * sorting method and you must define your own Comparator to be used to compare
	 * Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		// IMPLEMENT
		List<Employee> richEmp = above80000(table);
		List<Employee> inSsnList = containedInSocSecNumList(richEmp, socSecNums);
		
		Comparator<Employee> ssnComparator = new SSNComparator();
		Collections.sort(inSsnList, ssnComparator);
		
		return inSsnList;
	}
	
	public static List<Employee> above80000(HashMap<String, Employee> table) {
		List<Employee> richEmployees = new LinkedList<Employee>();
		
		for (Employee emp : table.values()) {
			if (emp.getSalary() > 80000) {
				richEmployees.add(emp);
			}
		}
		
		return richEmployees;
	}
	
	public static List<Employee> containedInSocSecNumList(List<Employee> emp, List<String> socSecNums) {
		List<Employee> inList = new LinkedList<Employee>();
		
		for (Employee e : emp) {
			if (socSecNums.contains(e.getSsn())) {
				inList.add(e);
			}
		}
		
		return inList;
	}
}
