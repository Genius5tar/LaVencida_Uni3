/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTE_III;

/**
 *
 * @author PEDRO DE HORTA
 * Mi lista de la unidad 2 como una cola que se comporta como LIFO.
 */
public class punto_2_LIFO {

    private int[] elementos;
    private int tamañoActual; // Tamaño actual de la cola

    // Constructor
    public punto_2_LIFO(int capacidad) {
        elementos = new int[capacidad];
        tamañoActual = 0;
    }

    // Método para añadir un elemento al final de la cola
    public void encolar(int elemento) {
        if (tamañoActual < elementos.length) {
            elementos[tamañoActual] = elemento;
            tamañoActual++;
        } else {
            System.out.println("La cola está llena, no se puede añadir más elementos.");
        }
    }

    // Método para retirar el elemento del final de la cola y devolverlo (comportamiento LIFO)
    public int desencolar() {
        if (tamañoActual > 0) {
            int elemento = elementos[tamañoActual - 1];
            tamañoActual--;
            return elemento;
        } else {
            System.out.println("La cola está vacía, no se puede retirar ningún elemento.");
            return -1; // Valor de retorno por defecto si la cola está vacía
        }
    }

    // Método para consultar el último elemento añadido (cima de la cola en comportamiento LIFO) sin retirarlo
    public int consultarFrente() {
        if (tamañoActual > 0) {
            return elementos[tamañoActual - 1];
        } else {
            System.out.println("La cola está vacía, no hay ningún elemento para consultar.");
            return -1; // Valor de retorno por defecto si la cola está vacía
        }
    }

    // Método para verificar si la cola está vacía
    public boolean estaVacia() {
        return tamañoActual == 0;
    }

    // Método para verificar si la cola está llena
    public boolean estaLlena() {
        return tamañoActual == elementos.length;
    }
}
