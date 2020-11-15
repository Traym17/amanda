package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Animal {
    private LocalDate edad;
    private String nombre;
    private String nombreDueno;
    private String tipo;
    private LocalDate fecha;
    private String medicamento;

    public Animal() {
    }

    public Animal(LocalDate edad, String nombre, String nombreDueno, String tipo) {
        this.edad = edad;
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
        this.tipo = tipo;
    }

    public Animal(LocalDate edad, String nombre, String nombreDueno, String tipo, LocalDate fecha,String medicamento) {
        this.edad = edad;
        this.nombre = nombre;
        this.nombreDueno = nombreDueno;
        this.tipo = tipo;
        this.fecha = fecha;
        this.medicamento=medicamento;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fecha=" + fecha +
                ", medicamento='" + medicamento + '\'' +
                '}';
    }

    public String agregarComa() {
        return edad + "," + nombre + "," + nombreDueno + ","+ tipo+ ","+fecha+ ","+medicamento+ ",";
    }
}
