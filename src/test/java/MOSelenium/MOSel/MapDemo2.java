package MOSelenium.MOSel;

import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {

        Map<String, Object> stud1 = new LinkedHashMap<>();
        stud1.put("Name", "Dinesh");
        stud1.put("Phone", 728675);
        stud1.put("City", "BLR");
        stud1.put("Paid", true);
        stud1.put("Course", Arrays.asList("Java", "Selenium", "API"));
        System.out.println(stud1);

        Map<String, Object> stud2 = new LinkedHashMap<>();
        stud2.put("Name", "Ruchi");
        stud2.put("Phone", 7276775);
        stud2.put("City", "Pune");
        stud2.put("Paid", true);
        stud2.put("Course", Arrays.asList("Javascript", "Python", "API"));
        System.out.println(stud2);

        List<Map<String, Object>> studDB = new ArrayList<>();
        studDB.add(stud1);
        studDB.add(stud2);
        System.out.println(studDB);




    }
}
