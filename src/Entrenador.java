import java.util.ArrayList;

public class Entrenador {

    // creamos una variable para almacenar las pokeballs
    private int pokeball;

    // getters y setters de pokeball
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

    // creamos metodo capturar que devuelve true o falso y le pasamos por argumentos las listas de pokemon y el index ya que necesita saber a que pokemon se refiere para funcionar
    public boolean capturar(ArrayList<Pokemon> listaPokemon, ArrayList<Pokemon> listaPokemonMundo, int index) {
        // comprobamos si listaMundo está vacia, si es true se acaba el metodo
        if (listaPokemonMundo.isEmpty()) {
            System.out.println("No se puede quedan no Pokemons por capturar");
            return false;
        }
        // comprobamos que queden Pokeballs disponibles, si no quedan se acaba el metodo
        int numeroPokeballs = this.getPokeball();
        if (numeroPokeballs == 0) {
            System.out.println("No puedes capturar más pokemons, te quedan 0 Pokeballs");
            return false;
        }

        // en caso de que se pueda ejecutar el metodo restamos una Pokeball con cada uso
        pokeball--;

        // definimos la probabilidad de la pokeball y llamamos Pokemon al pokemon seleccionado
        double probabilidadPokeball = 0.5;
        Pokemon pokemon = listaPokemonMundo.get(index);
        // la formula del enunciado creo que estaba mal(creo) pero busqué y si pones 1- ahi, se soluciona
        double probabilidadCaputura = probabilidadPokeball * (1 - pokemon.getVida() / pokemon.getVidaMaxima());
        double numeroAleatorio = Math.random();

        // en caso de que la probabilidad de captura sea mayor que el nº aleatorio añadimos el pokemon a la lista y la quitamos de listaMundo y devuelve true
        if (numeroAleatorio < probabilidadCaputura) {
            System.out.println("DE LOCOS!!! Has capturado a " + pokemon.getNombre() + "!!!");
            System.out.println("Se ha añadido a " + pokemon.getNombre() + " a la Pokedex");
            System.out.println("Ahora te quedan " + this.getPokeball() + " Pokeball");
            listaPokemon.add(pokemon);
            listaPokemonMundo.remove(index);
            System.out.println(pokemon.toString());
            return true;
        } else {
            // y en caso que no se cumpla la condicion devuelve falso
            System.out.println("No ha habido suerte, no se ha podido capturar a " + pokemon.getNombre());
            System.out.println("Ahora te quedan " + this.getPokeball() + " Pokeball");
            return false;
        }
    }

}
