public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Persona persona1 = new Persona("Pedro", "Pascal", 48, "Mandolariano", 20, true);
        Persona persona2 = new Persona("Peter", "Pascalg", 48, "Mandolariano");

       
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + 
         " años y esta recibida de " +  persona1.carrera.nombre  + " duracion "  + persona1.carrera.duracion
            );

        System.out.println("\n");
        System.out.println(persona2.darNombreCompleto() + " tiene " + persona1.edad + 
            " años y esta recibida de " +  persona1.carrera.nombre 
               );
       }
    }
