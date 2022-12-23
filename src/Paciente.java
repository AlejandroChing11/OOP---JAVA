public class Paciente {
    int id;
    String name;
    String description;

    //Comportamientos
    public void showId() {
        System.out.println(id);
    }
    public void showName() {
        System.out.println(name);
    }
    public void showDescription() {
        System.out.println(description);
    }
    Paciente() {
        System.out.println("Construyendo el objeto doctor");
    }
    Paciente(String name) {
        System.out.println("El nombre del paciente es: " + name);
    }
}
