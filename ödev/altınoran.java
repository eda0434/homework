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
public class altınoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ab gir");
        int ab=input.nextInt();
        double cb=2*ab/(1+Math.pow(5,0.5));
        double ac=ab-cb;
        System.out.println(ac);
        System.out.println(cb);
    }
    
}
