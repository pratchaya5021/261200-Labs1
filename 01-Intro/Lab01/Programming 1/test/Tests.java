import org.junit.Assert;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

public class Tests {
    private Random r = new Random(2547);

    private static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        boolean first = true;
        for (int x : arr) {
            if (!first) sb.append(", ");
            sb.append(x);
            first = false;
        }
        sb.append("]");
        return sb.toString();
    }

    private static void handleError(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        Assert.fail("Exception caught: " + sw.toString());
    }

    @Test
    public void testSolution1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            Assert.assertTrue("Array " + printArray(arr) + " has 1-9.", OneThruNine.hasOneThroughNine(arr));
        } catch (Exception e) {
            handleError(e);
        }
    }

    @Test
    public void testSolution2() {
        int[] arr = {1, 3, 5, 7, 9, 7, 5, 3, 1};
        try {
            Assert.assertFalse("Array " + printArray(arr) + " doesn't have 1-9.", OneThruNine.hasOneThroughNine(arr));
        } catch (Exception e) {
            handleError(e);
        }
    }

    @Test
    public void testSolution3() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 9; j++) {
                int pos = r.nextInt(9 - j);
                int tmp = arr[j];
                arr[j] = arr[pos];
                arr[pos] = tmp;
            }
            try {
                Assert.assertTrue("Array " + printArray(arr) + " has 1-9.", OneThruNine.hasOneThroughNine(arr));
            } catch (Exception e) {
                handleError(e);
            }
        }
    }

    @Test
    public void testSolution4() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 9; j++) {
                int pos = r.nextInt(9 - j);
                int tmp = arr[j];
                arr[j] = arr[pos];
                arr[pos] = tmp;
            }
            int p1 = r.nextInt(9);
            int p2 = r.nextInt(9);
            int x = arr[p1];
            arr[p1] = arr[p2];
            try {
                if (p1 == p2)
                    Assert.assertTrue("Array " + printArray(arr) + " has 1-9.", OneThruNine.hasOneThroughNine(arr));
                else
                    Assert.assertFalse("Array " + printArray(arr) + " has 1-9.", OneThruNine.hasOneThroughNine(arr));
            } catch (Exception e) {
                handleError(e);
            }
            arr[p1] = x;
        }
    }
}