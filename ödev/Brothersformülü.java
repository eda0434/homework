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
public class Brothersformülü {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir N tam sayısı giriniz");
        int N =input.nextInt();
        double toplam=0;
        for (int k = 0; k <= N; k++) {
            int temp=2*k+1;
            double faktöriyel=1;
            for (int j = 1; j <=temp; j++) {
                faktöriyel*=j;
                
            }
            toplam+=(double)(temp+1)/faktöriyel;
            
        }
        System.out.println("toplam:"+toplam);
    }
    
}
