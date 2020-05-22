/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathuchanh;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author phamquochuy
 */
public class JavaThucHanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Bài 7
        int a[];
        int n=0;
        
        
        System.out.println("Nhập số phần tử của mảng");
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        a= new int[n];
        
        
       for(int i=0;i<n;i++){
           
           System.out.println("Nhập phần tử thứ  "+i);
            a[i]= scan.nextInt();
        }
       int max=-999999;
       System.out.println("Tất cả các số nguyên tố trong Mảng là");
       for(int i=0;i<n;i++){
           if(checkSonguyento(a[i])==true){
               System.out.println(a[i]);
           }
           
           if(max < a[i]){
               max=a[i];
           }
       }
       
       System.out.println("Phần tử lớn nhất trong mảng là" + max);
       
       
       System.out.println("Tất cả các số chính  trong Mảng là");
       for(int i=0;i<n;i++){
           if(checkSoChinhPhuong(a[i])==true){
               System.out.println(a[i]);
           }
         
       }
       
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(a[i]>a[j]){
                   int temp = a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       System.out.println("Mảng sau khi sắp xếp");
       for(int i=0 ;i<n ;i++){
           System.out.println(a[i]);
       }
       
    }
    static Boolean checkSonguyento(int n){
        
        if(n<2){
            return false;
        }
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        
    }
    static Boolean checkSoChinhPhuong(int n){
        if(sqrt(n)*sqrt(n)==(int) n ){
            return true;
        }
        return false;
    }
    
}
