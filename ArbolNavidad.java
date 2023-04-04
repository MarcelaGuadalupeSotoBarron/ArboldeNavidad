/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arbolnavidad;

/**
 *
 * @author Mache
 */
public class ArbolNavidad {

    
 int altura = 10; // Altura del árbol
        int espacios = altura - 1; // Cantidad de espacios en la linea 1

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            // Imprime los asteriscos
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }

            // Salto de línea
            System.out.println();

            espacios--;
        }

        // Imprime el tronco del árbol
        for (int i = 0; i < altura - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
