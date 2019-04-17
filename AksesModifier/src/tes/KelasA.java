package tes;

public class KelasA {
//    Private Modifier
    private int memberA = 5;

//    default modufier
    char memberB = 'A';
    double memberC = 1.5;

    private int functionA(){
        return memberA;
    }


    int functionB(){
//        pemanggilan priate meber dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    protected void methodC(){
        System.out.println("Percobaan acces modifier");
    }

}
