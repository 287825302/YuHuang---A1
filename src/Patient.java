// Class representing a Patient
//This is a new patient created by me to
// serve the appointment system.
// I added 4 variables, constructors, and output methods
public class Patient {
    // Private attributes of the Patient
    private String name;
    private String mobilePhone;
    private int age;
    private char gender;
    private boolean First_arrival;

    // Default constructor
    public Patient() {
    }

    // Parameterized constructor
    public Patient(String name, String mobilePhone, int age, char gender, boolean first_arrival) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.age = age;
        this.gender = gender;
        First_arrival = first_arrival;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for mobilePhone
    public String getMobilePhone() {
        return mobilePhone;
    }

    // Setter for mobilePhone
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for gender
    public char getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // Getter for First_arrival
    public boolean isFirst_arrival() {
        return First_arrival;
    }

    // Setter for First_arrival
    public void setFirst_arrival(boolean first_arrival) {
        First_arrival = first_arrival;
    }

    // Override toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Is this your first arrival=" + First_arrival +
                '}';
    }
}
