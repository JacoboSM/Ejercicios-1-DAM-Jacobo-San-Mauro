package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class pruebas {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int[] vector = {1,2,3,4,5};
        int aux = vector[0];
        int aux2 = vector[0];

        System.out.println(aux);

        for (int i = 0 ; i < vector.length - 1 ; i++){

            if (i == 0) {
                vector[i] = vector[vector.length - 1];  // pone 5 en la posición 0
            } else {
                vector[i] = vector[i + 1];              // desplaza hacia la izquierda
            }

        }

// al final colocamos aux2 (=1) en la posición 1
        vector[1] = aux2;

        System.out.println(Arrays.toString(vector));

    }

}
