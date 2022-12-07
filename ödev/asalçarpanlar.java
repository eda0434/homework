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
public class asalçarpanlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println(" a tam sayısını giriniz");
        double a=input.nextDouble();
        double b=2;
        if (a>1) {
            if (a%b==0) {
                b=b+1;
                
                
            }
            System.out.println(b);
            a=a/b;
        }
    }
    
}
