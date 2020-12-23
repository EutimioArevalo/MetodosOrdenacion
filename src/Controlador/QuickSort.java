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
public class QuickSort {

    public int[] numeros;

    public void llenadoAleatorio() {
        numeros = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numeros[i] = (int) (Math.random() * 1000);
        }
    }

    public void qsort(int izq, int der, int a[]) {
        int i, ult, m, tmp;
        if (izq >= der) {
            return;
        }
        tmp = a[izq];
        m = (izq + der) / 2;
        a[izq] = a[m];
        a[m] = tmp;
        ult = izq;

        for (i = izq + 1; i < der; i++) {
            if (a[i] < a[izq]) {
                tmp = a[++ult];
                a[ult] = a[i];
                a[i] = tmp;
            }

        }
        tmp = a[izq];
        a[izq] = a[ult];
        a[ult] = tmp;
        qsort(izq, ult - 1, a);
        qsort(ult + 1, der, a);
    }

    public void Quicksort(int numeros[], int izq, int der) {

        int pivote = numeros[izq];

        //Se definen los dos lados y un auxiliar
        int i = izq;
        int j = der;
        int aux;

        while (i < j) {
            while (numeros[i] <= pivote && i < j) {
                i++;
            }

            while (numeros[j] > pivote) {
                j--;
            }

            if (i < j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }

        numeros[izq] = numeros[j];
        numeros[j] = pivote;

        if (izq < j - 1) {
            Quicksort(numeros, izq, j - 1);
        }

        if (j + 1 < der) {
            Quicksort(numeros, j + 1, der);
        }
    }

    public void imprimir() {
        System.out.println("\n-------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "\t");
        }
    }
}
