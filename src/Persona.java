public class Persona {
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    //métodos (Comportamiento de un objeto)


    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracionCarrrera, boolean estaCursando){
        carrera = new Carrera(nombreCarrera, edad, false);
        this.nombre = nombre;
        this.apellido = nombre;
        this.edad = edad;
        

    }

    public Persona(String nombre, String apellido, int edad, String nombreCarrera){
        carrera = new Carrera(nombreCarrera, edad, false);
        this.nombre = nombre;
        this.apellido = nombre;
        this.edad = edad;
        

    }

    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }
    public String enviarSaludo(String saludado){
        if( edad > 40 ) return "Buenos dias, querido " + saludado;
        return "Hola, ¿cómo estás "  + saludado + "? ";

    }
}

