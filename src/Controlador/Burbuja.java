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
public class Burbuja {
    private int[] numeros = {36,24,10,6,12};
    public void ordenar(){
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if(numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros [j+1];
                    numeros[j+1] = aux;
                }
            }
        }
    }    
    
    public void ordenarAlRevez(){
        for (int i = 0; i < 10; i++) {
            
        }
    }
    
    public void llenadoAleatorio(){
        numeros = new int[1000];
        for (int i = 0; i < 1000; i++) {
            numeros[i] = (int)(Math.random()*1000);
        }
    }
    
    public void imprimir(){
        System.out.println("\n-------------------------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"\t");
        }
    }
}
