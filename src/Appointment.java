// Class representing an Appointment
//!This is my appointment class, and I also create a new patient class to better
// demonstrate the robustness of my code.
// In this class, I create methods for printing information
// and encapsulate the objects that come in
public class Appointment {
    // Private attributes of the Appointment
    private Patient patient;
    private String preferredTimeSlot;
    private HealthProfessional selectedDoctor;

    // Default constructor
    public Appointment() {
    }

    // Parameterized constructor
    public Appointment(Patient patient, String preferredTimeSlot, HealthProfessional selectedDoctor) {
        this.patient = patient;
        this.preferredTimeSlot = preferredTimeSlot;
        this.selectedDoctor = selectedDoctor;
    }

    // Getter for patient
    public Patient getPatient() {
        return patient;
    }

    // Setter for patient
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    // Getter for preferredTimeSlot
    public String getPreferredTimeSlot() {
        return preferredTimeSlot;
    }

    // Setter for preferredTimeSlot
    public void setPreferredTimeSlot(String preferredTimeSlot) {
        this.preferredTimeSlot = preferredTimeSlot;
    }

    // Getter for selectedDoctor
    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    // Setter for selectedDoctor
    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }

    // Method to output appointment information
    public void OUTPUT() {
        System.out.println("The patient's appointment information is as follows");
        System.out.println("<<<<<Patient basic information>>>>>");
        System.out.println(patient.toString());

        System.out.println("The time chosen by the patient is:" + preferredTimeSlot);

        System.out.println("The basic information of the doctor is as follows");
        System.out.println("<<<<<Doctor's detailed information>>>>>");
        selectedDoctor.OUTPUT();
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patient=" + patient +
                ", preferredTimeSlot='" + preferredTimeSlot + '\'' +
                ", selectedDoctor=" + selectedDoctor +
                '}';
    }
}
