package l.eleven.two;

import java.util.Comparator;

public class SSNComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getSsn().compareTo(o2.getSsn());
	}

}
