/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pakson_bangunruang;
import java.util.Scanner;

public class PakSon_Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enter = 0;
        
        PakSon_BangunRuang bangunRuang = new PakSon_BangunRuang();
        PakSon_Bola bola = new PakSon_Bola();
        PakSon_Tabung tabung = new PakSon_Tabung();
        PakSon_LimasSegitiga limasSegitiga = new PakSon_LimasSegitiga();
        PakSon_Kubus kubus = new PakSon_Kubus();
        
        
        while(enter != 5) {
            System.out.println("=====CHOOSE=====");
            System.out.println("1. BOLA");
            System.out.println("2. TABUNG");
            System.out.println("3. LIMAS SEGITIGA");
            System.out.println("4. KUBUS");
            System.out.println("5. EXIT");

            System.out.println("==============");
            System.out.print("Enter: ");
            enter = input.nextInt();
            
            System.out.println("");

            switch(enter) {
                case 1:
                    bola.intro();
                    bola.luas();
                    bola.volume();
                    break;
                case 2:  
                    tabung.intro();
                    tabung.luas();
                    tabung.volume();
                    break;
                case 3:
                    limasSegitiga.intro();
                    limasSegitiga.luas();
                    limasSegitiga.volume();
                    break;
                case 4:
                    kubus.intro();
                    kubus.luas();
                    kubus.volume();
                    break;
            }
        } 
    }
}
