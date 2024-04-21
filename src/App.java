public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("besti", 200);
        Gato gato = new Gato("tini", 5);
        Perro perro = new Perro("Peter", 6);

        System.out.println("\n El animal llamado " + gato.nombre +" hace :" );
        System.out.println(gato.hacerSonido());

        System.out.println("\n El animal llamado " + gato.nombre +" hace :" );
        System.out.println(gato.hacerSonido());

        System.out.println("\n El animal llamado " + perro.nombre +" hace :" );
        System.out.println(perro.hacerSonido());


        System.out.println("El total de animales de creados es " + Animal.getContadorAnimales());
        System.out.println("\n");
        System.out.println("El nombre de la veterianiria donde trabajo es " + Veterinaria.nombreVeterinaria);

 
    }
}
