package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_ejercicio_matrices_1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String[][] matriz = {{"x","-","-","-"} , {"-","x","-","-"} , {"-","-","x","-"} , {"-","-","-","x"}};

        for (int i = 0; i < matriz.length; i++){

            System.out.println(Arrays.toString(matriz[i][i].toCharArray()));

        }

        String[][] matriz2 = {{"-","-","-","x"} , {"-","-","x","-"} , {"-","x","-","-"} , {"x","-","-","-"}};

        for (int i = 0; i < matriz2.length; i++){

            System.out.println(Arrays.toString(matriz2[i][matriz2.length -1 - i].toCharArray()));

        }

    }

}
