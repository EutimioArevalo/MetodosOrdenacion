/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.listasimple;

import Modelo.Persona;

/**
 *
 * @author timoa
 */
public class nodo {
    private Persona dato;
    private nodo sig; // Recursividad // Listas Enlazadas -> Puntero de memoria

    public nodo() {
        this.sig = null;
        this.dato = null;
    }

    public nodo(Persona dato, nodo sig) {
        this.dato = dato;
        this.sig = sig;
    }
        
    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }
    
    
}
