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
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double suma=0;
        double base;
        double potencia;
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];

        for (int i = 0; i < 5; i++) {
            base = bases[i];
            potencia = potencias[i];
            resultado[i] = potencia(base, potencia);
            suma = sumar(resultado ,resultado.length);
            System.out.printf("El numero %.1f elevado a %.1f = %.1f\n",
                    bases[i], potencias[i], resultado[i]);
        }
        System.out.printf("Finalmente la suma del arreglo resultado es de : "
                + "%.1f\n",suma);
    }
    public static double potencia(double base, double potencia) {

        if (potencia == 1) {
            return base;
        } else {
            return base * potencia(base, potencia - 1);
                 }
              }
    public static double sumar(double [] resultado, int tamaño) {
        if (tamaño == 1) {
            return resultado[0];
        } else {
            return resultado[tamaño - 1] + sumar(resultado, tamaño - 1);
              }
          }
       }
