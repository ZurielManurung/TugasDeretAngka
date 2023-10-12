package DeretAngka;

public class Utility {
    public static void PrintArray1D(int[] hasil)
    {
        for (int i = 0; i < hasil.length; i++) {
            if (hasil[i] == 0){
                System.out.print("* ");
            }
            else {
                System.out.print(hasil[i] + " ");
            }
        }
    }
    public static void PrintArrayLanjut(int[] hasil)
    {
        int count = 1;
        for (int i = 0; i < hasil.length; i++) {
            if (count %3 == 0){
                System.out.print("* ");
                count++;
            }
            else {
                System.out.print(hasil[i] + " ");
                count++;
            }
        }
    }
    public static void PrintArrayNomor10(int[] hasil)
    {
        int count = 1;
        for (int i = 0; i < hasil.length; i++) {
            if (count %4 == 0){
                System.out.print("XXX ");
                count++;
            }
            else {
                System.out.print(hasil[i] + " ");
                count++;
            }
        }
    }
    public static void PrintArrayNomor11(int[] hasil)
    {
        for (int i = 0; i < hasil.length; i++) {
            if (hasil[i] == 0){
                System.out.print("1 ");
            }
            else {
                System.out.print(hasil[i] + " ");
            }
        }
    }
}

