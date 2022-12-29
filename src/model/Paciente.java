package model;

public class Paciente extends User {
    //Unique identifier
    private String birthday;
    private double weight;
    private double height;
    private String blood;



    public Paciente(String name, String email) {
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight() + "\nBlood: " + blood;
    }

    //model.Paciente(double weight, double height){
        //this.weight = weight;
        //this.height = height;
    //};




}
