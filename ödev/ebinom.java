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
public class ebinom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("x değerini giriniz");
        double x=input.nextDouble();
        System.out.println("n değerini giriniz");
        double n=input.nextDouble();
        double sonuc= Math.pow((1+x/n), n);
       sonuc=Math.pow((1+x/n), n);
        System.out.println("sonuç:"+sonuc);
    }
    
}
