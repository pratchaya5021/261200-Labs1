import org.junit.Assert;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Tests {
  private static void handleError(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    Assert.fail("Exception caught: " + sw.toString());
  }
  @Test
  public void testSolution1() {
    try {
      Assert.assertTrue("Test 1: PASSED",PositiveIntegerSummation.calculate(0) == 0);
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution2() {
    try {
      Assert.assertTrue("Test 1: PASSED",PositiveIntegerSummation.calculate(1) == 1);
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution3() {
    try {
      Assert.assertTrue("Test 1: PASSED",PositiveIntegerSummation.calculate(3) == 6);
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution4() {
    try {
      Assert.assertTrue("Test 1: PASSED",PositiveIntegerSummation.calculate(50) == 1275);
    } catch (Exception e) {
      handleError(e);
    }
  }
}