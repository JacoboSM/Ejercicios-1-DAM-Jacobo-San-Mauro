package org.example;

import java.nio.charset.MalformedInputException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema_2_Strings_Practica_2 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

         double num2 = 0;
         double num1 = 0;

        System.out.println("**** BENVENIDO A LA CALCULADORA RÁPIDA ****");

        try {

            System.out.println(">  Introduce el primer operando :");
            num1 = read.nextDouble();
            read.nextLine();

        } catch (InputMismatchException e) {

            System.out.println("Utiliza solo numeros porfavor");
            return;
        }

        System.out.println("----------------------------------");
        System.out.println("   [+] ->    sumar");
        System.out.println("   [-] ->    restar");
        System.out.println("   [x] ->    multiplicar");
        System.out.println("   [/] ->    dividir");
        System.out.println("   [R] ->    raíz cuadrada");
        System.out.println("----------------------------------");

        System.out.println("Elige una operacíon :");
        String operacion = read.nextLine();

        if (operacion.toLowerCase().equals("r")){

            System.out.println("Has elegido raíz cuadrada!");

        }else {

            try{

                System.out.println(" > Introduce el segundo operando :");
                num2 = read.nextDouble();

            }catch (InputMismatchException e){

                System.out.println("Utiliza solo numeros porfavor");
                return;

            }

        }

        switch (operacion.toLowerCase()){

            case "+":

                System.out.println("Has elegido sumar!");
                double resultado = num1 + num2;
                System.out.println("El resultado de " + num1 + " + " + num2 + " es " + resultado);
                break;

            case "-":

                System.out.println("Has elegido restar");
                double resultado2 = num1 - num2;
                System.out.println("El resultado de " + num1 + " - " + num2 + " es " + resultado2);
                break;

            case "x":

                System.out.println("Has elegido multiplicar!");
                double resultado3 = num1 * num2;
                System.out.println("El resultado de " + num1 + " * " + num2 + " es " + resultado3);
                break;

            case "/":

                if (num2 == 0) {

                    System.out.println("No se puede dividir entre 0");
                    return;

                }else {

                    System.out.println("Has elegido dividir!");
                    double resultado4 = num1 / num2;
                    System.out.println("El resultado de " + num1 + " / " + num2 + " es " + resultado4);

                }

                break;

            case "r":

                if (num1 < 0){

                    System.out.println("No se pueden hacer raizes negativas");
                    return;

                } else {
                    double resultado5 = Math.sqrt(num1);
                    System.out.println("El resultado de la raiz cuadrada de  " + num1 + " es "  + resultado5);

                }
                break;

            default:

                System.out.println("El signo no esta entre los mencionados prueba otra vez");

        }
    }
}
