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
public class Menu2 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        punto_2_LIFO   cola= new punto_2_LIFO(6); // Crear una cola con capacidad para 5 elementos
        //                    primero             reciente
        int[] edadesIniciales = {55, 40, 36, 30, 28, 22};
        for (int edad : edadesIniciales) {
            cola.encolar(edad);
        }
        int opcion;
        do {
            System.out.println("\n--- Menú Cola LIFO---");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Retirar elemento");
            System.out.println("3. Ver el elemento más reciente");
            System.out.println("4. Verificar si la cola está vacía");
            System.out.println("5. Verificar si la cola está llena");
            System.out.println("0. Volver ");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a añadir: ");
                    int elementoAñadir = scanner.nextInt();
                    cola.encolar(elementoAñadir);
                    break;
                case 2:
                    int elementoRetirado = cola.desencolar();
                    if (elementoRetirado != -1) {
                        System.out.println("Elemento retirado: " + elementoRetirado);
                    }
                    break;
                case 3:
                    int elementoReciente = cola.consultarFrente();
                    if (elementoReciente != -1) {
                        System.out.println("Elemento más reciente: " + elementoReciente);
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
