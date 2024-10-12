package ejercicios.ejercicio3;

import java.util.Arrays;

public class Matriz<T> {



    public static void main(String[] args) {
        Matriz<String> matriz = new Matriz<>(3, 3);
        matriz.set(0, 0, "Hola");
        matriz.set(0, 1, "Mundo");
        matriz.set(0, 2, "Java");
        matriz.set(1, 0, "Generics");
        matriz.set(1, 1, "en");
        matriz.set(1, 2, "Java");
        matriz.set(2, 0, "Matriz");
        matriz.set(2, 1, "Genérica");
        matriz.set(2, 2, "Ejemplo");

        System.out.println(matriz);
        System.out.println("Elemento en (1, 1): " + matriz.get(1, 1));
        System.out.println("Número de filas: " + matriz.filas());
        System.out.println("Número de columnas: " + matriz.columnas());
    }

/**
 *Escribe una clase Matriz genérica con los siguientes métodos:
 *
 * constructor que recibe por parámetro el número de filas y columnas de la matriz.
 * set() recibe por parámetro la fila, la columna y el elemento a insertar. El elemento es de tipo genérico.
 * Este método inserta el elemento en la posición indicada.
 * get() recibe por parámetro la fila y la columna. Devuelve el elemento en esa posición. El elemento devuelto es genérico.
 * columnas() devuelve el número de columnas de la matriz.
 * filas() devuelve el número de filas de las matriz.
 * toString() devuelve en forma de String la información de la matriz.
 */


    private T[][] elementos;
    private int filas;
    private int columnas;

    // Constructr que recibe por parametro el número de filas y columnas de la matriz

    public Matriz(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.elementos = (T[][]) new Object[filas][columnas];
    }

    //Pos especifica
    public void set(int fila, int columna, T elemento) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            elementos[fila][columna] = elemento;
        } else {
            System.out.println("Indice fuera de los limites d la matriz");
        }
    }
    //Pos especifica
    public T get(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return elementos[fila][columna];
        } else {
            System.out.println("Indice fuera de los limites d la matriz");
            return null;
        }
    }

    public int columnas() {
        return columnas;
    }

    public int filas() {
        return filas;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < filas; i++) {
            result += Arrays.toString(elementos[i]) + "\n";
        }
        return result;
    }


}