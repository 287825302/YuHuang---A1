import java.util.ArrayList;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {

        List<HealthProfessional> healthProfessionals = new ArrayList<>();
                // Part 3 – Using classes and objects

                // 创建三个 General Practitioners 对象
                GeneralPractitioner gp1 = new GeneralPractitioner("Dr. Smith", 'M', "Family Medicine", 1001, 35, 10);
                GeneralPractitioner gp2 = new GeneralPractitioner("Dr. Johnson", 'F', "Pediatrics", 1002, 40, 15);
                GeneralPractitioner gp3 = new GeneralPractitioner("Dr. Williams", 'M', "Internal Medicine", 1003, 45, 20);

                // 创建两个 Professional_Doctor 对象
                Professional_Doctor pd1 = new Professional_Doctor("Dr. Brown", 'F', "Cardiology", 2001, 38, "Heart Surgery");
                Professional_Doctor pd2 = new Professional_Doctor("Dr. Davis", 'M', "Neurology", 2002, 42, "Brain Disorders");


                healthProfessionals.add(gp1);
                healthProfessionals.add(gp2);
                healthProfessionals.add(gp3);
                healthProfessionals.add(pd1);
                healthProfessionals.add(pd2);

        //Created two methods for printing information
                switch (2){
                    case 1:
                        // 打印所有健康专业人员的详细信息
                        System.out.println("General Practitioners:");
                        gp1.OUTPUT();
                        System.out.println();
                        gp2.OUTPUT();
                        System.out.println();
                        gp3.OUTPUT();
                        System.out.println();

                        System.out.println("Professional Doctors:");
                        pd1.OUTPUT();
                        System.out.println();
                        pd2.OUTPUT();

                        System.out.println("------------------------------");
                        break;


                    case 2:
                        System.out.println("<<--------The detailed information of health personnel is as follows-------->>");
                        System.out.println("------------------------------");
                        for (HealthProfessional professional : healthProfessionals) {
                            if (professional instanceof GeneralPractitioner) {
                                ((GeneralPractitioner) professional).OUTPUT();
                            } else if (professional instanceof Professional_Doctor) {
                                ((Professional_Doctor) professional).OUTPUT();
                            }
                            System.out.println();
                            System.out.println("------------------------------");

                        }




                }


            }
        }


        //List<HealthProfessional> healthProfessionals = new ArrayList<>();//


