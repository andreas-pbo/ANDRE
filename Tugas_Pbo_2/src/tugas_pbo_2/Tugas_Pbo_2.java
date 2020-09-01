package tugas_pbo_2;

import java.util.Scanner;

public class Tugas_Pbo_2 {

    public static void main(String[] args) {
        int bilangan1, bilangan2;
        int hitung;
        Scanner file = new Scanner(System.in);
        System.out.print("Masukan Angka 1 : ");
        bilangan1 = file.nextInt();
        System.out.print("Masukan Angka 2 : ");
        bilangan2 = file.nextInt();
        hitung = bilangan1 + bilangan2;
        System.out.println("Hasil Penjumlahan = " + hitung);
    }

}
