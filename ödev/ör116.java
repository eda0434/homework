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

public class ör116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double f2=input.nextDouble();
        double ao=(double) (1+Math.pow(5, 0.5))/2;
        double f1=(f2/ao);
        double f3=(f2*ao);
        System.out.println(Math.ceil(f1));
        System.out.println(f2);
        System.out.println(Math.ceil(f3));
        
    }
    
}
