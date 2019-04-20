import java.util.Scanner;

public class TempAir {
    public static void main(String[] args) {
        /* contoh pemakaian IF tiga kasus : wujud air */

        /*Kamus*/
        int T;

        System.out.println("Contoh IF 3 kasus");
        System.out.println("Temperature (der. C)");

//        Scanne untuk masukan temperature air
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); // masukan temperature air dengan tipe int
//        proses pengecekan dengan if
        if ( T < 0 ){
            System.out.println("Wujud air beku" + T);
        }else if ((0 <= T ) && (T <= 100)){
            System.out.println("Wujud air cair" + T);
        }
        else if (T > 100){
            System.out.println("Wujud air uap/gas " + T);
        }
    }
}
