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
public class ör96 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("s tam sayısını giriniz");
        int s= input.nextInt();
        if ((s-1)%4==0) {
            System.out.println("Hilbert sayıdır");
            
        }
        else{
            System.out.println("Hilbert sayı değildir");
        }
    }
    
}
