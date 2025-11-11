package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tema_3_vectores_Practica_ruleta {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random random = new Random();

        final String[] COLORES = {"rojo","negro"};
        final String[] PAR_IMPAR = {"par","impar"};
        final int[] VALORES = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36};
        int num_sorteo = VALORES[random.nextInt(37)];


        System.out.println("Elige un numero del 0 al 36 para apostar");
        int num_apuesta = read.nextInt();

        if (!Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36).contains(num_apuesta)){
            System.out.println("ERROR. EL número no es valido (0-36)");
            return;
        }

        if (num_apuesta != 0){

            System.out.println("Elige el color de tu apuesta (rojo / negro)");
            String color_apuesta = read.next().toLowerCase();

            if (!Arrays.asList(COLORES).contains(color_apuesta)){

                System.out.println("ERROR. EL color no es valido (rojo / negro)");

            }

            System.out.println("Elige si es par o impar tu apuesta");
            String par_impar_apuesta = read.next().toLowerCase();

            if (!Arrays.asList(PAR_IMPAR).contains(par_impar_apuesta)){

                System.out.println("ERROR. La apuesta tiene que ser par o impar");

            }

            String color_sorteo = COLORES[random.nextInt(2)]; //COLORES[0] o COLORES[1]
            String par_impar_sorteo = num_sorteo % 2 == 0 ? "par" : "impar"; //Ternaria

            System.out.println("Ha salido " + color_sorteo + " / " + par_impar_sorteo + " / " + num_sorteo);

            if (num_sorteo == num_apuesta && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta)){

                System.out.println("Has ganado!!");

            } else if (num_sorteo == num_apuesta){

                System.out.println("Has acertado el numero");

            } else if (color_sorteo.equals(color_apuesta)) {

                System.out.println("Has acertado el color " + color_apuesta);

            } else if (par_impar_apuesta.equals(par_impar_sorteo)) {

                System.out.println("Has acertado " + par_impar_apuesta);

            }else {

                System.out.println("Has perdido");

            }

        }



        if (num_sorteo == num_apuesta){

            System.out.println("Has acertado el numero");

        } else {

            System.out.println("Has perdido, el numero ha sido " + num_sorteo);

        }



    }

}
