/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad_sumatoria;

import java.util.Scanner;

public class Recursividad_sumatoria {

    public static void main(String[] args) {
        int Numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("introdusca un dijito ");
        Numero = leer.nextInt();
        System.out.println("la sumatoria del numero introducido es:");
        System.out.println(Sumatoria(Numero));
    }

    private static int Sumatoria(int numero) {//metodo recursivo con parametro para calcular la sumatoria
        if (numero == 0) {//condicion o caso base
            return 0;
        } else {//entonces

            return numero + Sumatoria(numero - 1);//se hace la suma y se llama asi mismo el metodo creando un bucle y terminara cuando se cumpla la condision o el caso base
        }

    }

}
