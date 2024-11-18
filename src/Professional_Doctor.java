// Class representing a Professional Doctor, extending HealthProfessional

//!This is a task that requires me to create different classes.
// I have inherited the parent class
// and added new variables to distinguish them.
// I have also done a good job of encapsulating and printing information
public class Professional_Doctor extends HealthProfessional {
    // Additional attribute specific to Professional_Doctor
    private String Work_Department;

    // Default constructor
    public Professional_Doctor() {
        super();
    }

    // Parameterized constructor
    public Professional_Doctor(String name, char Sex, String specialization, int ID, int Age, String Work_Department) {
        super(name, Sex, specialization, ID, Age);
        this.Work_Department = Work_Department;
    }

    // Getter for Work_Department
    public String getWork_Department() {
        return Work_Department;
    }

    // Setter for Work_Department
    public void setWork_Department(String work_Department) {
        Work_Department = work_Department;
    }

    // Override OUTPUT method to print detailed information
    public void OUTPUT() {
        System.out.println("The detailed information is as follows");
        System.out.println("<<<<<<<Professional_Doctor:" + Work_Department + ">>>>>>");
        System.out.println(super.toString());
    }
}
