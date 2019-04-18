package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Menngunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");// method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth");// menambahkan objek "earth" beberapa kali
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

//        methode size() untuk mendapatkan ukuran set
        System.out.println("Set planets awa: (Size = "+ planets.size()+")");
        for (String planet : planets){
            System.out.println("\t " + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println("Set planets akhir: (Size = ) "+planets.size()+")");
        for (Iterator iterator = planets.iterator();
             iterator.hasNext();){
//            looping menggunakan iterator
            System.out.println("\t "+ iterator.next());
        }
    }
}
