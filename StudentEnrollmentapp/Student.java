// Import folder package
package StudentEnrollmentapp;

// Import libraries 
import java.util.Scanner;

// Allows the user to input student information to enroll into their desired course
public class Student {

   // Variables
   private String firstName;
   private String lastName;
   private int year;
   private String paymentID;
   private String courses = "";
   private int tuitionBalance = 0;
   private int fees = 500;
   private static int costOfCourse = 1000;
   private static int id = 1000;

   //Constructor: prompt user to enter student's name and year
   public Student() {    

      int x = 1;   
   
      //Do while loop, so process will repeat if user input wrong input
      do{    
         try{
            Scanner in = new Scanner(System.in);

            System.out.print("Enter student first name: ");
            this.firstName = in.nextLine();

            System.out.print("Enter student last name: ");
            this.lastName = in.nextLine();

            do {
               System.out.println("----------------------------------------\n");
               System.out.print("1 - Freshman\n2 - Sophomore\n3 -  Junior\n4 - Senior\nEnter your year: ");
               while (!in.hasNextInt()) {
                  System.out.println("That's not a valid input!");
                  in.nextInt(); 
               }
               this.year = in.nextInt();
            } while (this.year < 0 | this.year > 4);
            
            System.out.println("----------------------------------------\n");
            setStudentID();

            x = 2;    // When user input all the right input, the do while loop stop
         }
         catch(Exception e) {    // Catch statement when error happened
            System.out.println("\n\tWrong input. Please Try Again\n");
         }
      } while(x == 1);    // Restart the process if user input the wrong input
   }

   // Generate an receipt ID
   private void setStudentID() {

      id++;
      this.paymentID = year + "" + id;
   }

   //Enroll in courses
   public void enroll() {
      do {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter course to enroll (Q to quit when finish.): ");
         
         String course = in.nextLine();
         
         if (!course.equalsIgnoreCase("q" )) {
         courses = courses + "\n " + course;
         tuitionBalance = tuitionBalance + costOfCourse;
         } else {
         break;
         }
      } while (1 != 0);
      System.out.println("----------------------------------------\n");
   }

   //Display total amount to pay
   public void Balance() {

      System.out.println("Your current tuition is: $" + tuitionBalance);
      
   }

   // View balance
   public void TotalBalance() {

      int totalPayment = 0;
      totalPayment = tuitionBalance + fees;

      System.out.println("Your total payment is: $" + totalPayment);
   }

   // Pay tuition
   public void payTuition() {

      int x = 1;

      do {
         try {    // Exception handling start
            TotalBalance();    // To show total balance in account
            System.out.print("Enter your payment: $");
            Scanner in = new Scanner(System.in);
            
            int payment = in.nextInt();
            tuitionBalance = (tuitionBalance + fees) - payment;
            System.out.println("----------------------------------------\n");
            System.out.println("Thank you for your payment of $" + payment + "!\n");

            x = 2;    //When user input all the right input, the do while loop stop
         }
         catch(Exception e) {    //Catch statement when error happened
            System.out.println("\n\tOops! Wrong input. PleaseTry Again\n");
         }
      }while(x == 1);
   }

   // Show status
   public String toString() { 

      return "Name: " + firstName + " " + lastName + "\nYear: " + year + "\nReceipt ID: " + paymentID + "\nCourses Enrolled:" + courses + "\nYour current account balance: $" + tuitionBalance + "\n----------------------------------------";
   }
}