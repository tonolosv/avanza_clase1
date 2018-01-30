/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi3;

/**
 *
 * @author danu
 */
public class Bi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 1;
        System.out.println("Valor inicial de N: " + N);
        System.out.println("Incrementando en 77: " + (N+=77));
        System.out.println("Decremento en 3: " + (N-=3));
        System.out.println("Duplicando su valor: " + (N*=2));
    }
    
}
