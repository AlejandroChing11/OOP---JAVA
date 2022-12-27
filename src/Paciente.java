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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El numero de telefono debe ser de 8 digitos maximo");
        }else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Paciente(double weight, double height){
        //this.weight = weight;
        //this.height = height;
    //};




}
