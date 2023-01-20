package ui;

import model.Doctor;
import model.Paciente;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "September", "Oktober", "November", "Diciembre"};
    public static Doctor doctorLogged;
    public static Paciente pacienteLogged;
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
                    System.out.println("model.Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }
     static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + "." + MONTHS[i]);
                        
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int userType) {
        //userType = 1 => Doctor
        //userType = 2 => Paciente
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alexander Martinez", "Alexander@hotmail.com"));
        doctors.add(new Doctor("Hugo Jimenez", "Hugo@hotmail.com"));
        doctors.add(new Doctor("Maria Gomez", "Maria@hotmail.com"));

        //Pacientes Array
        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente("Alejandro Ching", "Alejandro@hotmail.com"));
        pacientes.add(new Paciente("Valeria Zuñiga", "Valeria@hotmail.com"));
        pacientes.add(new Paciente("Alejandra Ortega", "Alejandra@hotmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner((System.in));
            String email = sc.nextLine();
            if(userType == 1) {
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        //showDoctorMenu
                    }
                }
            }
            if (userType == 2) {
                for (Paciente p: pacientes){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        pacienteLogged = p;
                        //showPacienteMenu;
                        showPatientMenu();
                    }
                }

            }


        }while (!emailCorrect);
    }

}
