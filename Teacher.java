package school_Managment;

class Teacher extends Person {
    private int teacherID;
    private String subject;
    private double salary;

    public Teacher(String firstName, String lastName, int age, String contactInfo,
                   int teacherID, String subject, double salary) {
        super(firstName, lastName, age, contactInfo);
        this.teacherID = teacherID;
        this.subject = subject;
        this.salary = salary;
    }

	public int getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

   
}

