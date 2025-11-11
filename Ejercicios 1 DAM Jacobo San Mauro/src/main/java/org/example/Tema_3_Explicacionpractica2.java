package org.example;

import java.util.Scanner;

public class Tema_3_Explicacionpractica2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir...");
        String palabra = read.nextLine();
        String[] letras_vector = palabra.split("");

        System.out.println("Inserta la cantidad de letras por caracter a imprimir.....");
        String cantidad = read.nextLine();
        String[] cantidad_vector = cantidad.split(" ");

        if ( letras_vector.length != cantidad_vector.length ){

            System.out.println("La palabra y las cifras introducidas no coinciden");

        }

        for (int i = 0; i < letras_vector.length; i++ ){

            for (int a = 0; a < Integer.parseInt(cantidad_vector[i]); a++){

                System.out.print(letras_vector[i]);

            }

        }

    }

}
