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
public class mükemmelsayı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("s tam sayısını giriniz");
        int s=input.nextInt();
        int t=0;
        for (int i = 1; i <=s-1; i++) {
            if (s%i==0) {
                t=t+i;
                
            }
        }
            if (s==t) {
                System.out.println("mükemmel sayıdır");
                
            }
            else{
                System.out.println("mükemmel sayı değildir");
            }
            }
        }
    
    

