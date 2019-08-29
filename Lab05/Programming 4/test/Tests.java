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
      Assert.assertTrue("Test 1: PASSED",Base3Converter.toBase3String(11).equals("102"));
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution2() {
    try {
      Assert.assertTrue("Test 1: PASSED",Base3Converter.toBase3String(20).equals("202"));
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution3() {
    try {
      Assert.assertTrue("Test 1: PASSED",Base3Converter.toBase3String(1).equals("1"));
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution4() {
    try {
      Assert.assertTrue("Test 1: PASSED",Base3Converter.toBase3String(2).equals("2"));
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution5() {
    try {
      Assert.assertTrue("Test 1: PASSED",Base3Converter.toBase3String(3).equals("10"));
    } catch (Exception e) {
      handleError(e);
    }
  }
}