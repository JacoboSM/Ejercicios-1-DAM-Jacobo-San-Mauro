package org.example;


import java.util.Scanner;

public class Ejercicio_1_bateria_de_ejercicios_sencillos_Java_Programacion {

    public static void main (String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("¿Que horas trabajas? ");
        double horas = read.nextDouble();

        System.out.println("¿Cuanto cobras por hora? ");
        double precio = read.nextDouble();

        double resultado = horas * precio;
        System.out.println("Salario: " + resultado);

    }

}
