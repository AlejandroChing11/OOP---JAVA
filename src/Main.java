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

        Paciente myPaciente = new Paciente("Alejandro Ching", "alejandroching2004@hotmail.com");
        System.out.println(myPaciente.name);
        System.out.println(myPaciente.email);

        Paciente myPaciente2 = new Paciente(25.70, 50.50);
        System.out.println(myPaciente2.weight);
        System.out.println(myPaciente2.height);




    }

}
