public abstract class PokemonFuego {
    //atrbutos


    //metodos
    @Override
    public String toString() {
        return "Soy un pokemon tipo: " + getClass();
    }

    public void sonido(){
        System.out.println("Soy un pokemon tipo fuego y sueno así");
    }
}
