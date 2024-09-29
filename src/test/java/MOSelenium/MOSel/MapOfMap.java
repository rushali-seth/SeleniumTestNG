package MOSelenium.MOSel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapOfMap {
    public static void main(String[] args){

        Map<Integer, Map<String, Object>> allStud = new HashMap<>();

        Map<String, Object> stud1 = new LinkedHashMap<>();
        stud1.put("Name", "Dinesh");
        stud1.put("Phone", 728675);
        stud1.put("City", "BLR");
        stud1.put("Paid", true);
        stud1.put("Course", Arrays.asList("Java", "Selenium", "API"));

        Map<String, Object> stud2 = new LinkedHashMap<>();
        stud2.put("Name", "Ruchi");
        stud2.put("Phone", 7276775);
        stud2.put("City", "Pune");
        stud2.put("Paid", true);
        stud2.put("Course", Arrays.asList("Javascript", "Python", "API"));

        allStud.put(11, stud1);
        allStud.put(12, stud2);
        System.out.println(allStud);



    }
}
