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
public class PakSon_Lingkaran extends PakSon_Parent {
    Scanner input = new Scanner(System.in);
    float jariJari;
    
    @Override
    public void intro() {
        namaBangun = "LINGKARAN";
        
        super.intro();
        
        System.out.print("jari-jari: ");
        jariJari = input.nextFloat();
    }
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = 22 / 7 * jariJari * jariJari;
        System.out.println("Luas "+namaBangun+" "+luas);
    }
    
    @Override
    public void keliling() {
        
        super.keliling();
        
        keliling = 2 * 22 / 7 * jariJari;
        System.out.println("Keliling "+namaBangun+" "+keliling);
    }
}
