package DeretAngka;

public class Soal03 {
    public static void resolve (int n)
    {
        int helper = 1;
        int [] hasil = new int[n];

        for (int i = 0; i < n; i++) {
            hasil[i] = helper;
            helper += 3;
        }
        Utility.PrintArray1D(hasil);
    }
}
