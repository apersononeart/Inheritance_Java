/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_bangunruang;
import java.util.Scanner;


class PakSon_Kubus extends PakSon_BangunRuang {
    Scanner input = new Scanner(System.in);
    PakSon_BangunRuang kubus = new PakSon_BangunRuang();
    
    float sisi;
    
    
    @Override
    public void intro() {
        namaBangun = "KUBUS";
        
        super.intro();
        
        System.out.print("sisi : ");
        sisi = input.nextFloat();
    }
    
    
    @Override
    public void luas() {
        
        super.luas();
        
        luas = 6 * (sisi * sisi);
        System.out.println("Luas "+super.namaBangun+" "+luas);
    }
    
    @Override
    public void volume() {
        
        super.volume();
        
        volume = sisi * sisi * sisi;
        System.out.println("Volume "+super.namaBangun+" "+volume);
    }
}
