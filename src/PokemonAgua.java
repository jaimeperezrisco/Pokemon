import java.util.ArrayList;

public class PokemonAgua extends Pokemon{
    //constructor
    public PokemonAgua(String nombre, int nivel, double vida, double vidaMaxima, int poderAtaque) {
        super(nombre, nivel, vida, vidaMaxima, poderAtaque);
    }
       

    //metodos
    @Override
    public String toString() {
        return "Soy un pokemon tipo " + getClass().getName() + " soy " + getNombre()+ " mi ataque quita " + getPoderAtaque() + " tengo nivel " + getNivel() + " y me queda " + getVida() + " de vida";
    }

    public void sonido() {
        System.out.println("Soy un pokemon tipo agua y sueno así");
    }
    
    @Override
    public void atacar(Pokemon pokemon) {
        double multiplicador = 1;

        if (pokemon.getClass().getName() == "PokemonFuego") {
            multiplicador = 1.2;
            System.out.println("El Ataque ha sido MUY efectivo y ha hecho un 20% más de daño");
           
        }
        
        if (pokemon.getClass().getName() == "PokemonAgua") {
            multiplicador = 1.0;

        }
        
        if (pokemon.getClass().getName() == "PokemonPlanta") {
            multiplicador = 1.0;

        }
            
        System.out.println(this.toString());
        System.out.println(pokemon.toString());
        pokemon.setVida(pokemon.getVida() - (this.getPoderAtaque() * multiplicador));
        System.out.println(this.toString());
        System.out.println(pokemon.toString());
        System.out.println();

    }

}
