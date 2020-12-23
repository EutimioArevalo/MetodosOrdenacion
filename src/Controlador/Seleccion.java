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
public class Seleccion {

    private int[] numeros;

    public void llenadoAleatorio() {
        numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            numeros[i] = (int) (Math.random() * 1000);
        }
    }

    public void MetodoSeleccion() {
        int cont = 0;
        for (int i = 0; i < (numeros.length - 1); i++) {
            int k = i;
            int t = numeros[i];
            for (int j = (i + 1); j < numeros.length; j++) {
                if (numeros[j] < t) {
                    t = numeros[j];
                    k = j;
                }
                cont++;
            }
            numeros[k] = numeros[i];
            numeros[i] = t;
        }
        System.out.println("\n Itera:"+cont);
    }

    public void imprimir() {
        System.out.println("\n-------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
    }
}
