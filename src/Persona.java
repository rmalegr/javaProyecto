public class Persona {
    private String nombre;
    private String apellido;
    int edad;

    // métodos (Comportamiento de un objeto)

    public Persona(String nombre, String apellido, int edad) {

        this.nombre = nombre;
        this.apellido = nombre;
        this.edad = edad;

    }

    public String darNombreCompleto() {
        return getNombre() + ", " + getApellido();
    }

    public String enviarSaludo(String saludado) {
        if (edad > 40)
            return "Buenos dias, querido " + saludado;
        return "Hola, ¿cómo estás " + saludado + "? ";

    }

    // GETTERS & SETTERS

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

    }

    public String getApellido() {
        return this.apellido.toUpperCase();
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}
