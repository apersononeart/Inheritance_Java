/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pakson_bangundatar;

/**
 *
 * @author abdulkodir
 */
public class PakSon_BangunDatar {
    public static void main(String[] args) {
        PakSon_Parent persegi = new PakSon_Persegi();
        PakSon_Parent segitiga = new PakSon_Segitiga();
        PakSon_Parent lingkaran = new PakSon_Lingkaran();
        PakSon_Parent persegiPanjang = new PakSon_PersegiPanjang();
        
        persegi.intro();
        persegi.luas();
        persegi.keliling();
        
        segitiga.intro();
        segitiga.luas();
        segitiga.keliling();
        
        lingkaran.intro();
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.intro();
        persegiPanjang.luas();
        persegiPanjang.keliling();
    }
}
