package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_vectores_practica2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();
        int max = 49
        int min = 0;

        System.out.println("Bienvenido a la primitiva introduce los numeros de tu billete (recuerda que el formato tiene que ser N-N-N-N-N-N/R");
        String numeros_string = read.nextLine();

        boolean comprobar = numeros_string.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");

        if (comprobar){

            String[] vector = numeros_string.split("[-/]");
            int[] vector_numeros = new int[vector.length];

            for (int i = 0; i < vector.length ; i++){

                vector_numeros[i] = Integer.parseInt(vector[i]);

            }

<<<<<<< HEAD

=======
            int[] vector_numeros_suerte = new int [6]

            for (int i = 0; i < vector_numeros_suerte.length ; i++){

                int numero_random = random.nextInt(max - min + 1)-min;

                vector_numeros_suerte[i] = numero_random


            }

            Array.sort(vector_numeros_suerte);

            for (int i = 0; i <= vector.length-1; i++) {

                if (vector[i] == vector[i+1]){

                    vector[i] = -1000;

                }else {

                    tam++;

                }

            }

            int[] limpio = new int [tam];
            int j = 0;

            for (int i = 0; i< vector.length; i++){

                if (vector[i] != -1000){

                    limpio[j] = vector[i];
                    j++;

                }

            }
>>>>>>> 37427346e9c7c8a82ef09585342d3dfb3f4e3456



        }


    }

}
