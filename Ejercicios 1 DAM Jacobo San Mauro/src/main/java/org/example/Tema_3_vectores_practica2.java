package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_vectores_practica2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido a la primitiva introduce los numeros de tu billete (recuerda que el formato tiene que ser N-N-N-N-N-N/R");
        String numeros_string = read.nextLine();

        boolean comprobar = numeros_string.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        if (comprobar){

            String[] vector = numeros_string.split("[-/]");
            int[] vector_numeros = new int[vector.length];

            for (int i = 0; i < vector.length ; i++){

                vector_numeros[i] = Integer.parseInt(vector[i]);

            }

            int



        }


    }

}
