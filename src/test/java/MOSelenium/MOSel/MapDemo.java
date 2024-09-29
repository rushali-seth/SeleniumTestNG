package MOSelenium.MOSel;

import java.util.*;

public class MapDemo {
    public static void main(String[] args){

       Map<Integer, String> h = new HashMap<>();
        h.put(1, "rushali");

        h.put(3, "disha");
        h.put(2, "neha");
        h.put(4, "jaya");
        System.out.println("HashMap" + h);

        Map<Integer, String> h1 = new LinkedHashMap<>();
        h1.put(1, "chitra");
        h1.put(3, "aman");
        h1.put(4, "lekha");
        h1.put(2, "kaya");
        System.out.println("LinkedHashMap" + h1);

        Map<Integer, String> h2 = new TreeMap<>();
        h2.put(1, "chitra");
        h2.put(3, "aman");
        h2.put(2, "neha");

        h2.put(4, "lekha");
        System.out.println("TreeMap" + h2);













    }
}
