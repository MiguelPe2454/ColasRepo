/**
 * Created by User on 15/11/2017.
 */
public class Cola {
    private Nodo frente; //el inicial de la cola

    //Constructor simple
    public Cola(){
        this.frente = null;
    }

    //Método para insertar siguiente elemento (nodo), el elemento debe colocarse detrás del último nodo
    public void insertar(int valor){
        Nodo nuevo = new Nodo(valor);
        if(frente == null){
            frente = nuevo;
        }else{
            Nodo temp = frente;
            while(temp.getProximo() != null){
                temp = temp.getProximo();
            }
            temp.setProx(nuevo);
        }
    }

    //Método para mostrar los elementos de la cola
    public void mostrar(){
        if (frente!= null){
            Nodo temp = frente;
            System.out.println("Los valores de la cola son; ");
            while (temp != null){
                System.out.println(temp.getValor());
                temp = temp.getProximo();
            }
        }else {
            System.out.println("La cola está vacía");
        }
    }

    //Método para extraer el elemento del frente
    public int extraer(){
        if (frente == null){
            return 0;
        }else {
            int valorExtraer = frente.getValor();//Variable temporal
            System.out.println("Valor extraido: "+frente.getValor());
            frente = frente.getProximo();//Cambiar el frente por el siguiente
            return valorExtraer; //Devolver el valor extraido de la cola
        }
    }
}
