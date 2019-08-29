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

  private double calculateAverage(ArrayList<String> arrayList){
    double tmp = 0.0;
    for(String str : arrayList){
      switch (str){
        case "A": tmp += 4.0; break;
        case "B+": tmp += 3.5; break;
        case "B": tmp += 3.0; break;
        case "C+": tmp += 2.5; break;
        case "C": tmp+=2.0; break;
        case "D+": tmp+=1.5; break;
        case "D": tmp+=1.0; break;
        case "F": default: tmp+=0.0; break;
      }
    }
    return tmp/arrayList.size();
  }

  @Test
  public void testSolution1() {
    AverageGradeCalculator2.students.clear();
    AverageGradeCalculator2.grades.clear();
    AverageGradeCalculator2.students.add("Lisa");
    AverageGradeCalculator2.students.add("Rose");
    AverageGradeCalculator2.students.add("Jennie");
    AverageGradeCalculator2.students.add("Jisoo");
    AverageGradeCalculator2.grades.add("A");
    AverageGradeCalculator2.grades.add("C+");
    AverageGradeCalculator2.grades.add("B");
    AverageGradeCalculator2.grades.add("D+");
    try {
      Assert.assertTrue("Test 1: PASSED",calculateAverage(AverageGradeCalculator2.grades) == AverageGradeCalculator2.calculateAverageGrade());
    } catch (Exception e) {
      handleError(e);
    }
  }

  @Test
  public void testSolution2() {
    AverageGradeCalculator2.students.clear();
    AverageGradeCalculator2.grades.clear();
    AverageGradeCalculator2.students.add("Red");
    AverageGradeCalculator2.students.add("Blue");
    AverageGradeCalculator2.students.add("Green");
    AverageGradeCalculator2.students.add("Pink");
    AverageGradeCalculator2.students.add("Yellow");
    AverageGradeCalculator2.grades.add("B+");
    AverageGradeCalculator2.grades.add("C+");
    AverageGradeCalculator2.grades.add("D+");
    AverageGradeCalculator2.grades.add("F");
    AverageGradeCalculator2.grades.add("F");
    try {
      Assert.assertTrue("Test 2: PASSED",calculateAverage(AverageGradeCalculator2.grades) == AverageGradeCalculator2.calculateAverageGrade());
    } catch (Exception e) {
      handleError(e);
    }
  }
}