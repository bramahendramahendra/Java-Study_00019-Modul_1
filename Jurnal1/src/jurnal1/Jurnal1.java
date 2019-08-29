/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal1;

import java.util.Scanner;

/**
 *
 * @author Brama Hendra Mahendra
 */
public class Jurnal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bilangan : ");
        int bilangan1 = input.nextInt();
        
        int hasil=1;
        for(int i=1;i<=bilangan1;++i) {    
             hasil=hasil*i;
        }    
        System.out.println(bilangan1+" faktorial = "+hasil);
    }
    
}
