package domain;

import javax.management.OperationsException;

public class Division {
    //atrivuto dela clase
    private int numerador;
    //atributo de la clase
    private int denominador;

    /**
     * costruye el objeto divicion
     *
     *
     * @param numerador int
     * @param denominador int
     */

    public Division(int numerador, int denominador)
        throws OperationsException {

        if (denominador == 0){
            //throw new illegaArgumentExeption(Denominador igual a cero
            throw new OperationsException("denominador igual a cero");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public void visualizarOperacion(){
        System.out.println("resultado de la divicion es : "
        + numerador/denominador);
    }
}
