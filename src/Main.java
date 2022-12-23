public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); //Instanciazion
        myDoctor.name = "Alejandro Ching";
        myDoctor.speciality = "Cirujano estetico";
        myDoctor.showName();
        myDoctor.showSpeciality();

        Paciente myPaciente = new Paciente( "Alejandro Ching");
                                    //Construct method

    }
}