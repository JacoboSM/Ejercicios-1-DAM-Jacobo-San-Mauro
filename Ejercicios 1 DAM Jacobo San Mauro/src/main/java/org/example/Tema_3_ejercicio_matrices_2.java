package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_ejercicio_matrices_2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz =new int[4][4];
        int[][] matriz2 =new int[4][4];
        int[][] matriz3 =new int[4][4];
        int i = 0;
        int j = 0;

        for ( i = 0; i < matriz.length; i++){

            for ( j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = random.nextInt(100)+1;
                matriz2[i][j] = random.nextInt(100)+1;

            }

        }

        System.out.println("Matriz 1");
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(" ");
        System.out.println("Matriz 2 ");
        System.out.println(Arrays.deepToString(matriz2));
        System.out.println(" ");

        for ( i = 0; i < matriz.length; i++){

            for ( j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] >= matriz2[i][j]){

                    matriz3[i][j] = matriz[i][j];

                }else {

                    matriz3[i][j] = matriz2[i][j];

                }

            }

        }

        System.out.println("Matriz final");
        System.out.println(" ");
        System.out.println(Arrays.deepToString(matriz3));



        int[][] matriz4 =new int[4][4];
        int[][] matriz5 =new int[4][4];
        int aux = 0;

        for ( i = 0; i < matriz4.length; i++){

            for ( j = 0; j < matriz4[i].length; j++) {

                matriz4[i][j] = random.nextInt(100)+1;
                matriz5[i][j] = random.nextInt(100)+1;

            }

        }

        System.out.println("Matriz 4");
        System.out.println(Arrays.deepToString(matriz4));
        System.out.println(" ");
        System.out.println("Matriz 5");
        System.out.println(Arrays.deepToString(matriz5));
        System.out.println(" ");

        for ( i = 0; i < matriz.length; i++){

            for ( j = 0; j < matriz[i].length; j++) {

                if (matriz4[i][j] >= matriz5[i][j]){

                    aux = matriz4[i][j];
                    

                }else {

                    matriz3[i][j] = matriz2[i][j];

                }

            }

        }

        System.out.println("Matriz final");
        System.out.println(" ");
        System.out.println(Arrays.deepToString(matriz3));

    }

}
