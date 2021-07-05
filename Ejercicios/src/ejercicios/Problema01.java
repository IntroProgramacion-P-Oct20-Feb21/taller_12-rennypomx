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
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] resultado = new double[4][2];
        double valor;
        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
              for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 2; j++) {
                valor = datos[i][j];
                resultado[i][j] = factoriales(valor);
                System.out.printf("El factorial del valor de: %.1f es: %.1f\n",
                        datos[i][j], factoriales(valor));
            }
        }
    }
    public static double factoriales(double valor) {
        if (valor <= 1) {
            return 1;
        } else {
            return valor * factoriales(valor - 1);
        }
    }
}
