import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        // Tipo Fuego
        PokemonFuego Charizar = new PokemonFuego("Charizar", 50, 100, 100, 23);

        PokemonFuego Arcanine = new PokemonFuego("Arcanine", 55, 100, 100, 30);
        PokemonFuego Rapidash = new PokemonFuego("Rapidash", 50, 100, 100, 27);
        PokemonFuego Magmar = new PokemonFuego("Magmar", 45, 100, 100, 25);
        PokemonFuego Flareon = new PokemonFuego("Flareon", 50, 100, 100, 26);

        // Tipo Agua

        PokemonAgua Squirtle = new PokemonAgua("Squirtle", 15, 100, 100, 10);

        PokemonAgua Blastoise = new PokemonAgua("Blastoise", 60, 100, 100, 36);
        PokemonAgua Gyarados = new PokemonAgua("Gyarados", 65, 100, 100, 35);
        PokemonAgua Vaporeon = new PokemonAgua("Vaporeon", 55, 100, 100, 28);
        PokemonAgua Poliwrath = new PokemonAgua("Poliwrath", 50, 100, 100, 31);

        // Tipo planta

        PokemonPlanta Bulbasur = new PokemonPlanta("Bulbasur", 10, 100, 100, 15);

        PokemonPlanta Venusaur = new PokemonPlanta("Venusaur", 65, 100, 100, 32);
        PokemonPlanta Victreebel = new PokemonPlanta("Victreebel", 55, 100, 100, 30);

        Entrenador JaimeKetchup = new Entrenador();

        ArrayList<Pokemon> listaPokemonMundo = new ArrayList<>();
        listaPokemonMundo.add(Venusaur);
        listaPokemonMundo.add(Blastoise);
        listaPokemonMundo.add(Flareon);
        listaPokemonMundo.add(Arcanine);
        listaPokemonMundo.add(Poliwrath);
        listaPokemonMundo.add(Magmar);

        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        listaPokemon.add(Charizar);
        listaPokemon.add(Rapidash);
        listaPokemon.add(Vaporeon);
        listaPokemon.add(Gyarados);
        listaPokemon.add(Bulbasur);
        listaPokemon.add(Squirtle);

        // pelea fuego vs planta
        System.out.println(
                "Combate entre " + listaPokemon.get(0).getNombre() + " y " + listaPokemonMundo.get(0).getNombre());
        System.out.println(listaPokemon.get(0));
        System.out.println(listaPokemonMundo.get(0));

        listaPokemon.get(0).atacar(listaPokemonMundo.get(0));

        System.out.println(listaPokemon.get(0));
        System.out.println(listaPokemonMundo.get(0));

        System.out.println();

        // planta vs agua
        System.out.println(
                "Combate entre " + listaPokemon.get(4).getNombre() + " y " + listaPokemonMundo.get(0).getNombre());

        System.out.println(listaPokemon.get(0));
        System.out.println(listaPokemonMundo.get(4));

        listaPokemon.get(4).atacar(listaPokemonMundo.get(0));

        System.out.println(listaPokemon.get(4));
        System.out.println(listaPokemonMundo.get(0));

        if (JaimeKetchup.capturar(listaPokemonMundo.get(0)) == true) {
            listaPokemon.add(listaPokemonMundo.get(0));
            listaPokemonMundo.remove(listaPokemonMundo.get(0));
            System.out.println("Se ha capturado el pokemon " + listaPokemonMundo.get(0).getNombre() + " y se ha añadido a la Pokedex");
            // System.out.println(listaPokemonMundo);

            // System.out.println(listaPokemon);
        } else {
            System.out.println("Captura fallida se ha gastado una pokeball");
            JaimeKetchup.setPokeball(JaimeKetchup.getPokeball() - 1);
            
            System.out.println("Te quedan " + JaimeKetchup.getPokeball());
        }

    }
}
