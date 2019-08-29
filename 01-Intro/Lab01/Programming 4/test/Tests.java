import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Tests {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  private static String printGrid(int[][] grid) {
    StringBuilder sb = new StringBuilder();
    for (int[] Box : grid) {
      boolean first = true;
      for (int cell : Box) {
        if (!first) sb.append(" ");
        sb.append(cell);
        first = false;
      }
      sb.append('\n');
    }
    return sb.toString();
  }

  private static void handleError(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    Assert.fail("Exception caught: " + sw.toString());
  }

  private static final int[][] grid1 = {
          {1, 7, 2, 9, 8, 3, 5, 6, 4},
          {4, 6, 8, 5, 7, 2, 9, 8, 3},
          {5, 3, 9, 6, 1, 4, 8, 7, 2},
          {2, 1, 3, 8, 5, 6, 4, 9, 7},
          {8, 4, 6, 3, 9, 7, 2, 5, 1},
          {9, 5, 7, 2, 4, 1, 3, 1, 6},
          {6, 8, 4, 7, 2, 5, 1, 3, 9},
          {3, 9, 1, 4, 6, 8, 7, 2, 5},
          {7, 2, 5, 1, 3, 9, 6, 4, 8},

  };

  private static final int[][] grid2 = {
          {1, 7, 2, 9, 8, 3, 5, 6, 4},
          {4, 6, 8, 5, 7, 2, 9, 1, 3},
          {5, 3, 9, 6, 1, 4, 8, 7, 2},
          {2, 1, 3, 8, 5, 6, 4, 9, 7},
          {8, 4, 6, 3, 9, 7, 2, 5, 1},
          {9, 5, 7, 2, 4, 1, 3, 8, 6},
          {6, 8, 4, 7, 2, 5, 1, 3, 9},
          {3, 9, 1, 4, 6, 8, 5, 2, 7},
          {7, 2, 5, 1, 3, 9, 6, 4, 8},
  };

  private static final int[][] grid3 = {
          {1, 7, 2, 9, 8, 3, 5, 6, 4},
          {4, 6, 8, 5, 7, 2, 9, 1, 3},
          {5, 3, 9, 6, 1, 4, 8, 7, 2},
          {7, 2, 5, 1, 3, 9, 6, 4, 8},
          {2, 1, 3, 8, 5, 6, 4, 9, 7},
          {8, 4, 6, 3, 9, 7, 2, 5, 1},
          {9, 5, 7, 2, 4, 1, 3, 8, 6},
          {6, 8, 4, 7, 2, 5, 1, 3, 9},
          {3, 9, 1, 4, 6, 8, 7, 2, 5},
  };

  private static final int[][] grid4 = {
          {1, 7, 2, 9, 8, 3, 5, 6, 4},
          {4, 6, 8, 5, 7, 2, 9, 1, 3},
          {5, 3, 9, 6, 1, 4, 8, 7, 2},
          {2, 1, 3, 8, 5, 6, 4, 9, 7},
          {8, 4, 6, 3, 9, 7, 2, 5, 1},
          {9, 5, 7, 2, 4, 1, 3, 8, 6},
          {6, 8, 4, 7, 2, 5, 1, 3, 9},
          {3, 9, 1, 4, 6, 8, 7, 2, 5},
          {7, 2, 5, 1, 3, 9, 6, 4, 8},
  };

  @Test
  public void testGrid1() {
    try {
      Assert.assertFalse("checkBox() should return false for this grid:\n" + printGrid(grid1), BoxChecker.checkBoxes(grid1));
      Assert.assertEquals("Box 3 is invalid." + System.lineSeparator(), outContent.toString());
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testGrid2() {
    try {
      Assert.assertTrue("checkBox() should return true for this grid:\n" + printGrid(grid2), BoxChecker.checkBoxes(grid2));
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testGrid3() {
    try {
      Assert.assertFalse("checkBox() should return false for this grid:\n" + printGrid(grid3), BoxChecker.checkBoxes(grid3));
      Assert.assertEquals("Box 4 is invalid." + System.lineSeparator(), outContent.toString());
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testGrid4() {
    try {
      Assert.assertTrue("checkBox() should return true for this grid:\n" + printGrid(grid4), BoxChecker.checkBoxes(grid4));
    } catch (Exception e) {
      handleError(e);
    }
  }
}