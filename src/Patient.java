public class Patient {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        this.name = name;
        this.email = email;
        System.out.println("El nombre del paciente es: " + name + " y su email es: " + email);
    }


    //METODOS QUE SE ENCARGAN DE VALIDAR LOS PARAMETROS

    //Get y Set Weight
    public String getWeight() {
        return weight + " kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Get y Set Height
    public String getHeight() {
        return height + " Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 8){
            System.out.println("El número de telefono debe contener maximo 8 digitos");
        }else if (phoneNumber.length() < 8){
        System.out.println("El numero de telefono debe contener minimo 8 digitos");
        }
        else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
}
