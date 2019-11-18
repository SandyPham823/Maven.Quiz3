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

    //coming back to this!
    public static String[] getAllSubStrings(String string) {
        for (int i = 0; i < string.length(); i++){
            for (int j = i + 1; j <= string.length(); j++){

            }
        }
        return null;
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
