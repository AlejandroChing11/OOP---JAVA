public class Paciente {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber; //This is encapsulamiento (private).
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Paciente(String name, String email) {
        this.name = name;
        this.email = email;
    };

    //Paciente(double weight, double height){
        //this.weight = weight;
        //this.height = height;
    //};


}
