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

public class ör121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        System.out.println("Lütfen terim sayısını giriniz");
        int n =input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            
            
            double t=0;
            double f=1;
            for (int j = 1; j <=100; j++) {
                f*=j;
                t+=Math.pow(j, i)/f;
                
            }
             double e=2.718;

            
            System.out.println(t/e);            
        }
        
    }
    
}
    
    

