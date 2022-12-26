public class Paciente {
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    Paciente(String name, String email) {
        this.name = name;
        this.email = email;
    };

    Paciente(double weight, double height){
        this.weight = weight;
        this.height = height;
    };


}
