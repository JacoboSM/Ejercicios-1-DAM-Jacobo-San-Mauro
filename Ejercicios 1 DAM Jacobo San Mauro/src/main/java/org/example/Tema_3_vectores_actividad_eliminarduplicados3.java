package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_vectores_actividad_eliminarduplicados3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        Integer[] vector = {1, 2, 2, 3, 4, 4, 5};
        Integer[] aux = new Integer[vector.length];
        Integer[] vector2 = new Integer[vector.length];
        boolean hay2 = false;



        do {

            for (int i = 0; i < vector.length; i++) {

                boolean hay = Arrays.asList(aux).contains(vector[i]);

                if (!hay) {


                    aux[i] = vector[i];


                } else if (hay){

                    System.out.println("Duplicado " + vector[i]);
                    aux[i] = random.nextInt(10)+1;


                }

            }

            vector2 = aux.clone();
            Arrays.sort(vector2);

            for (int i = 0; i < vector2.length - 1; i++) {
                if (vector2[i].equals(vector2[i + 1])) {
                    hay2 = true;
                    break;
                }
                }


        }while (hay2);

        System.out.println(Arrays.toString(vector2));

    }

}
