public class Doctor {

    //Atributos de la clase Doctor
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
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
