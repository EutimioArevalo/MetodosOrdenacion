/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenaciontercero;

import Controlador.Burbuja;
import Controlador.Inserccion;
import Controlador.QuickSort;
import Controlador.Seleccion;
import Controlador.listasimple.ListaSimple;
import Modelo.Persona;

/**
 *
 * @author timoa
 */
public class OrdenacionTercero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Burbuja burbuja = new Burbuja();
        burbuja.llenadoAleatorio();
        burbuja.imprimir();
        burbuja.ordenar();
        burbuja.imprimir();*/

 /*Inserccion inserccion = new Inserccion();
        inserccion.llenadoAleatorio();
        inserccion.imprimir();
        inserccion.MetodoInsercion();
        inserccion.imprimir();*/
 /* Seleccion seleccion = new Seleccion();
        seleccion.llenadoAleatorio();
        seleccion.imprimir();
        seleccion.MetodoSeleccion();
        seleccion.imprimir();*/
 /* ListaSimple ls = new ListaSimple();
        for (int i = 0; i < 100; i++) {
            Persona p = new Persona("Manuel_"+i, (int) (Math.random() * 50),"4444444",Math.random()*500);
            ls.insertar(p);
        }
        ls.imprimir();
        ls.seleccion();
        System.out.println("\n---------------------");
        ls.imprimir();*/
        QuickSort qs = new QuickSort();
        qs.llenadoAleatorio();
        qs.imprimir();
        //qs.Quicksort(qs.numeros, 0, qs.numeros.length-1);
        qs.qsort(0, qs.numeros.length, qs.numeros);
        qs.imprimir();
    }

}
