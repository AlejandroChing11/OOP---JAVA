package ui;

import model.Doctor;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;


public class UIPacienteMenu {
    public static void showPacienteMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Welcome: " + UIMenu.pacienteLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                break;
                case 2:
                break;
                case 0:
                    UIMenu.showMenu();
                break;
            }

        } while (response != 0);
    }
    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println(":: Book an Appointment");
            System.out.println(":: Select a Date");
            //Interger => lista de fechas
            //Map<Integer, Doctor> => Indice fecha seleccionada
            //[Doctors]
            //1. -doctor1
                // - 1 fecha1
                // - 2 fecha2
                // - 3 fecha3
            //2. -doctor2
                // - 1 fecha1
                // - 2 fecha2
                // - 3 fecha3
            //3. -doctor3
                // - 1 fecha1
                // - 2 fecha2
                // - 3 fecha3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
        } while(response != 0);
    }
}
