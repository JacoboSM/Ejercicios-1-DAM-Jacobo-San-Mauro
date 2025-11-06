package org.example;

import java.util.Scanner;

public class Tema_3_Vectores_bateria1_ejercicio6 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int[] vector ={1,2,3,2,1};

        boolean es = true;

        for (int i = 0 ; i < vector.length/2 ; i++ ){

            if ( vector[i] == vector[vector.length-1-i] ){

                System.out.println("No es palindromo");
                es = false;
                break;
            }


        }

        if (es) System.out.println("Es palindromo");

    }

}
