public class Animal {

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contadorAnimales++;
    }

    public String hacerSonido() {
        return "Grrrr";
    }

    public static int getContadorAnimales() {
        return contadorAnimales;
    }

    String nombre;
    int edad;
    static int contadorAnimales = 0;

}
