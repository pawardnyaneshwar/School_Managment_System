package school_Managment;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String contactInfo;

    public Person(String firstName, String lastName, int age, String contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.contactInfo = contactInfo;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	

    
}
