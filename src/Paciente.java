public class Paciente extends User{
    //Unique identifier
    private String birthday;
    private double weight;
    private double height;
    private String blood;



    Paciente(String name, String email) {
        super(name, email);
        //Mas comportamientos
    };

    public void setWeight(double weight) {
        this.weight = weight;
    };

    //54.5 Kg. String

    public String getWeight () {
        return this.weight + " Kg. ";
    };

    public String getHeight () {
        return this.height + " Mts. ";
    };

    public void setHeight (double height) {
        this.height = height;
    };


    public void setPhoneNumber(String phoneNumber) {

    }

    //Paciente(double weight, double height){
        //this.weight = weight;
        //this.height = height;
    //};




}
