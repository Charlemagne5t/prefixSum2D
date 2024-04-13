import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PrefixSumTest {
    @Test
    public void test1() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] expected = {
                {1, 3, 6},
                {5, 12, 21},
                {12, 27, 45}
        };
        int[][] actual = new PrefixSum2D(grid).prefixSum;
        for (int i = 0; i < actual.length; i++) {
            System.out.println(Arrays.toString(actual[i]));
        }
        boolean result = Arrays.deepEquals(expected, actual);
        Assert.assertTrue(result);

    }
    @Test
    public void test2() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        PrefixSum2D ps = new PrefixSum2D(grid);
        int expected = 28;
        int actual = ps.sumQuery(1,1,2,2);

        Assert.assertEquals(expected,actual);


    }
}
