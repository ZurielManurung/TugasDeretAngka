package DeretAngka;

public class Soal08 {
    public static void resolve (int n)
    {
        int helper = 3;
        int [] hasil = new int[n];

        for (int i = 0; i < n; i++) {
            hasil[i] = helper;
            helper *= 3;
        }
        Utility.PrintArray1D(hasil);
    }
}
