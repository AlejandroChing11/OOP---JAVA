import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Sandra", "sandrafb@hotmail.com"); //Instanciazion

        //showMenu();

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Paciente paciente = new Paciente("Alejandro", "alejandroching2004@hotmail.com");
        System.out.println(paciente);
        System.out.println("");
        System.out.println(myDoctor);
    }

}
