package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++){
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')){
                return true;
            }
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (hasVowels(word.valueOf(word.charAt(i)))) {
                return i;
            }
        }
        return -1;
    }

//something wrong with this test idk WHAT
    public static Boolean startsWithVowel(String word) {
            if (getIndexOfFirstVowel(word) == 0)
                return true;

            return false;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'e' || character == 'i'
            || character == 'o' || character == 'u');
        return true;
    }
}
