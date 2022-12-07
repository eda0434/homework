/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
import java.util.Scanner;
public class Ln2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("n tam sayısı giriniz");
        double n=input.nextDouble();
        double t=0;
        for (int k = 0; k <=n-1; k++) {
            t=t+1/((2*k+1)*(2*k+2));
            
        }
        System.out.println("toplam:"+t);
    }
    
}
