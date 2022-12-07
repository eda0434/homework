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
public class eüzerikitap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
         System.out.println("terim sayısını giriniz");
         int N=input.nextInt();
         double x=1;
         double T=1;
         double F=1;
         System.out.println("x değerini giriniz");
         x=input.nextDouble();
         for (int i = 1; i <= N; i++) {
             F*=i;
             T+=Math.pow(x,i)/F;
            
        }
         System.out.println("T");
         System.out.println(Math.exp(x));
    }
    
}
