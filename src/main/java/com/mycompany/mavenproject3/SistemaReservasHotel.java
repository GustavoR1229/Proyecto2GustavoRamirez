/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class SistemaReservasHotel {
    private static int MAX_HABITACIONES = 100;
    private static int MAX_RESERVAS = 100;
    private static int numHabitaciones = 0;
    private static int numReservas = 0;
    private static Habitacion[] habitaciones = new Habitacion[MAX_HABITACIONES];
    private static Reserva[] reservas = new Reserva[MAX_RESERVAS];

    public static void main(String[] args) {
        agregarHabitacion(new Habitacion(1, 2, 100));
        agregarHabitacion(new Habitacion(2, 2, 100));
        agregarHabitacion(new Habitacion(3, 4, 200));

        hacerReserva(habitaciones[0], 10, 7, 2023, 15, 7, 2023);
        hacerReserva(habitaciones[1], 12, 7, 2023, 14, 7, 2023);

        verReservas();
    }

    public static void agregarHabitacion(Habitacion habitacion) {
        habitaciones[numHabitaciones++] = habitacion;
    }

    public static void hacerReserva(Habitacion habitacion,
                                     int diaInicio,
                                     int mesInicio,
                                     int anioInicio,
                                     int diaFin,
                                     int mesFin,
                                     int anioFin) {
        if (numReservas >= MAX_RESERVAS) {
            System.out.println("No hay más reservas disponibles");
            return;
        }

        for (int i = 0; i < numReservas; i++) {
            Reserva reserva = reservas[i];
            if (reserva.getHabitacion() == habitacion) {
                if ((diaInicio > reserva.getDiaInicio() &&
                        diaInicio < reserva.getDiaFin()) ||
                        (diaFin > reserva.getDiaInicio() &&
                        diaFin < reserva.getDiaFin())) {
                    System.out.println("La habitación no está disponible en esas fechas");
                    return;
                }
            }
        }

        reservas[numReservas++] = new Reserva(habitacion,
                diaInicio,
                mesInicio,
                anioInicio,
                diaFin,
                mesFin,
                anioFin);
    }

    public static void verReservas() {
        for (int i = 0; i < numReservas; i++) {
            Reserva reserva = reservas[i];
            System.out.println("Habitación " + reserva.getHabitacion().getNumero() +
                    " reservada del " + reserva.getFechaInicio() +
                    " al " + reserva.getFechaFin());
        }
    }
}
