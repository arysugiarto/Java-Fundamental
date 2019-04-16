public class MethodeOverloading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p,l);
        System.out.println("Hasil adalah = "+hasil);

        int pn = 7;
        int lb = 6;
        int hsl = hitungLuas(pn,lb);
        System.out.println("Hasilnya adalah = "+hsl);
    }
//    methode ke 1

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

//    methode ke 2
    public   static int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
}
