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
public class ör94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("n terim sayısını giriniz");
        int n=input.nextInt();
        for (int i = 0; i <=n-1; i++) {
            System.out.println(Math.pow(2, Math.pow(2,i))+1);
            
        }
    }
    
}
