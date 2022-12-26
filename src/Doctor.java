public class Doctor {
    static int id = 0; //Auto increment
    String name;
    String speciality;


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

}
