/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PARTE_III;

/**
 *
 * @author PEDRO DE HORTA
 */
import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        punto_2_LIFO pila = new punto_2_LIFO(6);
        //                      frente             ultimo
        int[] edadesIniciales = {55, 40, 36, 30, 28, 22};
        for (int edad : edadesIniciales) {
            pila.Añadir(edad);
        }

        int opcion;
        do {
            System.out.println("\n--- Menu LIFO---");
            System.out.println("1. Añadir elemento");
            System.out.println("2. Retirar elemento");
            System.out.println("3. Ver el elemento más reciente");
            System.out.println("4. Verificar si la pila está vacía");
            System.out.println("5. Verificar si la pila está llena");
            System.out.println("0. volver al Menu FIFO");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a añadir: ");
                    int elementoAñadir = scanner.nextInt();
                    pila.Añadir(elementoAñadir);
                    break;
                case 2:
                    int elementoRetirado = pila.Retirar();
                    if (elementoRetirado != -1) {
                        System.out.println("Elemento retirado: " + elementoRetirado);
                    }
                    break;
                case 3:
                    int elementoReciente = pila.reciente();
                    if (elementoReciente != -1) {
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
                    Menu1.main(new String[0]);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
