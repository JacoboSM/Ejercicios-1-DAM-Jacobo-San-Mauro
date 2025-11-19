package org.example;

import java.util.Arrays;
import java.util.Random;

public class Tema_3_Matrices_explicacion2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] matriz =new int[random.nextInt(6)+2][random.nextInt(6)+2];

        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = random.nextInt(1000)+1;

            }

        }

        for (int fila[] : matriz) {

            System.out.println(Arrays.toString(fila));

        }





    }

}
