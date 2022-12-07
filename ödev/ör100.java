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
public class ör100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("s tam sayısını giriniz");
        double s=input.nextDouble();
        double t=0;
        for (int i = 1; i <=s; i++) {
            if (s%i==0) {
                t=t+i;
            }
        }
        if (t<2*s) {
            System.out.println("eksik sayılardır ve eksiklik miktarı: "+(2*s-t));
            
        }
        else{
            System.out.println("eksik sayı değildir");
        }
    }
    
}
