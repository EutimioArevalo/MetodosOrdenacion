/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author timoa
 */
public class Inserccion {

    private int[] numeros;

    public void llenadoAleatorio() {
        numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 1000);
        }
    }

    public void MetodoInsercion() {
        for (int i = 0; i < numeros.length; i++) {
            int j = i - 1;
            int t = numeros[i];
            while (j >=0 && t < numeros[j]){
                numeros[j+1] = numeros[j];
                j--;
            }
            numeros[j+1] = t;
        }
    }

    public void imprimir() {
        System.out.println("\n-------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
    }
}
