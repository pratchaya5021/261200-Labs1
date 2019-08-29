import org.junit.Assert;
import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

public class Tests {
  private static void handleError(Exception e) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    e.printStackTrace(pw);
    Assert.fail("Exception caught: " + sw.toString());
  }

  private double calculateAverage(ArrayList<Double> arrayList){
    double tmp = 0;
    for(double a : arrayList){
      tmp += a;
    }
    return tmp/arrayList.size();
  }

  @Test
  public void testSolution1() {
    AverageGradeCalculator1.students.clear();
    AverageGradeCalculator1.grades.clear();
    AverageGradeCalculator1.students.add("Peter");
    AverageGradeCalculator1.students.add("Paul");
    AverageGradeCalculator1.students.add("Mary");
    AverageGradeCalculator1.grades.add(4.0);
    AverageGradeCalculator1.grades.add(2.0);
    AverageGradeCalculator1.grades.add(3.0);
    try {
      Assert.assertTrue(calculateAverage(AverageGradeCalculator1.grades) == AverageGradeCalculator1.calculateAverageGrade());
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution2() {
    AverageGradeCalculator1.students.clear();
    AverageGradeCalculator1.grades.clear();
    AverageGradeCalculator1.students.add("John");
    AverageGradeCalculator1.grades.add(4.0);
    try {
      Assert.assertTrue(calculateAverage(AverageGradeCalculator1.grades) == AverageGradeCalculator1.calculateAverageGrade());
    } catch (Exception e) {
      handleError(e);
    }
  }
}