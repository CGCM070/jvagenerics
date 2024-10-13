package ejercicios.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {

    /**
     Escribe una clase genérica ListaOrdenada con un tipo parametrizado E que sea Comparable… < E extends Comparable<E>>.... La clase debe tener lo siguiente:

     Un constructor
     void add(E o) - nota: cuando añado el elemento debería añadirse en el orden adecuado, recuerda que E tiene que implementar Comparable<E>
     E get(int index)
     int size()
     boolean isEmpty()
     boolean remove(E o)
     int indexOf(E o)
     String toString()
     */


    private List<E> elementos;

    public ListaOrdenada() {
        this.elementos = new ArrayList<>();
    }

    public void add(E o) {
        int i = 0;
        while (i < elementos.size() &&  0 > elementos.get(i).compareTo(o)) {
            i++;
        }
        elementos.add(i, o);
    }

    public E get(int index) {
        return elementos.get(index);
    }

    public int size() {
        return elementos.size();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public boolean remove(E o) {
        return elementos.remove(o);
    }

    public int indexOf(E o) {
        return elementos.indexOf(o);
    }

    @Override
    public String toString() {
        return elementos.toString();
    }
}