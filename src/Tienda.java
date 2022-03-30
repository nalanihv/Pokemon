import java.util.ArrayList;

public class Tienda {

    //Atributos
    //nombre - String
    //objetos disponibles - ArrayList<Objetos>
    private String nombre;
    private ArrayList<Objeto> objetosDisponibles = new ArrayList<>();

    //metodos
    //comprar
    public boolean usuarioComprar(double dinero, int cantidad, int indiceObjeto){
            //validar que hay suficientes objetos del tipo requerido(?)
            //Si hay cantidad y existe en el arreglo
                //Si si tengo dinero suficiente
                    //le vendo
                //Si no
                    //Mostrar que no le alcanza
            //Sino
                //hacer una excepcion de que no hay la cantidad que pide
                //repetimos pregunta
            return false;
    }

    //vender
    public boolean usuarioVender(Objeto objeto, int cantidad){
        //logica inversa de comprar
        //dinero infinito en la tienda
        //recibir objetos y darle el dinero
        return false;
    }


}
