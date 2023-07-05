import org.example.Excecutor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ExcecutorTests {
    private Excecutor excecutor;
    private static ArrayList<Integer> testArray;

    @BeforeAll
    public static void setUp() {
//        testArray = new ArrayList<>(List.of(0,1,2));
//        testArray = new ArrayList<>(List.of(0,1,2,3));
        testArray = new ArrayList<>(List.of(3, 3, 3, 3));
    }

    @Test
    public void noMultiplesOfThreeTest() {
        this.excecutor = new Excecutor();
        ArrayList<Integer> arrResult = this.excecutor.getMultiplesOfThree(ExcecutorTests.testArray);
        int[] actual = new int[arrResult.size()];
        for (int i = 0; i < arrResult.size(); i++) {
            actual[i] = arrResult.get(i);
        }
        int[] expected = new int[]{0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void withOneMultiplesOfThreeTest() {
        this.excecutor = new Excecutor();
        ArrayList<Integer> arrResult = this.excecutor.getMultiplesOfThree(ExcecutorTests.testArray);
        int[] actual = new int[arrResult.size()];
        for (int i = 0; i < arrResult.size(); i++) {
            actual[i] = arrResult.get(i);
        }
        int[] expected = new int[]{0, 3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void withAllMultiplesOfThreeTest() {
        this.excecutor = new Excecutor();
        ArrayList<Integer> arrResult = this.excecutor.getMultiplesOfThree(ExcecutorTests.testArray);
        int[] actual = new int[arrResult.size()];
        for (int i = 0; i < arrResult.size(); i++) {
            actual[i] = arrResult.get(i);
        }
        int[] expected = new int[]{3, 3, 3, 3};
        Assertions.assertArrayEquals(expected, actual);
    }
}
