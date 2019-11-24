package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String lowerCaseStr = str.toLowerCase();
        ArrayList<String> strList = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            String emptyStr = "";
            if (Character.isLetter(str.charAt(i))) {
                emptyStr = lowerCaseStr.substring(0, i) + lowerCaseStr.substring(i, i + 1).toUpperCase() + lowerCaseStr.substring(i + 1);
                strList.add(emptyStr);
                }
            }
        return strList.toArray(new String[strList.size()]);
        //coming back to this!
    }
}
