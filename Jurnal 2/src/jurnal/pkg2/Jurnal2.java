/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.pkg2;

import java.util.Scanner;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class Jurnal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bilangan : ");
        int bilangan1 = input.nextInt();
        
        while (bilangan1>0) {
            int loop = bilangan1;
            while(loop>0){
                System.out.print("*");
                loop--;
            }
            System.out.println("");
            bilangan1--;
        }
    }
    
}
