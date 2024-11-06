import javax.naming.Name;

public class HealthProfessional {

 private String Name ;
 private char Sex;

 private String specialization;
 private int ID;
 private  int Age;

 public HealthProfessional(){

 }
 public HealthProfessional(String name, char Sex, int ID,int Age){

 }



 public String getName() {
  return Name;
 }

 public void setName(String name) {
  Name = name;
 }

 public char getSex() {
  return Sex;
 }

 public void setSex(char sex) {
  Sex = sex;
 }


 public String getSpecialization() {
  return specialization;
 }

 public void setSpecialization(String specialization) {
  this.specialization = specialization;
 }
 public int getID() {
  return ID;
 }

 public void setID(int ID) {
  this.ID = ID;
 }

 public int getAge() {
  return Age;
 }

 public void setAge(int age) {
  Age = age;
 }



 @Override
 public String toString() {
  return "HealthProfessional{" +
          "Name='" + Name + '\'' +
          ", Sex=" + Sex +
          ", ID=" + ID +
          ", Age=" + Age +
          '}';
 }
}
