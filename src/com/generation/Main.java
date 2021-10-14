package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String mensaje = saludar("Gerardo");
        System.out.println(mensaje);
        int resultado = Suma(5,3);
        System.out.println(resultado);
        alerta("Mensaje de Prueba");*/
        System.out.println(Math.PI);
        double num1=13.75;
        double num2=23.12;

        System.out.println(Math.sqrt(num2));

    }

    public static String saludar(String nombre){

        return "¿Hola como estas "+nombre+" ?";
    }

    public static int Suma(int num1,int num2){
        return num1+num2;
    }

    public static void alerta(String mensaje ){
        System.out.println(mensaje);
    }

}
