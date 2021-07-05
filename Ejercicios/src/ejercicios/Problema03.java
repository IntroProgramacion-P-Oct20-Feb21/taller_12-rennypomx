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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] sumar = new double[5];
    for (int i = 0; i < datos.length; i++) {
        num1 = datos[i];
        num2 = datos2[i];
         sumar[i] = sumar(num1, num2);
            System.out.printf("La suma de los datos 1 y 2 son: %.1f + %.1f = "
                    + "%.1f\n", datos[i], datos2[i], sumar[i]);
        }
    }
    public static double sumar(double num1, double num2) {
        if (num2 == 0) {
            return num1;
        } else {
            if (num1 == 0) {
                return num2;
            } else {
                return 1 + sumar(num1, num2 - 1);
            }
        }
    }
}
