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
public class altınüçgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("a sayısını giriniz");
        double a=input.nextDouble();
        double b=a*(1+Math.pow(5,1/2)/2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
    }
    
}
