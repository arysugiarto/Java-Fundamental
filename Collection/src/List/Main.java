package List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Deklarasi array
        String[]  heroes = new String[2];
        heroes[0] = "riki";
        heroes[1] = "sven";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap

//        menngunakan arraylist
        List planets = new ArrayList();
        planets.add("mercury"); //methode add() untuk menambahkan object ke list
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); //object lainya masih bisa terus ditambahkan ke list

        System.out.println("List planets awal:");
        for (int i = 0; i< planets.size(); i++){
            // method size() untuk mendapatkan ukuran List
            // method get() untuk melihat isi List pada index i
            System.out.println("\t indext-"+ i +"="+ planets.get(i));
        }

        planets.remove("venus"); //methode remove() untuk mengeluarkan object dari list

        System.out.println("List planets akhir ");
        for (int i = 0; i < planets.size(); i++){
            System.out.println("\t index-" + i + "="+ planets.get(i));
        }
    }
}
