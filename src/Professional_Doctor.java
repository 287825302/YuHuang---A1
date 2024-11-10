public class Professional_Doctor extends HealthProfessional{
    private String Work_Department;

    public Professional_Doctor(){
        super();
    }
    public Professional_Doctor(String name,char Sex,String specialization,int ID,int Age,String Work_Department){
        super(name,Sex,specialization,ID,Age);
        this.Work_Department=Work_Department;
    }

    public String getWork_Department() {
        return Work_Department;
    }

    public void setWork_Department(String work_Department) {
        Work_Department = work_Department;
    }

    public void OUTPUT(){
        System.out.println("The detailed information is as follows");
        System.out.println("<<<<<<<Professional_Doctor:"+Work_Department+">>>>>>");
        System.out.println(super.toString());


    }
}
