/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.sedang;

/**
 *
 * @author LOQ
 */
public class UklSedang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tabunganBulan1 = 100000; 
        int peningkatansetiapBulanan = 50000; 
        int totalTabungan = 0;

        for (int bulan = 1; bulan <= 12; bulan++) {
            int tabungansetiapBulan = tabunganBulan1 + (bulan - 1) * peningkatansetiapBulanan; 

            totalTabungan += tabungansetiapBulan; //+= digunakan untuk menyimpan nilai dalam variabel 

            System.out.println("Tabungan bulan ke-" + bulan + ": Rp" + tabungansetiapBulan); 
        }
        System.out.println("Total tabungan setelah 12 bulan: Rp" + totalTabungan); 
    }
}
