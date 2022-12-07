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
public class gümüşoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("u sayısını giriniz");
        double u=input.nextDouble();
        double b=u/(2+Math.pow(2,5));
        double a=u-b;
        System.out.println(a);
        System.out.println(b);
        
    }
    
}
