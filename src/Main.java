public class Main {
    public static void main(String[] args) {

        //Nombre de la clase - punto - nombre del metodo
        //Menu.showMenu();

        Doctor myDoctor = new Doctor("Leia", "General");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patientIam = new Patient("luke", "luke2@gmail.com");
        patientIam.setPhoneNumber("37656786");
        System.out.println(patientIam.getPhoneNumber());
        patientIam.setWeight(54.6);
        System.out.println(patientIam.getWeight());


    }
}
