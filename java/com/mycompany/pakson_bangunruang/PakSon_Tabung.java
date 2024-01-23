/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_bangunruang;
import java.util.Scanner;

class PakSon_Tabung extends PakSon_BangunRuang {
    Scanner input = new Scanner(System.in);
    PakSon_BangunRuang Tabung = new PakSon_BangunRuang();
    
    float jariJari;
    float tinggi;
    
    
    @Override
    public void intro() {
        namaBangun = "TABUNG";
        
        super.intro();
        
        System.out.print("jari-jari : ");
        jariJari = input.nextFloat();
        
        System.out.print("tinggi    : ");
        tinggi = input.nextFloat();
    }
    
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = (float) (2 * Math.PI * jariJari * (jariJari + tinggi));
        System.out.println("Luas "+super.namaBangun+" "+luas);
    }
    
    @Override
    public void volume() {
        
        super.volume();
        
        volume = (float) (Math.PI * jariJari * jariJari * tinggi);
        System.out.println("Volume "+super.namaBangun+" "+volume);
    }
}
