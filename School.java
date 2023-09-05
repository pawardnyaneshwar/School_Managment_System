package school_Managment;

import java.util.ArrayList;

class School {
   // private String name;
    private ArrayList<Student> studentsList;
    private ArrayList<Teacher> teachersList;
    private double totalFunds;
    
    
    

    public School(String name) {
       // this.name = name;
        this.studentsList = new ArrayList<>();
        this.teachersList = new ArrayList<>();
        this.totalFunds = 0;
    }

    // Methods to manage students and teachers
    public void addStudent(Student student) {
        studentsList.add(student);
        System.out.println("**************************************");
        System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " added to the school.");
    }

    public void addTeacher(Teacher teacher) {
        teachersList.add(teacher);
        System.out.println("**************************************");
        System.out.println("Teacher " + teacher.getFirstName() + " " + teacher.getLastName() + " added to the school.");
    }

    // Methods for fee payment and salary distribution
    public void payFees(Student student, double fees) {
        // Update student's feesPaid and school's totalFunds
    	if (studentsList.contains(student)) {
            if (fees <= student.getFeesPaid()) {
                System.out.println(student.getFirstName() + " has already paid $" + student.getFeesPaid() +
                        ". No additional payment needed.");
            } else {
                double remainingFees = fees - student.getFeesPaid();
                student.setFeesPaid(student.getFeesPaid() + remainingFees);
                totalFunds += remainingFees;
                System.out.println(student.getFirstName() + " has paid $" + remainingFees +
                        ". Total fees paid: $" + student.getFeesPaid());
            }
        } else {
            System.out.println("Student not found in the school.");
        }
    }

    public void paySalary(Teacher teacher) {
        // Deduct salary from totalFunds and pay to teacher
    	if (teachersList.contains(teacher)) {
            double salary = teacher.getSalary();
            if (salary <= totalFunds) {
                totalFunds -= salary;
                System.out.println("Salary paid to " + teacher.getFirstName() + ": $" + salary);
            } else {
                System.out.println("Insufficient funds to pay salary to " + teacher.getFirstName());
            }
        } else {
            System.out.println("Teacher not found in the school.");
        }
    }

    // Method to generate reports
    public void generateStudentReport() {
        // Generate and print student report
    	System.out.println("Student Report:");
        for (Student student : studentsList) {
            System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Student ID: " + student.getStudentID());
            System.out.println("Grade: " + student.getGrade());
            System.out.println("Fees Paid: " + student.getFeesPaid());
            System.out.println("-------------------------");
        }
    }

    public void generateTeacherReport() {
        // Generate and print teacher report
    	System.out.println("Teacher Report:");
        for (Teacher teacher : teachersList) {
            System.out.println("Teacher Name: " + teacher.getFirstName() + " " + teacher.getLastName());
            System.out.println("Teacher ID: " + teacher.getTeacherID());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println("Salary: " + teacher.getSalary());
            System.out.println("-------------------------");
        }
    }

    public void generateFinancialReport() {
        // Generate and print financial report
    	System.out.println("Financial Report:");
        System.out.println("Total Funds: " + totalFunds);
    }
    
    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public ArrayList<Teacher> getTeachersList() {
		// TODO Auto-generated method stub
		return teachersList;
	}
    
}
