/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PARTE_IV;

/**
 *
 * @author PEDRO DE HORTA
 * Clase para una pila personalizada.
 */
public class pila_perzonalizada {

    private Object[] elementos;
    private int tamañoActual;

    // Constructor
    public pila_perzonalizada(int capacidad) {
        elementos = new Object[capacidad];
        tamañoActual = 0;
    }

    // Método para añadir un elemento a la pila
    public void Añadir(Object elemento) {
        if (tamañoActual < elementos.length) {
            elementos[tamañoActual] = elemento;
            tamañoActual++;
        } else {
            System.out.println("La pila está llena, no se puede añadir más elementos.");
        }
    }

    // Método para retirar el elemento más recientemente agregado de la pila y devolverlo
    public Object Retirar() {
        if (tamañoActual > 0) {
            Object elemento = elementos[tamañoActual - 1];
            tamañoActual--;
            return elemento;
        } else {
            System.out.println("La pila está vacía, no se puede retirar ningún elemento.");
            return null; // Valor de retorno por defecto si la pila está vacía
        }
    }

    // Método para ver el elemento en la cima de la pila sin retirarlo
    public Object reciente() {
        if (tamañoActual > 0) {
            return elementos[tamañoActual - 1];
        } else {
            System.out.println("La pila está vacía, no hay ningún elemento en la cima.");
            return null; // Valor de retorno por defecto si la pila está vacía
        }
    }

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return tamañoActual == 0;
    }

    // Método para verificar si la pila está llena
    public boolean estaLlena() {
        return tamañoActual == elementos.length;
    }
}
