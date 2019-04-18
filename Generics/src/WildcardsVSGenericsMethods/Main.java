package WildcardsVSGenericsMethods;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
//    menggunakan wildcards
    static void print(Collection<?> col){
        for (Object o : col){
            System.out.println(o);
        }
    }

//    menggunakan generics methods
    static <T> Collection arrayToCollection(T[] a){
        Collection<T> c = new ArrayList<>();
        for (T o : a){
            c.add(o);
        }
        return c;
    }

    public static void main(String[] args) {
        String[] sa = {"Happy", "Coding"};

        Collection r = arrayToCollection(sa);

        print(r);
    }
}
