import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); //Instanciazion
        myDoctor.name = "Alejandro Ching";
        myDoctor.showName();

        Doctor myDoctorAlejo = new Doctor();
        myDoctor.showId();

        //showMenu();

        Doctor myDoctor2 = new Doctor("Clemo", "Pediatria");
        System.out.println(myDoctor2.name);
        System.out.println(myDoctor2.speciality);



    }

}
