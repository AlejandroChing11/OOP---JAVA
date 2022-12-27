import java.util.ArrayList;
import java.util.Date;
public class Doctor {
    static int id = 0; //Auto increment
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String speciality;










    //Comportamientos
    Doctor() {
        System.out.println("Creando un nuevo doctor...");

    }

    Doctor(String name, String speciality){
        System.out.println("El nombre del doctor asignado es: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public void showName() {
        System.out.println(name);
    }

    public void showSpeciality() {
        System.out.println(speciality);
    }

    public void showId() {
        System.out.println("Id del doc: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
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
    }

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY
    };


}
