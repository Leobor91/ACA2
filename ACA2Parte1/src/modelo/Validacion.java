/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;
import vista.Vista;

public class Validacion {

    Scanner entrada = new Scanner(System.in);

    // Método de validación de número entero
    public  int validarEntero() {
        Vista v = new Vista();
        
        
        int numero = 0;
        boolean entradaValida = false;

        do {
           
            String input = entrada.next();

            try {
                // Intentamos convertir la cadena a un entero
                numero = Integer.parseInt(input);
                entradaValida = true; // Si la conversión es exitosa, marcamos la entrada como válida
            } catch (NumberFormatException e) {
                // En caso de excepción, la entrada no es un número entero
                System.out.println("Error: Ingreso un dato no valido. Ingrese un valor numerico que sea de las siguientes opciones " );
                v.menu();
            }

        } while (!entradaValida); // Repetimos el bucle hasta que se ingrese un dato válido

        return numero;
    }
    
    public  double validarDouble() {
        double numeroDouble = 0;
        boolean entradaValida = false;

        do {
            String input = entrada.next();

            try {
                // Intentamos convertir la cadena a un número double
                numeroDouble = Double.parseDouble(input);
                entradaValida = true; // Si la conversión es exitosa, marcamos la entrada como válida
            } catch (NumberFormatException e) {
                // En caso de excepción, la entrada no es un número double
                System.out.println("Error: Ingrese un numero decimal valido.");
            }

        } while (!entradaValida); // Repetimos el bucle hasta que se ingrese un dato válido

        return numeroDouble;
    }
    
    public int validar() {
        

        int numero = 0;
        boolean entradaValida = false;

        do {

            String input = entrada.next();

            try {
                // Intentamos convertir la cadena a un entero
                numero = Integer.parseInt(input);
                entradaValida = true; // Si la conversión es exitosa, marcamos la entrada como válida
            } catch (NumberFormatException e) {
                // En caso de excepción, la entrada no es un número entero
                System.out.println("Error: Ingrese un Numero valido ");
                
            }

        } while (!entradaValida); // Repetimos el bucle hasta que se ingrese un dato válido

        return numero;
    }
}


