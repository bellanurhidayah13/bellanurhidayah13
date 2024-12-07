/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.sulit;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class UklSulit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("rekap jumlah kehadiran siswa selama 1 bulan ");

        System.out.print("Masukkan jumlah siswa :"); 
        int jumlahSiswa = scanner.nextInt();

        double[] hadir = new double[jumlahSiswa];
        
        double totalKehadiran = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan total hadir siswa " + (i + 1) + ": "); 
            
            hadir[i] = scanner.nextDouble();
            
            totalKehadiran += hadir[i];
        }
        double rataRata = totalKehadiran / jumlahSiswa;
        System.out.println("rata-rata kehadiran siswa : " + rataRata); 

        System.out.println("Rekap Kehadiran Siswa Selama 1 Bulan,Jumlah Hari masuk adalah 24 Hari:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hadir[i] + " hari hadir"); 
        }

        System.out.printf("Rata-rata kehadiran siswa: %.2f hari", rataRata); 

        System.out.println("Kesimpulan:"); 

        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hadir[i] + " hari)"); 
            }
        }
        System.out.println("Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hadir[i] + " hari)");
            }
        }
    }
}
