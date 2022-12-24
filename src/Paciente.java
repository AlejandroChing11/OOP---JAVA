public class Paciente {
    static int id;
    String name;
    String description;

    //Comportamientos
    Paciente() {
        System.out.println("Creando un nuevo paciente...");
        id++;
    }

    public void showId() {
        System.out.println("El id de el o la paciente es: " + id);
    }
    public void showName() {
        System.out.println(name);
    }
    public void showDescription() {
        System.out.println(description);
    }


}
