package model;

public class Nurse extends User{

    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Nurse(String name, String email) {
        super(name, email);
    }


    //Definir metodo abstracto
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Roja");
        System.out.println("Departamento: Pediatria");
    }
}
