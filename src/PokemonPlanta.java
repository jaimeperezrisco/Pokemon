public abstract class PokemonPlanta {
    //atributos


    //metodos
    @Override
    public String toString() {
        return "Soy un pokemon tipo: " + getClass();
    }

    public void sonido(){
        System.out.println("Soy un pokemon tipo planta y sueno así");
    }
}
