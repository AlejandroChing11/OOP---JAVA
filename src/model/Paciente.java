package model;
import java.util.ArrayList;
import java.util.Date;


public class Paciente extends User {
    //Unique identifier
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurse() {
        return appointmentNurses;
    }

    public void setAppointmentNuse(ArrayList<AppointmentNurse> appointmentNuse) {
        this.appointmentNurses = appointmentNurses;
    }

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

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo desde nacimiento");
    }

    //model.Paciente(double weight, double height){
        //this.weight = weight;
        //this.height = height;
    //};




}
