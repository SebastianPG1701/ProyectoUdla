package com.login;

public class Cedula {
    private String cedula;

    // Constructor
    public Cedula(String cedula) {
        this.cedula = cedula;
    }

    // Getter
    public String getCedula() {
        return cedula;
    }

    // Método para validar la cédula ecuatoriana
    public boolean esCedulaValida() {
        // Verificar que la cédula tenga exactamente 10 caracteres
        if (cedula.length() != 10) {
            System.out.println("La cédula debe tener 10 dígitos.");
            return false;
        }

        // Verificar que los primeros dos dígitos correspondan a una provincia válida (01-24)
        int provincia = Integer.parseInt(cedula.substring(0, 2));
        if (provincia < 1 || provincia > 24) {
            System.out.println("La cédula no corresponde a una provincia válida.");
            return false;
        }

        // Llamar al algoritmo de validación
        return algoritmo.valida(cedula);
    }
}

class algoritmo {
    public static boolean valida(String x) {
        int suma = 0;
        
        // Validación para asegurarnos de que la cédula tenga 10 dígitos
        if (x.length() != 10) {
            System.out.println("Ingrese su cédula de 10 dígitos.");
            return false;
        } else {
            // Arrays para almacenar los dígitos impares y pares de la cédula
            int a[] = new int[x.length() / 2];  // Dígitos impares
            int b[] = new int[x.length() / 2];  // Dígitos pares
            int c = 0, d = 1;

            // Separar los dígitos impares y pares
            for (int i = 0; i < x.length() / 2; i++) {
                a[i] = Integer.parseInt(String.valueOf(x.charAt(c))); // Dígitos impares
                c = c + 2;
                if (i < (x.length() / 2) - 1) {
                    b[i] = Integer.parseInt(String.valueOf(x.charAt(d))); // Dígitos pares
                    d = d + 2;
                }
            }

            // Calcular la suma según el algoritmo
            for (int i = 0; i < a.length; i++) {
                a[i] = a[i] * 2;
                if (a[i] > 9) {
                    a[i] = a[i] - 9;  // Si el resultado es mayor que 9, restar 9
                }
                suma = suma + a[i] + b[i];  // Sumar los resultados
            }

            // Calcular el dígito verificador
            int aux = suma / 10;
            int dec = (aux + 1) * 10;
            if ((dec - suma) == Integer.parseInt(String.valueOf(x.charAt(x.length() - 1)))) {
                return true;  // La cédula es válida
            } else {
                if (suma % 10 == 0 && x.charAt(x.length() - 1) == '0') {
                    return true;  // Validación adicional cuando el residuo es 0
                } else {
                    return false;  // La cédula no es válida
                }
            }
        }
    }
}

