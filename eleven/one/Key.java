package l.eleven.one;

public class Key {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Key(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	@Override
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Key key = (Key) obj;
		return firstName.equals(key.getFirstName()) && lastName.equals(key.getLastName());
	}
}
