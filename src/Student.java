import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    // constructor: prompt the user to enter student's name and the year


    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student's first Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Student's last Name: ");
        this.lastName = in.nextLine();


        System.out.print("1 - Freshmen\n2- Sophomore\n3- Junior\n4-Senior\nEnter Student's class Level: ");
        this.gradeYear = in.nextInt();
        setStudentID();

    }
    // Generate Id
    private void setStudentID() {
        // Grade Level + Static id
        id++;
        this.studentID =  gradeYear + "" + id;
    }

    // Enroll in courses

    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        }while(1!=0);

    }

    // View Balance

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }



    // Pay tuition

    public void payTuition() {
        viewBalance();
        System.out.print("Enter you payment: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thankyou for your payment of $" + payment);
        viewBalance();
    }
    // Show status

    public String showInfo() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent Id: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
