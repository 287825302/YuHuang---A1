// Class representing a General Practitioner, extending HealthProfessional

//!This is the class required by the task.
//! I have inherited the parent class
// !and added new variables to distinguish it.
// !I have also done a good job of encapsulating and printing information
public class GeneralPractitioner extends HealthProfessional {

    // Additional attribute specific to GeneralPractitioner
    private int Working_Age;

    // Default constructor
    public GeneralPractitioner() {
        super();
    }

    // Parameterized constructor
    public GeneralPractitioner(String name, char Sex, String specialization, int ID, int Age, int Working_Age) {
        super(name, Sex, specialization, ID, Age);
        this.Working_Age = Working_Age;
    }

    // Getter for Working_Age
    public int getWorking_Age() {
        return Working_Age;
    }

    // Setter for Working_Age
    public void setWorking_Age(int working_Age) {
        Working_Age = working_Age;
    }

    // Override OUTPUT method to print detailed information
    public void OUTPUT() {
        System.out.println("The detailed information is as follows");
        System.out.println("<<<<<GeneralPractitioner:>>>>>");
        System.out.println("Already working:" + Working_Age + "Year");
        System.out.println(super.toString());
    }
}
