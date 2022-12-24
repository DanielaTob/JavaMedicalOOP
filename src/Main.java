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
        patientIam.setPhoneNumber("39876543");
        patientIam.setAddress("Calle 1 Avenida 3");
        patientIam.setBirthday("35");
        patientIam.setWeight(69.0);
        patientIam.setHeight(1.70);
        patientIam.setBlood("O+");

        System.out.println(patientIam);

    }
}
