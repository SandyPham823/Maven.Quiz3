package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        StringBuffer s = new StringBuffer(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.chars().allMatch(Character::isLetter))
                str += str.substring(i).toUpperCase();
            else {
                str += str.substring(i + 1);

            }
        }
        return null;
        //coming back to this!
    }
}
