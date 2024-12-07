/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl.mudah;

/**
 *
 * @author LOQ
 */
public class UklMudah {

    public static void main(String[] args) {
        for (int a = 50; a >= 1; a--) {
            cetakPesan(a);
        }
    }
    public static void cetakPesan(int a) {
        if (a % 2 == 0) {  
            
            if (a % 3 == 0) { 
                System.out.println(a + ". Saya Angkatan 33");
            } else { 
                System.out.println(a + ". Saya Anak Moklet");
            }
        } else if (a % 2 == 1) { 
            
            if (a == 1) { 
                System.out.println(a + ". Saya Senang");
            } else if (a % 3 == 0) { 
                System.out.println(a + ". Saya Angkatan 33");
            } else {     
                System.out.println(a + ". Saya Anak Wikusama");
            }
        }
    }
}

