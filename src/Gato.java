
public class Gato extends Animal {
    
    public Gato(String nombre, int edad){
        //Con la palabra super  estamos asignando la  información heredada
        super(nombre, edad);
    }
    //con el decorador override podemos sobreescribir un método
    @Override
    public String hacerSonido(){
        return "Miau";
    }



    

}
