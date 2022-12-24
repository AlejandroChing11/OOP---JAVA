public class Doctor {
    static int id = 0; //Auto increment
    String name;
    String speciality;


    //Comportamientos
    Doctor() {
        System.out.println("Creando un nuevo doctor...");
        id++;
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
