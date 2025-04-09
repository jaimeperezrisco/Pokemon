import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int opcion; // opcion del 1º switch
        int opcion2 = 1; // opcion 2º switch
        int seleccion = 0; // variable de seleccion de elegir pokemon (caso1)

        // Creamos Pokemon Tipo Fuego
        PokemonFuego Charizar = new PokemonFuego("Charizar", 50, 100, 100, 30);
        PokemonFuego Arcanine = new PokemonFuego("Arcanine", 55, 100, 100, 30);
        PokemonFuego Rapidash = new PokemonFuego("Rapidash", 50, 100, 100, 27);
        PokemonFuego Magmar = new PokemonFuego("Magmar", 45, 100, 100, 25);
        PokemonFuego Flareon = new PokemonFuego("Flareon", 50, 100, 100, 26);

        // Creamos Pokemon Tipo Agua
        PokemonAgua Squirtle = new PokemonAgua("Squirtle", 15, 100, 100, 10);
        PokemonAgua Blastoise = new PokemonAgua("Blastoise", 60, 100, 100, 36);
        PokemonAgua Gyarados = new PokemonAgua("Gyarados", 65, 100, 100, 35);
        PokemonAgua Vaporeon = new PokemonAgua("Vaporeon", 55, 100, 100, 28);
        PokemonAgua Poliwrath = new PokemonAgua("Poliwrath", 50, 100, 100, 31);

        // Creamos Pokemon Tipo planta
        PokemonPlanta Bulbasur = new PokemonPlanta("Bulbasur", 10, 100, 100, 15);
        PokemonPlanta Venusaur = new PokemonPlanta("Venusaur", 65, 100, 100, 32);

        // Entrenador
        Entrenador JaimeKetchup = new Entrenador();

        // Lista con los Pokemons que hay en el mundo
        ArrayList<Pokemon> listaPokemonMundo = new ArrayList<>();
        listaPokemonMundo.add(Venusaur); // index 0
        listaPokemonMundo.add(Blastoise); // index 1
        listaPokemonMundo.add(Flareon); // index 2
        listaPokemonMundo.add(Arcanine); // index 3
        listaPokemonMundo.add(Poliwrath); // index 4
        listaPokemonMundo.add(Magmar); // index 5

        // Lista de la pokedex de Jaime
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        listaPokemon.add(Charizar); // index 0
        listaPokemon.add(Rapidash); // index 1
        listaPokemon.add(Vaporeon); // index 2
        listaPokemon.add(Gyarados); // index 3
        listaPokemon.add(Bulbasur); // index 4
        listaPokemon.add(Squirtle); // index 5

        // Bucle principal donde el elegimos la opcion del menu se ejecuta hasta que selecciones 0
        do {
            Scanner scanner = new Scanner(System.in);
            // opciones del menu
            System.out.println("Hola JaimeKetchup!!! Que quieres hacer?? ");
            System.out.println("1) Elige un pokemon");
            System.out.println("2) Meterse en la hierba");
            System.out.println("0) Apagar Nintendo");
            // pedimos opcion al usuario
            System.out.print("Inserta una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1: // elegir pokemon
                    System.out.println("¿¿Que Pokemon quieres seleccionar?? (Introduce un nº)");

                    // iteramos la lista y mostramos por pantalla cada opcion de la pokedex de jaime
                    for (int i = 0; i < listaPokemon.size(); i++) {
                        System.out.println((i + 1) + " " + (listaPokemon.get(i)));
                    }
                    // seleccionamos una opcion de la lista y la guardamos en una variable
                    seleccion = scanner.nextInt();
                    seleccion = seleccion - 1;
                    System.out.println("Perfecto!!! Has seleccionado a " + listaPokemon.get(seleccion).getNombre() + " para pelear");
                    break;

                case 2: // Menu de meterse en la hierba para iniciar pelea

                    // mostramos a que pokemon hemos elegido para pelear usando la variable
                    // seleccion
                    System.out.println("Pokemon seleccionado para el combate " + listaPokemon.get(seleccion).getNombre());
                    System.out.println("Buscando POKEMONES en la hierba.......");

                    if (listaPokemonMundo.isEmpty()) {
                        System.out.println("Te has pasado el juego...., ya no quedan más Pokemon en la lista");
                        return;
                    }
                    System.out.println("Cargando combate.......");

                    /*
                     * Generamos numero aleatorio https://www.w3api.com/Java/Math/random/
                     * Y seleccionamos un pokemon de la listapokemon en base a nº aleatorio
                     */
                    int randomNum = (int) (Math.random() * listaPokemonMundo.size());
                    System.out.println("Has encontrado a un " + listaPokemonMundo.get(randomNum).getNombre() + " para pelear!!!");
                    System.out.println("¡¡¡¡HA COMENZADO EL COMBATE ENTRE " + listaPokemon.get(seleccion).getNombre() + " VS " + listaPokemonMundo.get(randomNum).getNombre() + "!!!!");
                    System.out.println();
                    // Mostramos el menu de opciones del la pelea
                    System.out.println("Controles: Pulsa 1 para atacar, 2 para capturar y 0 para salir");

                    // inicializamos opcion antes del bucle si no muestra el 1º menu en un 2º combate
                    opcion2 = 1;

                    while (opcion2 != 0) {
                    // leemos lo que ha marcado el usuario, mientras no sea 0
                    opcion2 = scanner.nextInt();

                        switch (opcion2) {
                            case 1:// en caso de elegir uno Atacamos al otro Pokemon
                                   // llamamos a la funcion atacar y atacamos a un Pokemonm de ListaPokemonMundo
                                listaPokemon.get(seleccion).atacar(listaPokemonMundo.get(randomNum));
                                // si la vida del Pokemon es menor o igual 0, imprimimos mensaje y lo eliminamos
                                if (listaPokemonMundo.get(randomNum).getVida() <= 0) {
                                    System.out.println("Has matado a " + listaPokemonMundo.get(randomNum).getNombre()
                                            + "!!! y se ha eliminado de la lista");
                                    listaPokemonMundo.remove(randomNum);
                                    System.out.println("-----------------------------------------------");
                                    opcion2 = 0; // salimos del combate si se cumple la condicion
                                }
                                break;

                            case 2:// en caso de elegir dos intentamos capturar al otro Pokemon

                                // imprimimos mensaje, ejecutamos el metodo capturar y en caso de que se cumpla
                                System.out.println("Has lanzado una POKEBALL");
                                if (JaimeKetchup.capturar(listaPokemon, listaPokemonMundo, randomNum) == true) {
                                    opcion2 = 0; // salimos del menu de combate si se cumple la condicion
                                }
                                System.out.println("--------------------------");
                                ;
                                break;

                            case 0:// en caso de elegir 0 abandonamos el combate
                                System.out.println("Has dejado el combate");
                                System.out.println("--------------------------");
                                break;
                            default:
                                break;
                        }

                    }

                    break;

                case 0: // cerramos el programa
                    System.out.println("Apagando la nintendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;

            }
        } while (opcion != 0);

    }

}
