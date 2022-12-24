public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor(); //Instanciazion
        Paciente myPaciente = new Paciente();
        myDoctor.name = "Alejandro Ching";
        myDoctor.speciality = "Cirujano estetico";
        myDoctor.showName();
        myDoctor.showSpeciality();
                        //Construct method
        Doctor myDoctorAx = new Doctor();
        myDoctor.showId();

        Doctor myDoctorMei = new Doctor();
        myDoctor.showId();

        Doctor myDoctorSand = new Doctor();
        myDoctor.showId();

        Paciente myPacienteChinese = new Paciente();
        myPaciente.showId();

        Paciente myPacienteColombian = new Paciente();
        myPaciente.showId();


    }
}