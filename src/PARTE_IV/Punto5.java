/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTE_IV;
import java.util.Scanner;

/**
 * Clase principal para ejecutar el menú de la pila personalizada (LIFO).
 */
public class Punto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        pila_perzonalizada pila = new pila_perzonalizada(6);

        int opcion;
        do {
            System.out.println("\n--- Menu Pila---");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Retirar elemento");
            System.out.println("3. Ver el elemento más reciente");
            System.out.println("4. Verificar si la pila está vacía");
            System.out.println("5. Verificar si la pila está llena");
            System.out.println("0. Volver ");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a añadir: ");
                    Object elementoAñadir = scanner.next();
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
                case 0:
                    Punto4.main(new String[0]);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
