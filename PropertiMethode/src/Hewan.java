public class Hewan {
//    properti atau fields
//    inisialisasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

//    inisiasi melalui konstruktor
    int umur;

//    konstruktor dengan parameter
    Hewan(int umurParam){
        umur = umurParam;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut");
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public int getUmur() {
        return umur;
    }
}
