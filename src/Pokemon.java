public abstract class Pokemon {

    //atributos
    private String nombre;
    private int nivel;
    private int vida;
    private int vidaMaxima;
    
    //metodos Revisar el toString

   
   public String toString() {
       return "Soy un Pokemon";
   }
    
   public abstract void sonido();
}
