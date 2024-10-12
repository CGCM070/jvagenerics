package ejercicios.ejercicio5;

public class Main {

    public static void main(String[] args) {
        PilaArray<String> pila = new PilaArray<>();
        pila.aniadir("Hola");
        pila.aniadir("Mundo");
        pila.aniadir("Java");

        System.out.println("Pila: " + pila);
        System.out.println("Extraído: " + pila.extraer());
        System.out.println("Primero: " + pila.primero());
        System.out.println("Pila después de extraer: " + pila);
    }
}

