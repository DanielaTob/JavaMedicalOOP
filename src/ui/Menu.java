package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public final static String[] MONTHS = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre"
    };

    //Variable que me i9ndique el usuario loggeado
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }


    //Autenticación de Usuarios Doctor y Patient
    private static void authUser(int userType){
        //userType = 1 Doctor
        //userType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Daniela Tobar", "Dan@gmail.com"));
        doctors.add(new Doctor("Haoyang", "Hy@gmail.com"));
        doctors.add(new Doctor("Luna", "Luna@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lucke Sky", "Luk@gmail.com"));
        patients.add(new Patient("Leia", "Leia@gmail.com"));
        patients.add(new Patient("Anakin", "Anak@gmail.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Insert your email: [correo@gamil.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            //Validando que tipo de usuario es
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario loggeado
                        doctorLogged = d;
                        //Mostrar menu del doctor
                    }
                }
            }

            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario loggeado
                        patientLogged = p;
                        //Mostrar menu del paciente
                    }
                }
            }



        }while(!emailCorrect);

    }

    static void showPatientMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                case 0:
                    showMenu();
                    break;
            }
        }while(response != 0);
    }
}
