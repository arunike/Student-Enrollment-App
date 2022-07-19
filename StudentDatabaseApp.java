// Import folder package
package StudentEnrollmentapp;

public class StudentDatabaseApp {
  public static void main (String[]args) {

    // ConsOverload file
    ConsOverload a = new ConsOverload();
    a.printName();
    
    // Overriding file
	  overriding ov = new overriding();
	  ov.myMethod();

    // Set number of student to 1
    int numOfStudents = 1;
    Student[] students = new Student[numOfStudents];

    // Create information for student
    for (int n = 0; n < numOfStudents; n++) {
      students[n] = new Student();
      students[n].enroll();
      students[n].Balance();
      students[n].payTuition();
      System.out.println(students[n].toString());
    }
  }
}

