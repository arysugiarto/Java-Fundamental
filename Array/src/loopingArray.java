public class loopingArray {
    public static void main(String[] args) {

        int[] arrInt = new int[1000000];
//        inisialisasi arrInt dari elemen ke 1 sampai 1000000
        for (int x = 0; x < arrInt.length ; x++){
            arrInt[x] = x + 1;
        }
//        Tampilkan arrInt dari elemen ke 1 sampai 1juta
        for (int x = 0 ; x < arrInt.length ; x++){
            System.out.println(arrInt[x]);
        }
    }
}
