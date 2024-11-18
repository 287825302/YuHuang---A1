import javax.naming.Name;

// Class representing a health professional
public class HealthProfessional {

 // Private attributes of the health professional
 private String Name;
 private char Sex;
 private String specialization;
 private int ID;
 private int Age;

 // Default constructor
 public HealthProfessional() {

 }

 // Parameterized constructor
 public HealthProfessional(String name, char Sex, String Specialization, int ID, int Age) {
  this.Name = name;
  this.Sex = Sex;
  this.specialization = Specialization;
  this.ID = ID;
  this.Age = Age;
 }

 // Getter for Name
 public String getName() {
  return Name;
 }

 // Setter for Name
 public void setName(String name) {
  Name = name;
 }

 // Getter for Sex
 public char getSex() {
  return Sex;
 }

 // Setter for Sex
 public void setSex(char sex) {
  Sex = sex;
 }

 // Getter for specialization
 public String getSpecialization() {
  return specialization;
 }

 // Setter for specialization
 public void setSpecialization(String specialization) {
  this.specialization = specialization;
 }

 // Getter for ID
 public int getID() {
  return ID;
 }

 // Setter for ID
 public void setID(int ID) {
  this.ID = ID;
 }

 // Getter for Age
 public int getAge() {
  return Age;
 }

 // Setter for Age
 public void setAge(int age) {
  Age = age;
 }

 // Override toString method to provide a string representation of the object

 //!I use the shortcut method provided
 // by Idea to rewrite the substring, which ensures that anyone can obtain the most basic information
 @Override
 public String toString() {
  return "HealthProfessional{" +
          "Name------>'" + Name + '\'' +
          ", Sex-------->" + Sex +
          ", ID------>" + ID +
          ", Age--------->" + Age +
          '}';
 }

 //！The main method of output is to rewrite subclasses

 // Method for output (currently empty)
 public void OUTPUT() {
  return;
 }
}
