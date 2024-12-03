/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;



public class Repuesto {
    private static int contadorId = 1; // Contador estático para generar IDs automáticamente
    private int id;
    private String nombre;
    private double precio;

    public Repuesto(String nombre, double precio) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio;
    }
}
