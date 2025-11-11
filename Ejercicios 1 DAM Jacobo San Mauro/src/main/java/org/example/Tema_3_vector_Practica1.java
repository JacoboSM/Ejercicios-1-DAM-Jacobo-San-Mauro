package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_vector_Practica1 {

    public static void main (String[] args){

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];
        int[] equipo = new  int[7];
        int contador = 0;
        int contador_pelea = 0;
        int resultado = 0;
        int victoria_equipo_1 = 0;
        int victoria_equipo_2 = 0;
        int pelea_random = random.nextInt(7)+1;


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
        System.out.println("Empieza la pelea con el samurai " + pelea_random);

        for (int i = pelea_random; i < equipo.length; i++){

            if (equipo1[i] > equipo2[i]){

                victoria_equipo_1++;

                System.out.println("Victoria equipo 1 samurai " + i + ". " + equipo1[i] + " vs " + equipo2[i]);


            } else if (equipo1[i] < equipo2[i]) {

                victoria_equipo_2++;

                System.out.println("Victoria equipo 2 samurai " + i + ". " + equipo1[i] + " vs " + equipo2[i]);

            }else {

                System.out.println("Empate de la pelea de los samurais " + i);
            }

            System.out.println("");

        }

        for (int i = 0 ; i < pelea_random; i++){

            if (victoria_equipo_1 != 4 || victoria_equipo_2 !=4){

                if (equipo1[i] > equipo2[i]){

                    victoria_equipo_1++;

                    System.out.println("Empate de la pelea de los samurais " + i + ". " + equipo1[i] + " vs " + equipo2[i]);


                } else if (equipo1[i] < equipo2[i]) {

                    victoria_equipo_2++;

                    System.out.println("Victoria equipo 2 samurai " + i + ". " + equipo1[i] + " vs " + equipo2[i]);

                }else {

                    System.out.println("Empate de la pelea de los samurais " + i + ". " + equipo1[i] + " vs " + equipo2[i]);
                }

            }else {

                System.out.println("Ha ganado el equipo 1");

            }



        }


    }

}
