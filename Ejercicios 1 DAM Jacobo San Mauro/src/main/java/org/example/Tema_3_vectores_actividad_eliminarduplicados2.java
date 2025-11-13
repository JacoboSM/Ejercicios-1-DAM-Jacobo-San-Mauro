package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_vectores_actividad_eliminarduplicados2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] vector = {1, 2, 2, 3, 4, 4, 5};
        int tam = 0;


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

    }

}
