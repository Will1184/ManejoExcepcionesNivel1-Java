package manejoexepcciones1;

import domain.Division;

import javax.management.OperationsException;

public class ManejoExepcciones1 {
    public static void main(String[] args) {
        try {
            Division division = new Division(10,0);
            division.visualizarOperacion();
        }catch (OperationsException oe){
            System.out.println("ocurrio un error!!!");
            oe.printStackTrace();
        }
    }
}