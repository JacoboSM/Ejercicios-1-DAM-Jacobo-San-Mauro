package org.example;

import java.util.Scanner;

public class Ejercicio_5_bateria_de_ejercicios_sencillos_Java_Programacion {
    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Dime el primer numero");
        double num1 = read.nextDouble();

        System.out.println("Dime el segundo numero");
        double num2 = read.nextDouble();

        if (num2 == 0){

            System.out.println("ERROR: no se puede dividir entre 0 ");

        }else {

            double resultado = num1 / num2;
            System.out.println("El resultado de la división es " + resultado);

        }

    }
}