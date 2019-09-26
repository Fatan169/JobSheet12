/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.kalkulator.sederhana;
/**
 *
 * @author asus
 */
public class kalkulator {
public static void main(String[] args) {
        System.out.println("Hasil Penjumlahan : " + jumlah(15,10));
        System.out.println("Hasil Pengurangan : " + kurang(15,12));
        System.out.println("Hasil Perkalian : " + kali(7,2));
        System.out.println("Hasil Pembagian : " + bagi(20,5));
        System.out.println("Hasil modulus : " + SHB(10,4));
        
    }
    
    public static double jumlah(int a , int b){
        
                
        double hasil = a+b;
        return hasil;
    }    
    public static double kurang(int a , int b){
                
        double hasil =  a-b;
        return hasil;
    }   
    public static double kali(int a, int b){
       
               
        double hasil = a*b;
        return hasil;
    }    
    public static double bagi(double a, double b){
        
        double hasil = a/b;
        return hasil;
    }
    public static double SHB ( double a, double b){
          if(a>b){
          double hasil = a%b;
          return hasil;
         }else if (a<b){
              
         }
         return 0;
    }
}