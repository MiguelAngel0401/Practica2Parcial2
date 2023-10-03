/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_parcial2;

/**
 *
 * @author Pc
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practica2_PARCIAL2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
   public static void main(String[] args) throws IOException {
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduce el tamano del arreglo: ");
        int tamano = Integer.parseInt(br.readLine());
        
        int[] arreglo = new int[tamano];

        System.out.println("********************************************");
        System.out.println("Introduce los valores enteros del arreglo:");
        for (int i = 0; i < tamano; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arreglo[i] = Integer.parseInt(br.readLine());
        }

        int valorMaximo = arreglo[0];
        int valorMinimo = arreglo[0];
        int numpar = 0;
        int numimpar = 0;
        
        
        for (int i = 0; i < tamano; i++) {
            if (arreglo[i] > valorMaximo) {
                valorMaximo = arreglo[i];
            }
            if (arreglo[i] < valorMinimo) {
                valorMinimo = arreglo[i];
            }
        }
        
        for(int i=0; i<tamano; i++){
          if(arreglo[i] % 2 == 0){
          numimpar++;
          }else{
          numpar++;
          }
        }
        System.out.println("************************************************************");
        System.out.println("El valor mas grande del arreglo es: " + valorMaximo);
        System.out.println("El valor mas pequeno del arreglo es: " + valorMinimo);
        System.out.println("El numero par es:" + numimpar);
        System.out.println("El numero impar es:" + numpar);
    }
   }