package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        String lowerCaseWord = word.toLowerCase();
        for (int i = 0; i < word.length(); i++){
            if ((lowerCaseWord.charAt(i) == 'a') ||
                    (lowerCaseWord.charAt(i) == 'e') ||
                    (lowerCaseWord.charAt(i) == 'i') ||
                    (lowerCaseWord.charAt(i) == 'o') ||
                    (lowerCaseWord.charAt(i) == 'u')){
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
        return getIndexOfFirstVowel(word) == 0;
    }

    public static Boolean isVowel(Character character) {
        if (character == 'a' || character == 'e' || character == 'i'
            || character == 'o' || character == 'u');
        return true;
    }
}
