/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class ls_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double jarak, waktu;
        double kecepatan;
        
        System.out.print("Jarak tempuh mobil (km) : ");
        jarak = input.nextDouble();
        System.out.print("Waktu tempuh Mobil (jam) : ");
        waktu = input.nextDouble();
        
        kecepatan = jarak / waktu ;
        
   
        System.out.print("Kecepatan Mobil (km/jam) : " + kecepatan);
        System.out.println("\n");
                
       
        
    }
}
