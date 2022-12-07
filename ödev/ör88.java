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
public class ör88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
         System.out. println ( "Lütfen bir tam sayi giriniz" );
        int  a = input.nextInt ();
        int  b = 2 ;
        if ( a > 1 ) {
            if ( a % b == 0 ) {
                System.out.println ( b );
                a/= b ;
                
            }
            else {
                b ++;
            }
            
        }
                
    }
    
}
    
    

