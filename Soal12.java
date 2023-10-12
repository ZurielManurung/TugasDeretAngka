package DeretAngka;

public class Soal12 {
    public static void resolve (int n)
    {
// bilangan prima -> bilangan yang tidak bisa habis dibagi dengan bilangan lain, kecuali bilangan itu sendiri
// alias hanya bisa dibagi 1 / dibagi bilangannya sendiri
        int hitung = 0;
        int jumlahData = 0;
        int counter = 0;

        int [] hasil = new int[n];

        for (int i = 0; i < n * 10; i++){
            for (int j = 1; j <= i; j++){
                if (i % j == 0)
                {
                    hitung++;
                }
            }
            if (hitung == 2){
                hasil[counter] = i;
                counter++;
                jumlahData++;
            }
            if (jumlahData == n)
            {
                break;
            }
            hitung = 0;
        }
        Utility.PrintArray1D(hasil);
    }
}