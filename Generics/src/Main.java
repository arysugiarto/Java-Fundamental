import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList(); //List yanpa type-parameter
        lo.add("lo- String 1"); //lo menampung objek string
        lo.add(new Planet("Mercury",0.06)); //Lo menampung objek planet


        for (Object o : lo){
            Planet p = (Planet) o; // perlu type-casting dari Object ke Planet
            p.print();
        }

        List<Planet> lp = new ArrayList(); // list dengan parameter type-parameter planet
        lp.add(new Planet("Mercury",0.06)); //Lp menampung objek planet
//        lp.add("lp-String 1"); // baris ini compile-error, lp tidak diijinkan menampung objek String

        lp.add(new Planet("Venus",0.82));

        for (Planet p : lp){
            p.print();
        }
    }
}
