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
        myPaciente.setWeight(54.7);
        System.out.println(myPaciente.getWeight());
        myPaciente.setHeight(30.50);
        System.out.println(myPaciente.getHeight());
        myPaciente.setPhoneNumber("31584077");
        System.out.println(myPaciente.getPhoneNumber());

        System.out.println();
        System.out.println();
        System.out.println();

        Paciente myPaciente2 = new Paciente("Maria Camila", "mcgomez@hotmail.com");
        System.out.println(myPaciente.getName());
        System.out.println(myPaciente2.getName());

        System.out.println();
        System.out.println();

        myPaciente2 = myPaciente;

        System.out.println(myPaciente.getName());
        System.out.println(myPaciente.getName());

        //Paciente myPaciente2 = new Paciente(25.70, 50.50);
        //System.out.println(myPaciente2.weight);
        //System.out.println(myPaciente2.height);







    }

}
