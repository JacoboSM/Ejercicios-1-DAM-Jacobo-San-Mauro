package org.example;

import java.util.Scanner;

public class Ejercicio_4_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Dime el primer numero");
        double num1 = read.nextDouble();

        System.out.println("Dime el segundo numero");
        double num2 = read.nextDouble();

        System.out.println("Dime el tercer numero");
        double num3 = read.nextDouble();

        if (num1 == num2 || num1 == num3 || num2 == num3){
            System.out.println("ERROR: hay números introducidos que son iguales ");
        } else if (num1 < num2 && num1 < num3 ) {

            System.out.println("El numero mas pequeño es " + num1);

        } else if (num2 < num1 && num2 < num3) {

            System.out.println("El numero mas pequeño es " + num2);

        }else {
            System.out.println("El numero mas pequeño es " + num3);
        }


    }
}
