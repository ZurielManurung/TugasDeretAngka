package DeretAngka;

public class Soal11 {
    public static void resolve (int n)
    {
        int helper1 = 0;
        int helper2 = 1;
        int [] hasil = new int[n];

        for (int i = 1; i < n; i++)
        {
            hasil[i] = helper1 + helper2;
            helper1 = helper2;
            helper2 = hasil[i];
        }
        Utility.PrintArrayNomor11(hasil);
    }
}
