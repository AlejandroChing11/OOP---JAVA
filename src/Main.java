import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); //Instanciazion
        myDoctor.name = "Alejandro Ching";
        myDoctor.showName();

        Doctor myDoctorAlejo = new Doctor();
        myDoctor.showId();

        UIMenu.showMenu();



    }

}
