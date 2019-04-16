package OperatorEquality;

public class OperatorEquality {
    public static void main(String[] args) {

        int value1 = 5;
        int value2 = 4;
        boolean hasil;

        System.out.println("sama dengan");
        hasil = value1 == value2;
        System.out.println("Hasil 'value1 == value2' adalah "  + hasil);
        System.out.println();

        System.out.println("Tidak sama dengan");
        hasil = value1 != value2;
        System.out.println("Hasil 'value1 != value2 adalah" + hasil);
        System.out.println();

        System.out.println("Lebih Besar dari");
        hasil = value1 > value2;
        System.out.println("Hasil 'value1 > value2 adalah  " + hasil);
        System.out.println();

        System.out.println("Sama atau leboh besar dari..");
        hasil = value1 >= value2;
        System.out.println("Hasil 'value1 >= value2"  + hasil);
        System.out.println();

        System.out.println("Kurang dari..");
        hasil = value1 < value2;

        System.out.println("Hasil 'value1 < value2' adalah"+ hasil);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        hasil = value1 <= value2;
        System.out.println("Hasil 'value1 <= value2 adalah"  +hasil );
        System.out.println();
    }
}
