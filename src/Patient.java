public class Patient {
    private String name;
    private String mobilePhone;
    private int age;
    private char gender;

    private  boolean First_arrival;

    public Patient() {
    }

    public Patient(String name, String mobilePhone, int age, char gender, boolean first_arrival) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.age = age;
        this.gender = gender;
        First_arrival = first_arrival;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isFirst_arrival() {
        return First_arrival;
    }

    public void setFirst_arrival(boolean first_arrival) {
        First_arrival = first_arrival;
    }

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
