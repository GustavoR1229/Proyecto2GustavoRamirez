/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class NodoTabla {
    Cliente cliente;
    NodoTabla siguiente;

    public NodoTabla(Cliente cliente) {
        this.cliente = cliente;
        this.siguiente = null;
    }
}