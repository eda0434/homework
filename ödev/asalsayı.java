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
public class asalsayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("n sayısını giriniz");
        double n=input.nextDouble();
        for (int i = 2; i <=n; i++) {
            double s=0;
            for (int j = 1; j <=i; j++) 
                if(i%j==0)
                    s++;
                    if (s==2)
                
                    System.out.println(i);
                }
               
               }
               
            }
            
        
    
    

