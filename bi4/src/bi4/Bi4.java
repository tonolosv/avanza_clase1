/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi4;

/**
 *
 * @author danu
 */
public class Bi4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D, AUX; 
        /**AUX es una variable que su función es guardar
         * valores de otra variable, se usa como auxiliar**/
        A=1; B=2; C=3; D=4;
        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
        System.out.println("Valor de C: " + C);
        System.out.println("Valor de D: " + D);
        AUX = B;
        B = C;
        C = A;
        A = D;
        D = AUX; 
        System.out.println("Valores Finales: ");
        System.out.println("B toma el valor de C -> B = " +B);
        System.out.println("B toma el valor de A -> C = " +C);
        System.out.println("B toma el valor de D -> A = " +A);
        System.out.println("B toma el valor de B -> D = " +D);
    }
    
}
