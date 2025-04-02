import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        // Tipo Fuego
        PokemonFuego Charizar = new PokemonFuego();
        Charizar.sonido();

        // Tipo Agua

        PokemonAgua Squirtle = new PokemonAgua();
        System.out.println(Squirtle);
        Squirtle.sonido();
        // Tipo planta

        PokemonPlanta Bulbasur = new PokemonPlanta();
        Bulbasur.sonido();

        // ArrayList<Mundo>listaPokemonMundo =new ArrayList<>();

        // ArrayList <Pokemon> listaPokemon = new ArrayList<>();
        // list.add(charmander)//hay que previmanete crear el pokemon
    }
}
