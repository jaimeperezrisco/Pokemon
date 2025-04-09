import java.util.ArrayList;

public class Entrenador {

    private int pokeball;

    public int getPokeball() {
        return pokeball;
    }

    public void setPokeball(int pokeball) {
        this.pokeball = pokeball;
    }

    // constructor por defecto, entrenador aparece con 6 pokeballs
    public Entrenador() {
        this.pokeball = 6;
    }

    public boolean capturar(ArrayList<Pokemon> listaPokemon, ArrayList<Pokemon> listaPokemonMundo, int index) {
        if (listaPokemonMundo.isEmpty()) {
            System.out.println("No se puede quedan no Pokemons por capturar");
            return false;
        }
        int numeroPokeballs = this.getPokeball();
        if (numeroPokeballs == 0) {
            System.out.println("No puedes capturar más pokemons, te quedan 0 Pokeballs");
            return false;
        }
        pokeball--;

        double probabilidadPokeball = 0.5;
        Pokemon pokemon = listaPokemonMundo.get(index);
        double probabilidadCaputura = probabilidadPokeball * (pokemon.getVida() / pokemon.getVidaMaxima());
        double numeroAleatorio = Math.random();

        if (numeroAleatorio < probabilidadCaputura) {
            System.out.println("DE LOCOS!!! Has capturado a " + pokemon.getNombre() + "!!!");
            System.out.println("Se ha añadido a " + pokemon.getNombre() + " a la Pokedex");
            System.out.println("Ahora te quedan " + this.getPokeball() + " Pokeball");
            listaPokemon.add(pokemon);
            listaPokemonMundo.remove(index);
            System.out.println(pokemon.toString());
            return true;
        } else {
            System.out.println("No ha habido suerte, no se ha podido capturar a " + pokemon.getNombre());
            System.out.println("Ahora te quedan " + this.getPokeball() + " Pokeball");
            return false;
        }
    }

}
