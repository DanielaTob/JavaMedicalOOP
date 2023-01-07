import model.Doctor;
import model.Nurse;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Nombre de la clase - punto - nombre del metodo
        //Menu.showMenu();

        Doctor myDoctor = new Doctor("Luke", "luke@gmail.com");
        myDoctor.setSpeciality("General");
        myDoctor.setAddress("Calle 50 b");
        myDoctor.setPhoneNumber("37463728");
        myDoctor.setEmail("General");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        //Imprimir solo citas disponibles
        /*for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        User doctor = new Doctor("Anakin", "Ankin@gmail.com");
        doctor.showDataUser();

        User patient = new Patient("luke", "luke2@gmail.com");
        patient.showDataUser();

        User nurse = new Nurse("leia", "leia@gmail.com");
        nurse.showDataUser();


        //Clase y metodo anonimo
        User user1 = new User("Leia", "Leia@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("\nNurse");
                System.out.println("Hospital: Cruz Roja");
                System.out.println("Departamento: Pediatria");
            }
        };
        user1.showDataUser();


        /*Patient patientIam = new Patient("luke", "luke2@gmail.com");
        patientIam.setPhoneNumber("39876543");
        patientIam.setAddress("Calle 1 Avenida 3");
        patientIam.setBirthday("35");
        patientIam.setWeight(69.0);
        patientIam.setHeight(1.70);
        patientIam.setBlood("O+");

        System.out.println(patientIam);*/

    }
}
