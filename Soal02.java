package DeretAngka;

public class Soal02 {
    public static void resolve (int n)
    {
        int helper = 2;
        int [] hasil = new int[n];

        for (int i = 0; i < n; i++) {
            hasil[i] = helper;
            helper += 2;
        }
        Utility.PrintArray1D(hasil);
    }
}
