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
public class ListaSimple {

    protected nodo cabeza;

    public ListaSimple() {
        this.cabeza = null;
    }

    public boolean estaVacio() {
        return (this.cabeza == null);
    }

    public void insertar(Persona dato) {
        nodo tmp = new nodo(dato, null);
        tmp.setSig(cabeza);
        cabeza = tmp; // maria  juan         juan  maria
    }

    public void imprimir() {
        if (!estaVacio()) {
            nodo tmp = cabeza;
            while (tmp != null) {
                System.out.print(tmp.getDato() + "\t ");
                tmp = tmp.getSig();
            }
        } else {
            System.out.println("No contiene datos en lista");
        }
    }

    public int tamanio() {
        int tamanio = 0;
        if (!estaVacio()) {
            nodo tmp = cabeza;
            while (tmp != null) {
                tamanio++;
                tmp = tmp.getSig();
            }
        }
        return tamanio;
    }

    public Persona obtenerPos(int pos) {
        Persona aux = null;
        if (estaVacio() || pos < 0) {
            System.out.println("Vacio");
        } else if (pos > (tamanio() - 1)) {
            System.out.println("Fuera del rango");
            throw new ArrayIndexOutOfBoundsException("Esta fuera del rango");

        } else if (pos == 0) {
            aux = verDatoPosicion(pos);
        } else {
            nodo iterador = cabeza;
            for (int i = 1; i < pos; i++) {
                if (iterador.getSig().getSig() == null) {
                    break;
                }
                iterador = iterador.getSig();
            }
            aux = iterador.getSig().getDato();
        }
        return aux;
    }

    public Persona verDatoPosicion(int pos) {
        Persona dato = null;
        if (!estaVacio() && pos >= 0) {
            nodo tmp = cabeza;
            for (int i = 0; i < pos; i++) {
                tmp = tmp.getSig();
                if (tmp == null) {
                    break; // Salta todo el metodo
                }
            }
            dato = (tmp != null) ? tmp.getDato() : null;
            //System.out.println(tmp.getDato());
        }
        return dato;
    }

    public void editarPosicion(Persona dato, int pos) {
        if (pos >= 0 && pos < tamanio()) {
            if (pos == 0) {
                cabeza.setDato(dato);
            } else {
                nodo aux = cabeza;
                for (int i = 0; i < pos; i++) {
                    aux = aux.getSig();
                }
                aux.setDato(dato);
            }
        } else {
            System.out.println("Fuera de Rango");
        }
    }

    public void seleccion() {
        for (int i = 0; i < tamanio() - 1; i++) {
            int k = i;
            Persona t = obtenerPos(i);
            for (int j = (i + 1); j < tamanio(); j++) {
                if (obtenerPos(j).getEdad() < t.getEdad()) {
                    t = obtenerPos(j);
                    k = j;
                }
            }
            editarPosicion(obtenerPos(i), k);
            editarPosicion(t, i);
        }
    }   
}
