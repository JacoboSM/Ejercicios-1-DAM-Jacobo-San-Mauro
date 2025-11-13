package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Tema_3_vectores_sort_ejemplo {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);


        Integer[] vector = {4,5,3,7,9}; // El integer se usa para que los vectores puedan usarse con los comandos de abajo

        Integer[] vector2 = vector.clone();

        Arrays.sort(vector2); // Aquí ordenamos de menor a mayor el metodo es una variante de QuickShort

        System.out.println(Arrays.toString(vector));

        Arrays.sort(vector2, Collections.reverseOrder()); // Aquí ordenamos con la variante de QuickShort pero de mayor a menor

        System.out.println(Arrays.toString(vector2));

        Integer posicion = Arrays.binarySearch(vector2, 5); // Asi buscamos en que posición está el número que indiquemos en este caso el 5

        System.out.println(posicion);

    }
}
