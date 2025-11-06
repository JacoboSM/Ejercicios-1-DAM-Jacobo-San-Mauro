package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_Vectores_bateria1_ejercicio5 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int[] vector = {1,2,3,4,5};
        int aux = vector[0] ;
        int aux2 = vector[0];

        for (int i = 0 ; i < vector.length -1 ; i++){

            if ( i == 0 ){

                vector[i] = vector[vector.length-1];
                aux = vector[i+1];
                vector[i+1] = aux2;

            }else {

                aux2 = vector[i+1];
                vector[i+1] = aux;
                aux = aux2;

            }

        }

        System.out.println(Arrays.toString(vector));

    }

}
