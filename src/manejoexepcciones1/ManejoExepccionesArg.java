package manejoexepcciones1;

import domain.Division;

import javax.management.OperationsException;

public class ManejoExepccionesArg {
    public static void main(String[] args) throws OperationsException {
        try {
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);
            Division div = new Division(op1,op2);
            div.visualizarOperacion();
            //error de array
        } catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Ocurrio una exepcion: ");
            System.out.println("hubo un error al acceder un elemento fuera de rango");
            aie.printStackTrace();
            //error de formato numero
        }   catch (NumberFormatException nfe){
            System.out.println("ocurrio una exepccion: ");
            System.out.println("unode los argumentos no es entero");
            nfe.printStackTrace();
            //error de operacion
        }   catch (OperationsException oe) {
            System.out.println("ocurrio una excepcion : ");
            System.out.println("se trato de realizar una operacion erronea");
            oe.printStackTrace();
            //siempre se va a correr
        }   finally {
            System.out.println("se terminron de revisar las exepcciones");
        }


    }
}

