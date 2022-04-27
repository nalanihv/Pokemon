import java.util.ArrayList;

public class Entrenador extends Personaje{

    //region - String
    //torneosGanados - int
    //pokedex - Arraylist<Pokemon>
    //mochila - ArrayList<Objeto>

    private String region;
    private int torneosganados;
    private ArrayList<Pokemon> pokedex = new ArrayList<>();
    private ArrayList<Objeto> mochila = new ArrayList<>();

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getTorneosganados() {
        return torneosganados;
    }

    public void setTorneosganados(int torneosganados) {
        this.torneosganados = torneosganados;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public void setMochila(ArrayList<Objeto> mochila) {
        this.mochila = mochila;
    }

    public Entrenador(String nombre, int nivel, char genero, String region, int torneosganados, ArrayList<Pokemon> pokedex, ArrayList<Objeto> mochila) {
        super(nombre, nivel, genero);
        this.region = region;
        this.torneosganados = torneosganados;
        this.pokedex = pokedex;
        this.mochila = mochila;
    }

    //pelear - Abstracto implementado
        //escoger pokemon del pokedex

            //si su HP es superior a 15
                //escoger 2 fuertes y 1 debil aleatorios
            //si no tiene fuertes, poner 3 aleaatorios
        //arreglo de pokemones a usar en la pelea


        //darle a escoger el pokemon al entrenador
        //mostrar estadisticas del pokemon
            //menu para pelear, curar, aumentar ataque o velocidad
        //si escoge pelear
            //llamar al metodo pelear del pokemon
        //si escoge curar
            //hay que validar si hay pocion/baya de curacion, usar
        //si escoge +ataque
            //hay que validar si hay pocion/baya de +ataque, usar
        //si escoge velocidad
            //hay que validar si hay pocion/baya de +velocidad, usar


    //ganar metodo -> el entrenador opuesto ya no tienepokemones
        //nivel 1 = 10 xp pokemon y entrenador
        //nivel n = 10 xp * 1.5 pokemon y entrenador
    //perder metodo -> yo me quedo sin pokemones

    //tirar objeto
        //mostrar los elementos de mochila
        //que el usuario escoja cual tirar

    //intercambiar
        //mostrar la pokedex
        //mostrar la pokedex del entrenador opuesto
        //escogo el pokemon que quiero
        // le propongo un de mi pokedex
        //y con random true o false acepta
        //si true
            //get y add + remove

}
