package ejercicios.ejercicio1;

import java.util.LinkedList;

public class EjercicioN1<T> {

    /***
     *
     * Escribe una clase Pila genérica usando para ello un atributo del tipo LinkedList. La clase Pila tendrá los siguientes métodos:
     *
     * estaVacia(): devuelve true si la pila está vacía y false en caso contrario.
     * extraer(): devuelve y elimina el primer elemento de la colección.
     * primero(): devuelve el primer elemento de la colección
     * aniadir(): añade un objeto por el extremo que corresponda.
     * toString(): devuelve en forma de String la información de la colección.
     */

    private LinkedList<T> elementos;

    public EjercicioN1() {
        this.elementos = new LinkedList<>();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public T extraer() {
        return elementos.pollFirst();
    }

    public T primero() {
        return elementos.peekFirst();
    }

    public void aniadir(T elemento) {
        elementos.addFirst(elemento);
    }

    @Override
    public String toString() {
        return "Pila{" +
                "elementos=" + elementos +
                '}';
    }

    public static void main(String[] args) {
        EjercicioN1<String> pila = new EjercicioN1<String>();
        pila.aniadir("Hola");
        pila.aniadir("Mundo");
        pila.aniadir("Java");

        System.out.println(pila);
        System.out.println(pila.extraer());
        System.out.println(pila.primero());
        System.out.println(pila);
    }

}