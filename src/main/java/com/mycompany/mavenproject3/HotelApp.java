/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class HotelApp {
    public static void main(String[] args) {
        TablaDispersión tablaDispersión = new TablaDispersión(100);
        ArbolBinarioBusqueda arbolBusqueda = new ArbolBinarioBusqueda();

        // Cargar los datos de las reservaciones, huéspedes y histórico de habitaciones

        Cliente cliente1 = new Cliente("John", "Doe", "johndoe@example.com", "M", "Doble", "123456789", "2023-07-01", "2023-07-05");
        Cliente cliente2 = new Cliente("Jane", "Smith", "janesmith@example.com", "F", "Individual", "987654321", "2023-07-02", "2023-07-07");

        tablaDispersión.insertarCliente(cliente1);
        tablaDispersión.insertarCliente(cliente2);

        Cliente clienteEncontrado = tablaDispersión.buscarCliente("johndoe@example.com");
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado: " + clienteEncontrado.primer_nombre + " " + clienteEncontrado.segundo_nombre);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}
