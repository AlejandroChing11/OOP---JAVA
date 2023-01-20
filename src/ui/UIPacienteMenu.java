package ui;

import model.Doctor;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPacienteMenu {
    public static void showPacienteMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Paciente");
            System.out.println("Welcome: " + UIMenu.pacienteLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                break;
                case 2:
                    showPacienteMyAppointments();
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
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() +
                    ". Date: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {
                UIMenu.pacienteLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                showPacienteMenu();
            }

        } while(response != 0);
    }

    private static void showPacienteMyAppointments() {
        int reponse = 0;
        do {
            System.out.println("My appointments");
            if (UIMenu.pacienteLogged.getAppointmentDoctors().size() == 0){
                System.out.println("You don't have any appointments");
                break;
            }
            for (int i = 0; i < UIMenu.pacienteLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " + " Date: " + UIMenu.pacienteLogged.getAppointmentDoctors().get(i).getDate() + " Time: " + UIMenu.pacienteLogged.getAppointmentDoctors().get(i).getTime()
                + "\n Doctor: "+ UIMenu.pacienteLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }

            System.out.println("0. Return");

        } while (reponse != 0);
    }
}
