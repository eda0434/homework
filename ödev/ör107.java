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

public class ör107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        System.out.println("Lütfen basamak sayısıs giriniz");
        int n=input.nextInt();
        System.out.println(9*Math.pow(10, n-1/2));
        
    }
    
}
