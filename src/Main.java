import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int opcion; //opcion del switch
        int opcion2;
        int seleccion = 0; // variable de seleccion de elegir pokemon (caso1)
        int seleccionAtaque = 0; // variable de seleccion de elegir pokemon (caso2)
        int seleccionCapturar = 0;

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

        // pelea fuego vs planta

        /*
        System.out.println("Combate entre " + Charizar.getNombre() + " y " + Venusaur.getNombre());
        System.out.println(Charizar);
        System.out.println(Venusaur);

        listaPokemon.get(0).atacar(listaPokemonMundo.get(0));
        Charizar.atacar(Venusaur);
        System.out.println(Charizar);
        System.out.println(Venusaur);
        */
        
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hola JaimeKetchup!!! Que quieres hacer?? ");
            System.out.println("1) Elige un pokemon");
            System.out.println("2) Meterse en la hierba");
            System.out.println("3) Capturar");
            System.out.println("0) Escapar");

            System.out.print("Inserta una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1: // elegir pokemon
                    System.out.println("¿¿Que Pokemon quieres seleccionar?? (Introduce un nº)");

                    for (int i = 0; i < listaPokemon.size(); i++) {
                        System.out.println((i + 1) + " " + (listaPokemon.get(i)));

                    }
                    seleccion = scanner.nextInt();
                    seleccion = seleccion - 1;

                    System.out.println("Perfecto!!! Has seleccionado a " + listaPokemon.get(seleccion).getNombre()
                            + " para pelear");
                    break;
                case 2: // menu atacar
                    System.out.println("Pokemon seleccionado para el combate " + listaPokemon.get(seleccion).getNombre());
                    System.out.println("Buscando POKEMONES en la hierba.......");
                    System.out.println("Cargando comabte.......");
                    
                    //generamos numero aleatorio https://www.w3api.com/Java/Math/random/
                    int randomNum = (int) (Math.random() * listaPokemonMundo.size());
                    System.out.println("Has encontrado a un " + listaPokemonMundo.get(randomNum).getNombre() + " para pelear!!!");

                    System.out.println("¡¡¡¡HA COMENZADO EL COMBATE ENTRE " + listaPokemon.get(seleccion).getNombre() + " VS " + listaPokemonMundo.get(randomNum).getNombre() + "!!!!");
                    System.out.println();
                    System.out.println("Controles: Pulsa 1 para atacar, 2 para capturar y 0 para salir");
                   
                    do {
                        
                        opcion2 = scanner.nextInt();
                        switch (opcion2) {
                            case 1://opcion de ataque
                                listaPokemon.get(seleccion).atacar(listaPokemonMundo.get(randomNum));


                                if (listaPokemonMundo.get(randomNum).getVida() <= 0) {
                                    System.out.println("Has matado a " + listaPokemonMundo.get(randomNum).getNombre()
                                            + "!!! y se ha eliminado de la lista");
                                    listaPokemonMundo.remove(randomNum);
                                    System.out.println("-----------------------------------------------");
                                    opcion2=0;
                                    break;
                                }
            
                                break;
                        
                            case 2://opcion capturar
                                System.out.println("Has lanzado una POKEBALL");

                                JaimeKetchup.capturar(listaPokemon, listaPokemonMundo, randomNum);

                                
                               //FALTA AQUI CORREGIR EL OPCION2 PARA QUE VAYA BIEN
                
                            
                                System.out.println("--------------------------");
                                opcion2=0;
                                break;

                            case 3:
                                System.out.println("Han huido los POKEMONES");
                                break;
                            default:
                                break;
                        }
                        
                    } while (opcion2!=0);
                    


                  

                    break;
                case 3: //capturar
                    System.out.println("A que Pokemon quieres capturar (Cuanta menos vida tenga el pokemon más probabilidades)");

                    for (int i = 0; i < listaPokemonMundo.size(); i++) {
                        System.out.println((i + 1) + " " + (listaPokemonMundo.get(i)));
                        System.out.println();

                    }
                    seleccionCapturar = scanner.nextInt();
                    seleccionCapturar = seleccionCapturar - 1;

                    JaimeKetchup.capturar(listaPokemon, listaPokemonMundo, seleccionCapturar);

                    break;

                case 0: // escapar
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
                    
            }
        } while (opcion != 0);

    }

}
