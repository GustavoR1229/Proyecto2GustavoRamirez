/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author Usuario
 */
public class Reserva {
    private Habitacion habitacion;
    private int diaInicio;
    private int mesInicio;
    private int anioInicio;
    private int diaFin;
    private int mesFin;
    private int anioFin;

    public Reserva(Habitacion habitacion,
                   int diaInicio,
                   int mesInicio,
                   int anioInicio,
                   int diaFin,
                   int mesFin,
                   int anioFin) {
        this.habitacion = habitacion;
        this.diaInicio = diaInicio;
        this.mesInicio = mesInicio;
        this.anioInicio = anioInicio;
        this.diaFin = diaFin;
        this.mesFin = mesFin;
        this.anioFin = anioFin;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaInicio() {
        return diaInicio + "/" + mesInicio + "/" + anioInicio;
    }

    public String getFechaFin() {
        return diaFin + "/" + mesFin + "/" + anioFin;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public int getDiaFin() {
        return diaFin;
    }
}