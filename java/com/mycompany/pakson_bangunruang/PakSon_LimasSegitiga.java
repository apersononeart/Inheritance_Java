/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pakson_bangunruang;
import java.util.Scanner;

class PakSon_LimasSegitiga extends PakSon_BangunRuang {
    Scanner input = new Scanner(System.in);
    PakSon_BangunRuang Tabung = new PakSon_BangunRuang();
    
    float alas;
    float tinggiAlas; //Tinggi Alas
    float tinggiLimas; //Tinggi limas
    float tinggiSegitigaTegak;
    
    
    @Override
    public void intro() {
        namaBangun = "LIMAS SEGITIGA";
        
        super.intro();
        
        System.out.print("alas         : ");
        alas = input.nextFloat();
        
        System.out.print("tinggi alas  : ");
        tinggiAlas = input.nextFloat();
        
        System.out.print("tinggi limas : ");
        tinggiLimas = input.nextFloat();
        
        tinggiSegitigaTegak = (float) ((Math.pow((1/ 2 * tinggiAlas), 2)) + (Math.pow(tinggiLimas, 2)));
    }
    

    
    
    @Override
    public void luas() {
        
        super.luas();
        
//        (1 / 2 * alas * tinggiAlas) + (3 * (1 / 2 * alas * tinggiLimas))
        
        luas = 2 * alas;
        System.out.println("Luas "+super.namaBangun+" "+luas);
    }
    
    @Override
    public void volume() {
        
        super.volume();
        
//        1/3 * (1 / 2 * alas * tinggiAlas) * tinggiLimas
        
        volume = 3 * alas;
        System.out.println("Volume "+super.namaBangun+" "+volume);
    }
}
