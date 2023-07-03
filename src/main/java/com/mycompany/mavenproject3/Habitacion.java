/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    private int numero;
    private int capacidad;
    private double precio;

    public Habitacion(int numero, int capacidad, double precio) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public double getPrecio() {
        return precio;
    }
}

