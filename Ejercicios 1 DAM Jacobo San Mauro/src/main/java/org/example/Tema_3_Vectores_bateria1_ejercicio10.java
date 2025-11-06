package org.example;

import java.util.Scanner;

public class Tema_3_Vectores_bateria1_ejercicio10 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        String[] palabras = {"mandarina","jacobo","melocoton","melon"};

        System.out.println("Introduce una letra (incial)....");

        char letra = read.next().charAt(0);

        for (int i = 0 ; i< palabras.length ; i++){

            if (letra == palabras[i].charAt(0)){

                System.out.println(palabras[i]);

            }

        }

    }

}
