/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_bangundatar;

import java.util.Scanner;

/**
 *
 * @author abdulkodir
 */
public class PakSon_Segitiga extends PakSon_Parent {
    Scanner input = new Scanner(System.in);
    float alas;
    float tinggi;
    float sisi_a;
    float sisi_b;
    float sisi_c;
    
    @Override
    public void intro() {
        namaBangun = "SEGITIGA";
        
        super.intro();
        
        System.out.print("alas   : ");
        alas = input.nextFloat();
        
        System.out.print("tinggi : ");
        tinggi = input.nextFloat();
        
        System.out.print("sisi a : ");
        sisi_a = input.nextFloat();
        
        System.out.print("sisi b : ");
        sisi_b = input.nextFloat();
        
        System.out.print("sisi c == " + alas + " (alas)");
    }
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = alas * tinggi * 1 /2;
        System.out.println("Luas "+namaBangun+" "+luas);
    }
    
    @Override
    public void keliling() {
        
        super.keliling();
        
        keliling = sisi_a + sisi_b + alas;
        System.out.println("Keliling "+namaBangun+" "+keliling);
    }
}
