import Interfaz.Ataque;

public class PokemonAgua extends Pokemon{
    //atributos


    //constructor
    public PokemonAgua(){
        
    }

    public PokemonAgua(String nombre, int nivel, double vida, double vidaMaxima) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.vidaMaxima = vidaMaxima;
    }

    //metodos
    @Override
    public String toString() {
        return "Soy un pokemon tipo: " + getClass();
    }

    public void sonido(){
        System.out.println("Soy un pokemon tipo agua y sueno así");
    }

}
