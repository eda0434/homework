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
public class eüzeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("n sayısını giriniz");
        double n=input.nextDouble();
        System.out.println("x sayısını giriniz");
        double x= input.nextDouble();
        double toplam=0;
        for (int k = 0; k <= n; k++) {
            int faktöriyel=1;
            for (int j = 1; j <= k; j++) {
                faktöriyel*=j;
                
            }
            toplam+=(double)Math.pow(x, k)/faktöriyel;
        }
        System.out.println("e: "+toplam);
    }
    
}
