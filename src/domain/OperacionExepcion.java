package domain;

public class OperacionExepcion extends Exception{


    public OperacionExepcion(String mensaje){
        //inicializamos el error de la clase padre
        super(mensaje);
    }
}
