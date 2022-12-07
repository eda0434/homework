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
public class ör99 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("a sayısını giriniz");
        double a=input.nextDouble();
        System.out.println("b sayısını giriniz");
        double b=input.nextDouble();
        double a1=(a/10);
        double a0=a%10;
        double b1=(b/10);
        double b0=b%10;
        if ((a1==b1) && (a0+b0==10)) {
            System.out.println("Bağdaşık sayılardır");
            
        }
        else{
            System.out.println("Bağdaşık sayılar değildr");
        }
    }
    
}
