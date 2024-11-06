public class GeneralPractitioner extends HealthProfessional{

    private int Working_Age;

    public GeneralPractitioner(){
        super();
    }
    public GeneralPractitioner(String name,char Sex,String specialization,int ID,int Age,int Working_Age){
        super(name,Sex,specialization,ID,Age);
        this.Working_Age=Working_Age;
    }

    public int getWorking_Age() {
        return Working_Age;
    }

    public void setWorking_Age(int working_Age) {
        Working_Age = working_Age;
    }

    public void OUTPUT(){
        System.out.println("The detailed information is as follows");
        System.out.println("GeneralPractitioner:");
        super.toString();
        System.out.println("Already working:"+Working_Age+"Year");

    }


}
