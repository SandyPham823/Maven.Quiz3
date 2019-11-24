package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");

        if (!VowelUtils.hasVowels(str))
            return str + "ay";

        if ((VowelUtils.startsWithVowel(str)))
            return str + "way";

        if (strArr.length > 1){
            for (String s : strArr){
                if (VowelUtils.startsWithVowel(s))
                    sb.append(s + "way ");

                else{
                    sb.append(s.substring(VowelUtils.getIndexOfFirstVowel(s)) + s.substring(0, VowelUtils.getIndexOfFirstVowel(s)) + "ay ");
                }
            }
            return sb.toString().trim();
        }
        return (str.substring(VowelUtils.getIndexOfFirstVowel(str)) + str.substring(0, VowelUtils.getIndexOfFirstVowel(str)) + "ay");
    }
}
