package ejercicios.ejercicio7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Clase de prueba para la interfaz Operable.
 * Realiza pruebas unitarias para verificar que las operaciones aritméticas se realizan correctamente.
 */
public class OperableTest {

    /**
     * Prueba las operaciones aritméticas de la implementación anónima de la interfaz
     */
    @Test
    public void testOperable() {
        Operable<Integer> operable = new Operable<>() {
            @Override
            public Integer sumar(Integer otro) {
                return 5 + otro;
            }

            @Override
            public Integer restar(Integer otro) {
                return 5 - otro;
            }

            @Override
            public Integer multiplicar(Integer otro) {
                return 5 * otro;
            }

            @Override
            public Integer dividir(Integer otro) {
                return 5 / otro;
            }
        };


        // Verificamos la  resta
        assertEquals((Integer) 2, operable.restar(3));
        // Verificamos la multiplicación
        assertEquals((Integer) 15, operable.multiplicar(3));
        // Verificamos la división
        assertEquals((Integer) 1, operable.dividir(3));
        // Verificamos la suma
        assertEquals(8, (int) operable.sumar(3));
    }
}