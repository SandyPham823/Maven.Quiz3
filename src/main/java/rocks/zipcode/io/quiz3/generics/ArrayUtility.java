package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.stream.Collector;

import static java.util.stream.Collectors.toList;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;
    int counter;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        for (SomeType someType : array) {
            counter = 0;
            for (SomeType type : array) {
                if (someType.equals(type)) {
                    counter++;
                }
            }
            if (counter % 2 == 1) {
                return someType;
            }
        }
        return null;
    }

    public SomeType findEvenOccurringValue() {
        for (SomeType someType : array) {
            counter = 0;
            for (SomeType type : array) {
                if (someType.equals(type)) {
                    counter++;
                }
            }
            if (counter % 2 == 0) {
                return someType;
            }
        }
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        counter = 0;
        for (SomeType someType : array) {
            if (someType.equals(valueToEvaluate)) {
                counter++;
            }
        }
        return counter;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return Arrays.stream(array).filter(predicate::apply).collect(toList()).toArray(Arrays.copyOf(array, 0));
    }
}
