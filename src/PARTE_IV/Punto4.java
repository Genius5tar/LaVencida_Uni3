/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTE_IV;

import java.util.Scanner;

/**
 *
 * @author PEDRO DE HORTA
 * usamos el conjunto de datos de la undiad 2 pora que se comporte como pila 
 * con los metodos de la pila personalizada
 */
public class Punto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pila_perzonalizada pila = new pila_perzonalizada(6);
        //                      frente             último
        Integer[] edadesIniciales = {55, 40, 36, 30, 28, 22};
        for (Integer edad : edadesIniciales) {
            pila.Añadir(edad);
        }

        int opcion;
        do {
            System.out.println("\n--- Menu PILA unidad 2---");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Retirar elemento");
            System.out.println("3. Ver el elemento más reciente");
            System.out.println("4. Verificar si la pila está vacía");
            System.out.println("5. Verificar si la pila está llena");
            System.out.println("6. Ir a PILA PERSONALIZADA");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a añadir: ");
                    Object elementoAñadir = scanner.next(); // Utilizar next() para leer un Object
                    pila.Añadir(elementoAñadir);
                    break;
                case 2:
                    Object elementoRetirado = pila.Retirar();
                    if (elementoRetirado != null) {
                        System.out.println("Elemento retirado: " + elementoRetirado);
                    }
                    break;
                case 3:
                    Object elementoReciente = pila.reciente();
                    if (elementoReciente != null) {
                        System.out.println("Elemento más reciente: " + elementoReciente);
                    }
                    break;
                case 4:
                    if (pila.estaVacia()) {
                        System.out.println("La pila está vacía.");
                    } else {
                        System.out.println("La pila no está vacía.");
                    }
                    break;
                case 5:
                    if (pila.estaLlena()) {
                        System.out.println("La pila está llena.");
                    } else {
                        System.out.println("La pila no está llena.");
                    }
                    break;
                case 6:
                    Punto5.main(new String[0]); // Llama al menú de la pila personalizada
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}