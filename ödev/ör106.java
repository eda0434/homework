/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author casper
 */
public class ör106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          for ( int  i = 1 ; i <= 9 ; i ++) {
            for ( int  j = 1 ; j <= 9 ; j ++) {
                System. out . println ( 101 * i + 10 * j + i );     
                
            }
            for( int  j = 1 ; j <= 9 ; j ++) {
                for ( int  k = 0 ; k <= 9 ; k ++) {
                    System.out . println ( 1000 * i + 100 * k + 10 * k + i );
                }
                
            }
            
            
        }
    }
    
}
