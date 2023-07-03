/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class HashTable {
    private NodoTabla[] tabla;
    private int capacidad;

    public HashTable(int capacidad) {
        this.capacidad = capacidad;
        this.tabla = new NodoTabla[capacidad];
    }

    private int calcularIndiceHash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash % capacidad;
    }

    public void insertarCliente(Cliente cliente) {
        int indice = calcularIndiceHash(cliente.email);

        if (tabla[indice] == null) {
            tabla[indice] = new NodoTabla(cliente);
        } else {
            NodoTabla nodoActual = tabla[indice];
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = new NodoTabla(cliente);
        }
    }

    public Cliente buscarCliente(String email) {
        int indice = calcularIndiceHash(email);

        NodoTabla nodoActual = tabla[indice];
        while (nodoActual != null) {
            if (nodoActual.cliente.email.equals(email)) {
                return nodoActual.cliente;
            }
            nodoActual = nodoActual.siguiente;
        }

        return null;
    }
}