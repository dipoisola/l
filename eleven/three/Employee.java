package l.eleven.three;

/** NOTE: You must override equals in this class */
public class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee) || obj == null)
			return false;
		
		Employee e = (Employee) obj;
		
		return salary == e.getSalary() && name.equals(e.getName());
	}

	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}	
}
