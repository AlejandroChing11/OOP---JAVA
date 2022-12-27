import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        /*Doctor myDoctor = new Doctor(); //Instanciazion


        Doctor myDoctorAlejo = new Doctor();

        //showMenu();

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/
        Paciente paciente = new Paciente("Alejandro", "alejandroching2004@hotmail.com");
        System.out.println(paciente);
    }

}
