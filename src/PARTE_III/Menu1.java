/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTE_III;

import java.util.Scanner;

/**
 *
 * @author PEDRO DE HORTA
 */
    
public class Menu1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        punto_1_FIFO cola = new punto_1_FIFO(6);
        //                    primero             reciente
        int[] edadesIniciales = {55, 40, 36, 30, 28, 22};
        for (int edad : edadesIniciales) {
            cola.encolar(edad);
        }

        int opcion;
        do {
            System.out.println("\n--- Menú Principal---");
            System.out.println("1. Encolar elemento");
            System.out.println("2. Desencolar elemento");
            System.out.println("3. Consultar elemento del frente");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Verificar si la cola está llena");            
            System.out.println("6. Ejecutarla de forma LIFO (como pila)");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a encolar: ");
                    int elementoEncolar = scanner.nextInt();
                    cola.encolar(elementoEncolar);
                    break;
                case 2:
                    int elementoDesencolado = cola.desencolar();
                    if (elementoDesencolado != -1) {
                        System.out.println("Elemento desencolado: " + elementoDesencolado);
                    }
                    break;
                case 3:
                    int elementoFrente = cola.consultarFrente();
                    if (elementoFrente != -1) {
                        System.out.println("Elemento del frente: " + elementoFrente);
                    }
                    break;
                case 4:
                    if (cola.estaVacia()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        System.out.println("La cola no está vacía.");
                    }
                    break;
                case 5:
                    if (cola.estaLlena()) {
                        System.out.println("La cola está llena.");
                    } else {
                        System.out.println("La cola no está llena.");
                    }
                    break;
                case 6:
                    Menu2.main(new String[0]);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
    
    
    
    
    
}

