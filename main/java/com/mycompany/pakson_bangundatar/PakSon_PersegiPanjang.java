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
public class PakSon_PersegiPanjang extends PakSon_Parent {
    Scanner input = new Scanner(System.in);
    float sisi;
    float panjang;
    float lebar;
    
    @Override
    public void intro() {
        namaBangun = "PERSEGI PANJANG";
        
        super.intro();
        
        System.out.print("panjang : ");
        panjang = input.nextFloat();
        
        System.out.print("lebar : ");
        lebar = input.nextFloat();
    }
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = panjang * lebar;
        System.out.println("Luas "+namaBangun+" "+luas);
    }
    
    @Override
    public void keliling() {
        
        super.keliling();
        
        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling "+namaBangun+" "+keliling);
    }
}
