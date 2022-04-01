public class Pokebola extends Objeto{
    //efectividad - double
    private double efectividad;

    public Pokebola(double costo, int cantidad, String nombre, String tipo, double efectividad) {
        super(costo, cantidad, nombre, tipo);
        this.efectividad = efectividad;
    }

    //atrapar/usar retorna true / false
    //revisar el tipo de pokemon
        //si es legendario le quitamos 40 de efectividad
    //hacemos un rango del 1 al 100,
        // si se obtiene un numero entre uno y la efectividad,
            // que lo atrape
            // y restamos la pokebola
        //sino
            //intenta otra ves hasta que se acaben las pokebolas
            //o el usuario ya no quiera intentar


}
