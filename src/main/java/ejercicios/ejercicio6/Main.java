package ejercicios.ejercicio6;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        lista.add(5);
        lista.add(3);
        lista.add(8);
        lista.add(1);

        System.out.println("Lista ordenada: " + lista);
        System.out.println("Elemento en el índice 2: " + lista.get(2));
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println("¿Está vacía?: " + lista.isEmpty());
        System.out.println("Índice del elemento 3: " + lista.indexOf(3));
        System.out.println("Eliminar elemento 5: " + lista.remove(5));
        System.out.println("Lista después de eliminar: " + lista);
    }
}