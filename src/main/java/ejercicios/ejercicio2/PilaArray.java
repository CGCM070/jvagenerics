package ejercicios.ejercicio2;

import java.util.Arrays;

public class PilaArray<T> {


    public static void main(String[] args) {
        PilaArray<String> pila = new PilaArray<>(3);
        pila.aniadir("Hola");
        pila.aniadir("Mundo");
        pila.aniadir("Java");

        System.out.println(pila);
        System.out.println(pila.extraer());
        System.out.println(pila.primero());
        System.out.println(pila);
    }


    /**
     * Implementa una pila utilizando como atributos un array genérico y un entero que cuente el número de objetos insertados.
     * La clase se debe llamar PilaArray y tiene los mismos métodos que la pila del ejercicio anterior.
     */

    private T[] elementos;
    private int contador;


    public PilaArray(int capacidad) {
        this.elementos = (T[]) new Object[capacidad];
        this.contador = 0;
    }

    public boolean estaVacia() {
        return contador == 0;
    }

    public T extraer() {
        if (estaVacia()) {
            System.out.println("La Pila esta vacia");
        }
        T elemento = elementos[--contador];
        T[] nuevoArray = Arrays.copyOf(elementos, contador);
        elementos = nuevoArray;
        return elemento;
    }

    public T primero() {
        if (estaVacia()) {
            System.out.println("La Pila esta vacia");
        }
        return elementos[contador - 1];
    }

    public void aniadir(T elemento) {
        if (contador == elementos.length) {
            elementos = Arrays.copyOf(elementos, elementos.length * 2);
        }
        elementos[contador++] = elemento;
    }

    @Override
    public String toString() {
        return "PilaArray{" +
                "elementos=" + Arrays.toString(elementos) +
                ", contador=" + contador +
                '}';
    }


}
