package org.example;

import java.util.Arrays;
import java.util.Scanner;


public class Tema_3_vectores_actividad_eliminarduplicados1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Integer[] vector = {1, 2, 2, 3, 4, 4, 5};
        Integer[] aux = new Integer[vector.length];
        int tam = 0;


        for (int i = 0; i < vector.length; i++) {

            boolean hay = Arrays.asList(aux).contains(vector[i]);

            if (!hay) {


                aux[i] = vector[i];
                tam++;

            }

            System.out.println(Arrays.toString(aux));

            }

        Integer[] limpio = new Integer[tam];

        for (int i = 0; i < aux.length; i++){



        }


    }

}



