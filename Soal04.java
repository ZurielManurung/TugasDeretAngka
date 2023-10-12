package DeretAngka;

public class Soal04 {
    public static void resolve (int n)
    {
        int helper = 1;
        int [] hasil = new int[n];

        for (int i = 0; i < n; i++) {
            hasil[i] = helper;
            helper += 4;
        }
        Utility.PrintArray1D(hasil);
    }
}
