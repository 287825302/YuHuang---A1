import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AssignmentOne {
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        // Part 3 – Using classes and objects
        // Part 3 – Using classes and objects
        DemoPart3 (2 );
        //Default use method 2, method 1 directly uses printing,
        // method 2 uses the parent class's toString method
//========================================================================================//
//========================================================================================//
//========================================================================================//

        //Part 5 – Collection of appointments
        //Part 5 – Collection of appointments
        //Part 5 – Collection of appointments


        ArrayList<Appointment> Appointment_system = new ArrayList<>();

        // Create patients
        Patient patient1 = new Patient("Wei Wang", "13987654321", 40, 'M', false);
        Patient patient2 = new Patient("Na Li", "13876543210", 35, 'F', true);
        Patient patient3 = new Patient("Qiang Zhang", "13612345678", 25, 'M', true);
        Patient patient4 = new Patient("Yang Liu", "13798765432", 30, 'F', false);


        // Create health professionals
        GeneralPractitioner gp1 = new GeneralPractitioner("Dr. Chen Wei", 'M', "Family Medicine", 1010, 45, 20);
        GeneralPractitioner gp2 = new GeneralPractitioner("Dr. Zhang Li", 'F', "Internal Medicine", 1020, 50, 25);
        Professional_Doctor pd1 = new Professional_Doctor("Dr. Li Ming", 'M', "Cardiology", 2010, 40, "Heart Surgery");
        Professional_Doctor pd2 = new Professional_Doctor("Dr. Zhao Qian", 'F', "Neurology", 2020, 38, "Brain Disorders");


        // Make 2 appointments with general practitioners
        createAppointment(Appointment_system,patient1, "09:00", gp1);
        createAppointment(Appointment_system,patient2, "10:30", gp2);

        // Make another 2 appointments with specialists
        createAppointment(Appointment_system,patient3, "14:00", pd1);
        createAppointment(Appointment_system,patient4, "15:30", pd2);

        // Print existing appointments
        System.out.println("\nAll appointments:");
        printExistingAppointments(Appointment_system);

        // Cancel one of the existing appointments
        System.out.println("\nCancelling an appointment:");
        cancelBooking(Appointment_system,"1234567890");

        // Print again existing appointments
        System.out.println("\nUpdated appointments:");
        printExistingAppointments(Appointment_system);

        System.out.println("------------------------------");
    }




//========================================================================================//
//========================================================================================//
//========================================================================================//
    //-----------------------The following are specific methods------------------------//







    // Part 3 – Using classes and objects
    // Part 3 – Using classes and objects
    public static void DemoPart3 (int Actual_use){
        List<HealthProfessional> healthProfessionals = new ArrayList<>();
        // Part 3 – Using classes and objects



        // Create three General Practitioners objects
        GeneralPractitioner gp1 = new GeneralPractitioner("Dr. Wang Hong", 'M', "Family Medicine", 1001, 35, 10);
        GeneralPractitioner gp2 = new GeneralPractitioner("Dr. Liu Fang", 'F', "Pediatrics", 1002, 40, 15);
        GeneralPractitioner gp3 = new GeneralPractitioner("Dr. Li Wei", 'M', "Internal Medicine", 1003, 45, 20);


        // Create two Professionalist_Doctor objects
        Professional_Doctor pd1 = new Professional_Doctor("Dr. Yang Li", 'F', "Cardiology", 2001, 38, "Heart Surgery");
        Professional_Doctor pd2 = new Professional_Doctor("Dr. Xiao Ming", 'M', "Neurology", 2002, 42, "Brain Disorders");


        //Add 5 doctor objects to the collection
        healthProfessionals.add(gp1);
        healthProfessionals.add(gp2);
        healthProfessionals.add(gp3);
        healthProfessionals.add(pd1);
        healthProfessionals.add(pd2);

        //Created two methods for printing information
        switch (Actual_use){
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
                        professional.OUTPUT();
                    }
                    else if (professional instanceof Professional_Doctor) {
                        professional.OUTPUT();
                    }
                    System.out.println();
                    System.out.println("------------------------------");

                }




        }

    }
//========================================================================================//
//========================================================================================//
//========================================================================================//

    //Part 5 – Collection of appointments
    //Part 5 – Collection of appointments
    //Part 5 – Collection of appointments

              public static void createAppointment(ArrayList<Appointment> Appointment_system ,Patient patient, String preferredTimeSlot, HealthProfessional doctor) {
                  if (patient == null || preferredTimeSlot == null || doctor == null) {

                      System.out.println("Error: All required information must be provided to create an appointment.");

                  } else {

                      Appointment newAppointment = new Appointment(patient, preferredTimeSlot, doctor);
                      Appointment_system.add(newAppointment);
                      System.out.println("Appointment created successfully.");
                  }
              }

                public static void printExistingAppointments(ArrayList<Appointment> Appointment_system ) {
                    if (Appointment_system.isEmpty()) {
                        System.out.println("There are no existing appointments.");
                    } else {

                        System.out.println("Existing Appointments:");
                       // I used the simplest lambda expression
                        //This is the simplest version and also references method citations
                        Appointment_system.forEach(System.out::println);
//
//

                    }
                }

               //My method this time uses the reverse writing of a regular for loop
               // , which is the most primitive method and a simple way to reflect thinking
               //I can also use the iterator method, but I have already thrown it in the abandoned code at the bottom
                public static void cancelBooking(ArrayList<Appointment> Appointment_system,String mobilePhone) {
                   if(Appointment_system!=null &&  mobilePhone!=null){
                       for (int i = Appointment_system.size()-1; i >=0 ; i--) {
                           Appointment AA1 =Appointment_system.get(i);
                           String SS1  = AA1.getPatient().getMobilePhone();
                           if (SS1.equals(mobilePhone)){
                               Appointment_system.remove(i);

                               System.out.println("The patient's appointment information " +
                                       "has been deleted through their mobile phone number");
                           }

                   }
                }else {
                       System.out.println("The data you entered has errors, please recheck");
                   }

                }





                //The following is the abandoned code reserved for easy
              // restoration of the original state of the program at any time
//========================================================================================//
//========================================================================================//
//========================================================================================//


                //for (int i = Appointment_system.size()-1; i >0 ; i--) {
    //                                Appointment AA1 =Appointment_system.get(i);
    //                               String SS1  = AA1.getPatient().getMobilePhone();
    //                               if (SS1.contains(mobilePhone)){
    //                                   Appointment_system.remove(i);
    //                                   i--;
    //                               }
    //
    //
    //                            }


    //Iterator<Appointment> iterator = Appointment_system.iterator();
    //                    boolean found = false;
    //                    while (iterator.hasNext()) {
    //                        Appointment appointment = iterator.next();
    //                        if (appointment.getPatient().getMobilePhone().equals(mobilePhone)) {
    //                            iterator.remove();
    //
    //                            found = true;
    //                            System.out.println("Appointment cancelled for patient with mobile number: " + mobilePhone);
    //                            break;
    //                        }
    //                    }
    //                    if (!found) {
    //                        System.out.println("Error: No appointment found for mobile number: " + mobilePhone);
    //                    }

}


        //List<HealthProfessional> healthProfessionals = new ArrayList<>();//


