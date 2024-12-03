package com.login;


import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private Cedula cedula;
    private Correo correo;
    private String contrasena;

    // Lista de usuarios registrados
    public static ArrayList<Usuario> usuariosRegistrados = new ArrayList<>();

    // Constructor
    public Usuario(String nombre, Cedula cedula, Correo correo, String contrasena) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Correo getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    // Registrar un nuevo usuario
    public static void registrarUsuario(String nombre, Cedula cedula, Correo correo, String contrasena) {
        Usuario usuario = new Usuario(nombre, cedula, correo, contrasena);
        usuariosRegistrados.add(usuario);
    }

    // Verificar si el usuario y la contraseña coinciden
    public static boolean iniciarSesion(String nombre, String contrasena) {
        for (Usuario usuario : usuariosRegistrados) {
            if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                return true; // Inicio de sesión exitoso
            }
        }
        return false; // Credenciales incorrectas
    }
}

