package ui;

import java.util.Scanner;

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
        } while(response != 0);
    }
}
