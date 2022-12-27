import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); //Instanciazion
        myDoctor.showName();

        Doctor myDoctorAlejo = new Doctor();
        myDoctor.showId();

        //showMenu();

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }







    }

}
