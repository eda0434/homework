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
public class Madhavaofsangamagrama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("n tam sayısını giriniz");
        int n=input.nextInt();
        double t=0;
        for (int k = 0; k <=n-1; k++) {
         t+=(Math.pow((-1),k))/((double)(2*k+1)*Math.pow(3, k));
           
                  
                    
            
        }
         System.out.println(Math.sqrt(12)*t);
    }
    
}
