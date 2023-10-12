package DeretAngka;

public class Soal09 {
    public static void resolve (int n)
    {
        int helper = 4;
        int count = 1;
        int [] hasil = new int[n];

        for (int i = 0; i < n; i++) {
            if (count % 3 == 0)
            {
                hasil[i] = 0;
                count ++;
            }
            else
            {
                hasil[i] = helper;
                helper *= 4;
                count ++;
            }
        }
        Utility.PrintArray1D(hasil);
    }
}
