package ejercicios.ejercicio5;

public interface ColeccionSimpleGenerica <T>{
    boolean estaVacia();
    T extraer();
    T primero();
    void aniadir(T elemento);

}
