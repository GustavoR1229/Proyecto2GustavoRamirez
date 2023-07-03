/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class ArbolBinarioBusqueda {
    private NodoABB raiz;

    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    public void insertarCliente(Cliente cliente) {
        raiz = insertarClienteRecursivo(raiz, cliente);
    }

    private NodoABB insertarClienteRecursivo(NodoABB nodo, Cliente cliente) {
        if (nodo == null) {
            return new NodoABB(cliente);
        }

        if (cliente.email.compareTo(nodo.cliente.email) < 0) {
            nodo.izquierdo = insertarClienteRecursivo(nodo.izquierdo, cliente);
        } else if (cliente.email.compareTo(nodo.cliente.email) > 0) {
            nodo.derecho = insertarClienteRecursivo(nodo.derecho, cliente);
        }

        return nodo;
    }

    public Cliente buscarCliente(String email) {
        return buscarClienteRecursivo(raiz, email);
    }

    private Cliente buscarClienteRecursivo(NodoABB nodo, String email) {
        if (nodo == null || nodo.cliente.email.equals(email)) {
            return (nodo != null) ? nodo.cliente : null;
        }

        if (email.compareTo(nodo.cliente.email) < 0) {
            return buscarClienteRecursivo(nodo.izquierdo, email);
        } else {
            return buscarClienteRecursivo(nodo.derecho, email);
        }
    }
}
