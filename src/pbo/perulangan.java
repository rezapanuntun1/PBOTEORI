/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.util.Scanner;
/**
 *
 * @author reza
 */
public class perulangan {
     public static void main(String[] args) {
        int plhn = 0;
        Scanner s= new Scanner (System.in);
        
        while( plhn != 3 ){
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih : "); plhn=s.nextInt();
        }
    }
}


