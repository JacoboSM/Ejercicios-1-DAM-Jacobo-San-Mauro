package org.example;

import java.util.Scanner;

public class Ejercicio_3_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("¿Dime un numero? ");
        double num = read.nextDouble();

        if (num > 0 ){
            
            System.out.println(num + " es un numero positivo");
            
        } else if (num < 0) {

            System.out.println(num + " es un numero negativo");
            
        }else{

            System.out.println(num + " es un numero natural");
        }
    }

}