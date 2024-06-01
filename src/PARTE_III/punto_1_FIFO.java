/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PARTE_III;

/**
 *
 * @author PEDRO DE HORTA
 */

public class punto_1_FIFO {

    private int[] elementos;
    private int frente; // Índice del frente de la cola
    private int tamañoActual; // Tamaño actual de la cola
    
    // Constructor
    public punto_1_FIFO(int capacidad) {
        elementos = new int[capacidad];
        frente = 0;
        tamañoActual = 0;
    }
    
    // Método para añadir un elemento al final de la cola
    public void encolar(int elemento) {
        if (tamañoActual < elementos.length) {
            int indice = (frente + tamañoActual) % elementos.length;
            elementos[indice] = elemento;
            tamañoActual++;
        } else {
            System.out.println("La cola está llena, no se puede añadir más elementos.");
        }
    }

    // Método para retirar el elemento del frente de la cola y devolverlo
    public int desencolar() {
        if (tamañoActual > 0) {
            int elemento = elementos[frente];
            frente = (frente + 1) % elementos.length;
            tamañoActual--;
            return elemento;
        } else {
            System.out.println("La cola está vacía, no se puede retirar ningún elemento.");
            return -1; // Valor de retorno por defecto si la cola está vacía
        }
    }

    // Método para consultar el elemento del frente de la cola sin retirarlo
    public int consultarFrente() {
        if (tamañoActual > 0) {
            return elementos[frente];
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
