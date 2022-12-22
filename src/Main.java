import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Nombre de la clase - punto - nombre del metodo
        //Menu.showMenu();

        Doctor myDoctor = new Doctor("Luke", "General");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        //Imprimir solo citas disponibles
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }


        Patient patientIam = new Patient("luke", "luke2@gmail.com");
        patientIam.setPhoneNumber("37656786");
        System.out.println(patientIam.getPhoneNumber());
        patientIam.setWeight(54.6);
        System.out.println(patientIam.getWeight());


    }
}
