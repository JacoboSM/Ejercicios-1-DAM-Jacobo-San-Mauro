package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_vectores_distinct_explicacion {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int[] num = {1,2,2,3,4,5,6,6,7};

        int[] num_limpio = Arrays.stream(num).distinct().toArray();

        System.out.println(Arrays.toString(num_limpio));

    }

}
