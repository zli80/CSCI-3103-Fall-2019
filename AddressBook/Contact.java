package Week5;

public class Contact implements Comparable<Contact> {
	
	private String name;
	private int number;
	/**
	 * @param name
	 * @param number
	 */
	public Contact(String name, int number) {
		super();
		this.name = name;
		this.number = number;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}
	@Override
	public int compareTo(Contact arg0) {
		
		
		return this.name.compareTo(arg0.name);
		//return this.number - arg0.number;
		//return this.name.omarg0.name;
		// TODO Auto-generated method stub
		//return 0;
	}
}
