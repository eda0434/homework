/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
import java.util.Random;
import java.util.Scanner;
public class ör73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
          Random r = new  Random ();
        char  c =( char )( r . nextInt ( 26 )+ 'a' );
           System.out. println ( c );
        
        for ( int  i = 1 ; i <= 10 ; i ++) {
            if ( c == input .next () .charAt ( 0 )) {
                System.out. println ( i + ".Hakta bildiniz" );
            }
            
        }
        System.out. println ( "Bilemediniz" );
        
    }
    
}
