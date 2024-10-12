package ejercicios.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class PilaArray<T> implements ColeccionSimpleGenerica<T> {

    /**
     * Escribe una interfaz ColeccionSimpleGenerica , que como su propio nombre indica, es genérica, con los siguientes métodos:
     *
     * estaVacia(): devuelve true si la pila está vacía y false en caso contrario
     * extraer(): devuelve y elimina el primer elemento de la colección.
     * primero(): devuelve el primer elemento de la colección.
     * aniadir(): añade un objeto por el extremo que corresponda.
     */


    private List<T> elementos;

    public PilaArray() {
        this.elementos = new ArrayList<>();
    }

    @Override
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    @Override
    public T extraer() {
        if (estaVacia()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    @Override
    public T primero() {
        if (estaVacia()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    @Override
    public void aniadir(T elemento) {
        elementos.add(elemento);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}