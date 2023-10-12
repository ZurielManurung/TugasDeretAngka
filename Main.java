package DeretAngka;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        int n = 0;

        System.out.println("Pilih Nomor Soal (1-12)");
        pilihan = input.nextInt();

        while (pilihan < 1 || pilihan > 12)
        {
            System.out.println("Nomor Soal Tidak Tersedia");
            pilihan = input.nextInt();
        }

        System.out.println("Ketikkan Jumlah Angka yang Diinginkan :");
        n = input.nextInt();

        switch (pilihan)
        {
            case 1: Soal01.resolve(n);
                break;
            case 2: Soal02.resolve(n);
                break;
            case 3: Soal03.resolve(n);
                break;
            case 4: Soal04.resolve(n);
                break;
            case 5: Soal05.resolve(n);
                break;
            case 6: Soal06.resolve(n);
                break;
            case 7: Soal07.resolve(n);
                break;
            case 8: Soal08.resolve(n);
                break;
            case 9: Soal09.resolve(n);
                break;
            case 10: Soal10.resolve(n);
                break;
            case 11: Soal11.resolve(n);
                break;
            case 12: Soal12.resolve(n);
                break;

        }
    }
}