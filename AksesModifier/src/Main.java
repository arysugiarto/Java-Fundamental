import tes.KelasA;

public class Main {
    public static void main(String[] args) {

        KelasA kelasA = new KelasA();

//      // Kode ini pasti akan mengalami kompiler error
//        System.out.println(kelasA.memberA);

//        // Kode ini pasti akan mengalami kompiler error
//        System.out.println(kelasA.functionA);

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
        System.out.println(kelasA.functionB());

    }
}
