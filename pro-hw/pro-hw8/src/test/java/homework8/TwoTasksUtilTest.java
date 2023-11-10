package homework8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoTasksUtilTest {
    final static String noe = "Null or Empty List";

    public static Stream<Arguments> getPositiveSwap() {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);

        List<String> strArr = new ArrayList<>();
        strArr.add("ABC");
        strArr.add("DEF");
        strArr.add("GHI");

        return Stream.of(
                Arguments.of(intArr, 1, 2, List.of(1, 3, 2)),
                Arguments.of(strArr, 0, 1, List.of(
                        "DEF", "ABC", "GHI"))
        );
    }

    @ParameterizedTest
    @MethodSource("getPositiveSwap")
    <T> void swapTwo(List<T> arr, int p1, int p2, List<T> expect) {
        assertEquals(expect, TwoTasksUtil.swapTwo(arr, p1, p2));
    }

    public static Stream<Arguments> getSwapIllegalArg() {
        final String ior = "Index out of range";
        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);
        intArr.add(3);

        List<Double> tst = new ArrayList<>();

        return Stream.of(
                Arguments.of(null, 1, 2, noe),
                Arguments.of(tst, 0, 1, noe),
                Arguments.of(intArr, -1, 3, ior)
        );
    }

    @ParameterizedTest
    @MethodSource("getSwapIllegalArg")
    <T> void swapTwoIllegalArg(List<T> arr, int p1, int p2, String expect) {
        Exception e = assertThrows(IllegalArgumentException.class,
                ()-> TwoTasksUtil.swapTwo(arr, p1, p2) );

        assertEquals(expect, e.getMessage());
    }

}