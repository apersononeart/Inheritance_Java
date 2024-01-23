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
public class PakSon_Persegi extends PakSon_Parent {
    Scanner input = new Scanner(System.in);
    float sisi;
    
    @Override
    public void intro() {
        namaBangun = "PERSEGI";
        
        super.intro();
        
        System.out.print("sisi: ");
        sisi = input.nextFloat();
    }
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = sisi * sisi;
        System.out.println("Luas "+namaBangun+" "+luas);
    }
    
    @Override
    public void keliling() {
        
        super.keliling();
        
        keliling = 4 * sisi;
        System.out.println("Keliling "+namaBangun+" "+keliling);
    }
}
