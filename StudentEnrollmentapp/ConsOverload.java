// Input Java package
package StudentEnrollmentapp;

// Constructor overloading
public class ConsOverload {
  
  private String name;

  // Method overloading
  public ConsOverload(String n) {
    name = n;
  }
  public ConsOverload() {
    name = "Welcome to Student Enrollment App\n";
  }

  public void printName() {
    System.out.println(name);
  }
}