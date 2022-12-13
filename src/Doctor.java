public class Doctor {

    //Atributos de la clase Doctor
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showSpeciality(){
        System.out.println(speciality);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
