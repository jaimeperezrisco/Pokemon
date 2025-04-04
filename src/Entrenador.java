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

    public boolean capturar(Pokemon pokemon) {

        int numeroPokeballs = this.getPokeball();
        if (numeroPokeballs == 0) {
            System.out.println("No puedes capturar más pokemons, te quedan 0 Pokeballs");
            return false;
        }
        double probabilidadPokeball = 0.5;

        double probabilidadCaputura = probabilidadPokeball * (pokemon.getVida() / pokemon.getVidaMaxima());

        double numeroAleatorio = Math.random();

        if (numeroAleatorio < probabilidadCaputura) {
            return true;
        } else {
            return false;
        }

    }

    public void añadirPokedex(Entrenador JaimeKetchup, ArrayList<Pokemon> listaPokemon,
            ArrayList<Pokemon> listaPokemonMundo, int index) {
        if (listaPokemonMundo.isEmpty()) {
            System.out.println("No se puede quedan no Pokemons por capturar");
        }

        Pokemon pokemonSeleccionado = listaPokemonMundo.get(index);

        if (JaimeKetchup.capturar(pokemonSeleccionado) == true) {
            listaPokemon.add(pokemonSeleccionado);
            listaPokemonMundo.remove(index);
            System.out.println(
                    "Se ha capturado el pokemon " + pokemonSeleccionado.getNombre() + " y se ha añadido a la Pokedex");
        } else {
            System.out.println("Captura fallida se ha gastado una pokeball");
            JaimeKetchup.setPokeball(JaimeKetchup.getPokeball() - 1);

            System.out.println("Te quedan " + JaimeKetchup.getPokeball());
        }
    }

}
