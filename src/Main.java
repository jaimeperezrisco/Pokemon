import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int opcion;

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

        //Entrenador
        Entrenador JaimeKetchup = new Entrenador();



        //Lista con los Pokemons que hay en el mundo
        ArrayList<Pokemon> listaPokemonMundo = new ArrayList<>();
        listaPokemonMundo.add(Venusaur); // index 0
        listaPokemonMundo.add(Blastoise); // index 1
        listaPokemonMundo.add(Flareon); // index 2
        listaPokemonMundo.add(Arcanine); // index 3
        listaPokemonMundo.add(Poliwrath); // index 4
        listaPokemonMundo.add(Magmar); // index 5


        //Lista de la pokedex de Jaime
        ArrayList<Pokemon> listaPokemon = new ArrayList<>();
        listaPokemon.add(Charizar); // index 0
        listaPokemon.add(Rapidash); // index 1
        listaPokemon.add(Vaporeon); // index 2
        listaPokemon.add(Gyarados); // index 3
        listaPokemon.add(Bulbasur); // index 4
        listaPokemon.add(Squirtle); // index 5

        

        
         //pelea fuego vs planta
         System.out.println("Combate entre " + Charizar.getNombre() + " y " + Venusaur.getNombre());
         System.out.println(Charizar);
         System.out.println(Venusaur);
          
         listaPokemon.get(0).atacar(listaPokemonMundo.get(0));
         Charizar.atacar(Venusaur);
         System.out.println(Charizar);
         System.out.println(Venusaur);

         /* 
         * System.out.println(listaPokemon.get(0));
         * System.out.println(listaPokemonMundo.get(0));
         * 
         * System.out.println();
         * 
         * // planta vs agua
         * System.out.println(
         * "Combate entre " + listaPokemon.get(4).getNombre() + " y " +
         * listaPokemonMundo.get(0).getNombre());
         * 
         * System.out.println(listaPokemon.get(4));
         * System.out.println(listaPokemonMundo.get(0));
         * 
         * listaPokemon.get(4).atacar(listaPokemonMundo.get(0));
         * 
         * System.out.println(listaPokemon.get(4));
         * System.out.println(listaPokemonMundo.get(0));
         * 
         * listaPokemon.get(4).atacar(listaPokemonMundo.get(0));
         * 
         * System.out.println(listaPokemon.get(4));
         * System.out.println(listaPokemonMundo.get(0));
         * 
         * listaPokemon.get(4).atacar(listaPokemonMundo.get(0));
         * 
         * System.out.println(listaPokemon.get(4));
         * System.out.println(listaPokemonMundo.get(0));
         */
        // Captura
        //JaimeKetchup.añadirPokedex(JaimeKetchup, listaPokemon, listaPokemonMundo, 0);
       
        
                
                do {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Hola JaimeKetchup!!! Que quieres hacer?? "); 
                    System.out.println("1) Elige un pokemon");
                    System.out.println("2) Retirar saldo");
                    System.out.println("0) Salir ");
                    System.out.print("Inserta una opción: ");
                    
                    
                    opcion = scanner.nextInt();
        
                    switch (opcion) {
                        case 1:
                            System.out.println("¿¿Que Pokemon quieres seleccionar??");
                            System.out.println(listaPokemonMundo.getFirst());
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            System.out.println("Saliendo...");
                            break;
                        default:
                            System.out.println("Opción inválida");
                            break;
                    }
                } while (opcion != 0);


            
        
        
    }

        
}


