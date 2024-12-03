/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class RepuestoCRUD {
    private List<Repuesto> repuestos = new ArrayList<>();

    public void agregarRepuesto(Repuesto repuesto) {
        repuestos.add(repuesto);
        System.out.println("Repuesto agregado exitosamente.");
    }

    public boolean eliminarRepuesto(int id) {
        for (Repuesto r : repuestos) {
            if (r.getId() == id) {
                repuestos.remove(r);
                return true; // Repuesto eliminado
            }
        }
        return false;
    }

    public boolean modificarRepuesto(int id, String nuevoNombre, double nuevoPrecio) {
        Repuesto repuesto = buscarRepuesto(id);
        if (repuesto != null) {
            repuesto.setNombre(nuevoNombre);
            repuesto.setPrecio(nuevoPrecio);
            System.out.println("Repuesto modificado exitosamente.");
        } else {
            System.out.println("Repuesto no encontrado.");
        }
        return false;
    }

    public Repuesto buscarRepuesto(int id) {
        for (Repuesto repuesto : repuestos) {
            if (repuesto.getId() == id) {
                return repuesto;
            }
        }
        return null;
    }

    public void verRepuestos() {
        if (repuestos.isEmpty()) {
            System.out.println("No hay repuestos registrados.");
        } else {
            for (Repuesto repuesto : repuestos) {
                System.out.println(repuesto);
            }
        }
    }
}

