public class Entrenador {
    
   private int pokeball;

    public int getPokeball() {
        return pokeball;
    }

    public void setPokeball(int pokeball) {
        this.pokeball = pokeball;
    }

    //constructor por defecto, entrenador aparece con 6 pokeballs
    public Entrenador() {
        this.pokeball = 6;
    }

    public boolean capturar(Pokemon pokemon) {

        double probabilidadPokeball = 0.5;

        double probabilidadCaputura = probabilidadPokeball * (pokemon.getVida() / pokemon.getVidaMaxima());

        double numeroAleatorio = Math.random();

        if (numeroAleatorio < probabilidadCaputura) {
            return true;
        } else {
            return false;
        }
    }
}
