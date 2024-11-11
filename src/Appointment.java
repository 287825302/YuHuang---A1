public class Appointment {
    private  Patient patient;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    public Appointment() {
    }

    public Appointment(Patient patient, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patient = patient;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    public void OUTPUT(){

        System.out.println("The patient's appointment information is as follows");
        System.out.println("<<<<<Patient basic information>>>>>");
        System.out.println(patient.toString());

        System.out.println("The time chosen by the patient is:" + preferredTimeSlot);

        System.out.println("The basic information of the doctor is as follows");
        System.out.println("<<<<<Doctor's detailed information>>>>>");
        selectedDoctor.OUTPUT();


    }
}
