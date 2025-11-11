package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tema_3_vector_Practica1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];
        int[] equipo = new  int[7];
        int contador = 0;
        int contador_pelea = 0;
        int resultado = 0;
        int victoria_equipo_1 = 0;
        int victoria_equipo_2 = 0;


        do {

            pepe:
            for (int a = 1 ; a <= 2 ; a++){

                resultado = 0;

                System.out.println("Como nombras al equipo de tus guerreros ?");
                String nombre = read.nextLine();

                System.out.println("Introduce la potencia de los samurais del equipo " + nombre + " :");

                String poder = read.nextLine();

                String[] cadena_poder = poder.split(" ");


                for (int i = 0 ; i < equipo1.length ; i++ ){

                    equipo[i] = Integer.parseInt(cadena_poder[i]);
                    resultado = resultado + equipo[i];

                    if (equipo[i] < 1 || equipo[i] > 24){

                        System.out.println("Un samurai no puede tener un poder menor a 1 ni mayor a 24");
                        continue pepe;

                    }

                }

                if (resultado != 30) {

                    System.out.println("Tu equipo no puede tener un valor total diferente a 30");
                    System.out.println(resultado);
                    continue pepe;
                }

                System.out.println("Equipo " + nombre + " completado.");

                if (a == 1){

                    equipo1 = equipo.clone();

                } else {

                    equipo2 = equipo.clone();

                }
                contador = contador + 1;

            }

        }while (contador != 2);

        System.out.println("Empieza la batalla!");

        for (int i = 0; i < equipo.length; i++){




        }





    }

}
