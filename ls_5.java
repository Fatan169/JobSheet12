/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet12;
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class ls_5 {
    public static void tentukan (int a, int b, int c){
        if(a<b && a>c){
            System.out.print("Nilai Terbesar dalam " + a);
        }else if (b>a && c>b){
            System.out.print("Nilai Terbesar dalam " + b);
        }else if (c>a && c>b){
            System.out.print("Nilai Terbesar dalam " + c);
        }
    }
    public static void main(String[] args) {
        Scanner kkn = new Scanner (System.in);
        System.out.print("Masukkan Nilai yang anda inginkan untuk bilangan pertama : ");
        int e = kkn.nextInt();
        System.out.print("Masukkan Nilai yang anda inginkan untuk bilangan kedua : ");
        int f = kkn.nextInt();
        System.out.print("Masukkan Nilai yang anda inginkan untuk bilangan ketiga : ");
        int g = kkn.nextInt();
        
        
        tentukan(e,f,g);
        
        System.out.println("\n");
    }
}
