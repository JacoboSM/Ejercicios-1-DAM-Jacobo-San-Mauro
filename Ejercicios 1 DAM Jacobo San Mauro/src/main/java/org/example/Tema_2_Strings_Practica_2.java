package org.example;

import java.util.Scanner;

public class Tema_2_Strings_Practica_2 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        System.out.println("**** BENVENIDO A LA CALCULADORA RÁPIDA ****");

        System.out.println(">  Introduce el primer operando :");
        double num1 = read.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("   [+] ->    sumar");
        System.out.println("   [-] ->    restar");
        System.out.println("   [x] ->    multiplicar");
        System.out.println("   [/] ->    dividir");
        System.out.println("   [R] ->    raíz cuadrada");
        System.out.println("----------------------------------");

        System.out.println("Elige una operacíon :");
        String operacion = read.nextLine();

        System.out.println(" > Introduce el segundo operando :");
        double num2 = read.nextDouble();

        switch (operacion){

            case "+":
                double resultado = num1 + num2;
                System.out.println("El resultado de " + num1 + "+" + num2 + "es" + resultado);

            case "-":

        }


    }

}
