/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi6;

/**
 *
 * @author danu
 */
public class Bi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int C = 55;
        System.out.println(C + (C>=0? " Es positivo" : " Es negativo"));
        System.out.println(C + (C%5==0? " Es multiplo de 5" : " No es multiplo de 5"));
        System.out.println(C + (C%2==0? " Es par" : " Es impar"));
        System.out.println(C + (C%10==0? " Es multiplo de 10" : " NO es multiplo de 10"));
        System.out.println(C + (C>=100? " Es mayor que 100": " Es menor que 100"));
    }
    
}
