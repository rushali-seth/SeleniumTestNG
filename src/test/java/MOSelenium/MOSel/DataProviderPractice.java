package MOSelenium.MOSel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {

    @Test
    public void method(String a, String b, String c){
        System.out.println();

    }


    @DataProvider(name = "getData")
    public Object[][] getData(String a, String b){
        Object[][] ob = new Object[3][2];
        ob[0][0] = "";
        ob[0][1] = "";
        ob[1][1] = "";
        ob[1][2] = "";
        ob[2][1] = "";
        ob[2][2] = "";

        return ob;
    }
}
