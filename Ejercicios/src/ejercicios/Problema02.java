/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] datos = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
             sumar(datos, 0);
    }
    public static void sumar(double[][] datos, int fila) {
        double sumar = 0;
        for (int columna = 0; columna < datos[columna].length; columna++) {
            sumar = sumar + datos[fila][columna];
        }
        System.out.println("La suma es: " + sumar);
        fila = fila + 1;
        if (fila < datos.length) {
            sumar(datos, fila);
        }
    }
}
