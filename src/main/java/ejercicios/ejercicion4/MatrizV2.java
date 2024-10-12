package ejercicios.ejercicion4;

import ejercicios.ejercicioN3.Matriz;


/**
 * Escribe una aplicación que:
 *
 * Cree una matriz de Integer de 4 filas y 2 columnas
 * Rellénala con números consecutivos comenzando por el 1.
 * Muestra por pantalla la matriz.
 * Muestra por pantalla el contenido de la celda en la fila 1, columna 2
 */

public class MatrizV2 {
    public static void main(String[] args) {
        Matriz<Integer> matriz = new Matriz<>(4, 2);

        int value = 1;
        for (int i = 0; i < matriz.filas(); i++) {
            for (int j = 0; j < matriz.columnas(); j++) {
                matriz.set(i, j, value++);
            }
        }

        System.out.println("Matriz:");
        System.out.println(matriz);

        System.out.println("Contenido de la celda en la fila 1, columna 2: " + matriz.get(1, 1));
    }


}
