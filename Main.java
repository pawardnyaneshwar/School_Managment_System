package school_Managment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a school
        School school = new School("ABC School");

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Pay Fees");
            System.out.println("4. Pay Salary");
            System.out.println("5. Generate Reports");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            System.out.println("**************************************");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                	System.out.print("Enter student's first name: ");
                    String studentFirstName = scanner.nextLine();
                    System.out.print("Enter student's last name: ");
                    String studentLastName = scanner.nextLine();
                    System.out.print("Enter student's age: ");
                    int studentAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter student's contact info: ");
                    String studentContactInfo = scanner.nextLine();
                    System.out.print("Enter student's ID: ");
                    int studentID = scanner.nextInt();
                    System.out.print("Enter student's grade: ");
                    int studentGrade = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    Student student = new Student(studentFirstName, studentLastName, studentAge, studentContactInfo, studentID, studentGrade);
                    school.addStudent(student);
                    break;

                case 2:
                   
                	System.out.print("Enter teacher's first name: ");
                    String teacherFirstName = scanner.nextLine();
                    System.out.print("Enter teacher's last name: ");
                    String teacherLastName = scanner.nextLine();
                    System.out.print("Enter teacher's age: ");
                    int teacherAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter teacher's contact info: ");
                    String teacherContactInfo = scanner.nextLine();
                    System.out.print("Enter teacher's ID: ");
                    int teacherID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter teacher's subject: ");
                    String teacherSubject = scanner.nextLine();
                    System.out.print("Enter teacher's salary: ");
                    double teacherSalary = scanner.nextDouble();
                    scanner.nextLine(); // Consume the newline

                    Teacher teacher = new Teacher(teacherFirstName, teacherLastName, teacherAge, teacherContactInfo, teacherID, teacherSubject, teacherSalary);
                    school.addTeacher(teacher);
                    break;

                case 3:
                    System.out.print("Enter student's first name: ");
                    String studentName = scanner.nextLine();
                    Student selectedStudent = null;

                    // Find the selected student from the school's studentsList
                   for (Student student1 : school.getStudentsList()) {
                        if (student1.getFirstName().equalsIgnoreCase(studentName)) {
                            selectedStudent = student1;
                            break;
                        }
                    }

                    if (selectedStudent != null) {
                        System.out.print("Enter fees amount to be paid: ");
                        double feesAmount = scanner.nextDouble();
                        school.payFees(selectedStudent, feesAmount);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                	 System.out.print("Enter teacher's first name: ");
                	    String teacherName = scanner.nextLine();
                	    Teacher selectedTeacher = null;

                	    for (Teacher teacher1 : school.getTeachersList()) {
                	        if (teacher1.getFirstName().equalsIgnoreCase(teacherName)) {
                	            selectedTeacher = teacher1;
                	            break;
                	        }
                	    }

                	    if (selectedTeacher != null) {
                	        school.paySalary(selectedTeacher);
                	    } else {
                	        System.out.println("Teacher not found.");
                	    }
                           break;

                case 5:
                    System.out.println("********************Student Report*******************");
                    school.generateStudentReport();

                    System.out.println("********************Teacher Report********************");
                    school.generateTeacherReport();

                    System.out.println("********************Financial Report********************");
                    school.generateFinancialReport();
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

