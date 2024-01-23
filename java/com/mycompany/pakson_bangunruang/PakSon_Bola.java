/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_bangunruang;
import java.util.Scanner;

class PakSon_Bola extends PakSon_BangunRuang {
    PakSon_BangunRuang Bola = new PakSon_BangunRuang();
    
    float jariJari;
    
    
    @Override
    public void intro() {
        namaBangun = "BOLA";
        
        super.intro();
        
        System.out.print("jari-jari: ");
        jariJari = input.nextFloat();
    }
    
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = (float) (4 * Math.PI * jariJari * jariJari);
        System.out.println("Luas "+namaBangun+" "+luas);
    }
    
    @Override
    public void volume() {
        
        super.volume();
        
        volume = (float) ((4/3) * Math.PI * jariJari * jariJari * jariJari);
        System.out.println("Volume "+namaBangun+" "+volume);
    }
}
