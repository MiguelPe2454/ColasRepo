/**
 * Created by User on 15/11/2017.
 */
public class Main {

    public static void main(String[]args){
        Cola cola = new Cola();

        cola.insertar(10);
        cola.insertar(5);
        cola.insertar(19);
        cola.mostrar();
        cola.extraer();
        cola.mostrar();
        cola.insertar(2);
        cola.mostrar();
    }
}
