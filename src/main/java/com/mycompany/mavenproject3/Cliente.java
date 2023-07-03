/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class Cliente {
    String primer_nombre;
    String segundo_nombre;
    String email;
    String genero;
    String tipo_hab;
    String celular;
    String llegada;
    String salida;

    public Cliente(String primer_nombre, String segundo_nombre, String email, String genero, String tipo_hab, String celular, String llegada, String salida) {
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.email = email;
        this.genero = genero;
        this.tipo_hab = tipo_hab;
        this.celular = celular;
        this.llegada = llegada;
        this.salida = salida;
    }
}