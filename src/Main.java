public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Luke Skywalker";
        myDoctor.speciality = "Psychology";
        myDoctor.showName();
        myDoctor.showSpeciality();
        myDoctor.showId();

        Doctor.id++;

        Doctor myDoctorLuke = new Doctor();
        myDoctor.showId();

        Menu.showMenu();

    }
}
