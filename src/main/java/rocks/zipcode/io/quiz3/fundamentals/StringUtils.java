package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] arr = str.toCharArray();

        arr[indexToCapitalize] = Character.toUpperCase(arr[indexToCapitalize]);
        String stringThis = new String(arr);
        return stringThis;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if (baseString.charAt(indexOfString) == characterToCheckFor)
        return true;

        return false;
    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1; j < string.length() + 1; j++){
                if (!arrList.contains((string.substring(i, j)))) {
                    arrList.add(string.substring(i, j));
                }
            }
        }
        return arrList.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        int counter = -1;
        for (int i = 0; i < input.length(); i++){
            for (int j = i + 1; j < input.length() + 1; j++){
                counter++;
            }
        }
        return counter;
    }
}
