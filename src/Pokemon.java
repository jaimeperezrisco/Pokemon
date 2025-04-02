import Interfaz.Ataque;

public abstract class Pokemon implements Ataque{

    //atributos
    private String nombre;
    private int nivel;
    private double vida;
    private double vidaMaxima;
    private int poderAtaque;
    
    //metodos Revisar el toString


   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getPoderAtaque() {
        return poderAtaque;
    }

    public void setPoderAtaque(int poderAtaque) {
        this.poderAtaque = poderAtaque;
    }


    //metodos

   public String toString() {
       return "Soy un Pokemon";
   }
    
   public abstract void sonido();

   @Override
   public void atacar() {

   }


}
