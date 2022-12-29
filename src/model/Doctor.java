package model;

import java.util.ArrayList;
import java.util.Date;
public class Doctor extends User {
    //Unique Atribute
    private String speciality;

    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos
    public void showSpeciality() {
        System.out.println(speciality);
    }


    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable" + availableAppointments.toString();
    }

    public static class AvailableAppointment {
        private int id_aviableAppointment;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_aviableAppointment() {
            return id_aviableAppointment;
        }

        public void setId_aviableAppointment(int id_aviableAppointment) {
            this.id_aviableAppointment = id_aviableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }

}
