// No code to write or modify for this task.  See task description on the right.
import java.util.Scanner;

public class Task {
    private static int divideByZero(int dividend) {
        return dividend/0;
    }

    private static double divideByZero(double dividend){
        return dividend/0.0;
    }

    private static float divideByZero(float dividend){
        return dividend/0.0f;
    }

    private static int lengthOfNullString() {
        String nullString = null;
        return nullString.length();
    }

    private static double accessIndexOutOfBounds(int index){
        double[] array = new double[index];
        return array[index];
    }

    public static void main(String[] args){
        // Try comment/uncomment the following statements.
        System.out.println(divideByZero(1)); // 1/0
        System.out.println(divideByZero(0)); // 0/0
        System.out.println(divideByZero(-1)); // -1/0
        System.out.println(divideByZero(1.0f)); // 1.0f/0.0f
        System.out.println(divideByZero(0.0f)); // 0.0f/0.0f
        System.out.println(divideByZero(-1.0f)); // -1.0f/0.0f
        System.out.println(divideByZero(1.0)); // 1.0/0.0
        System.out.println(divideByZero(0.0)); // 0.0/0.0
        System.out.println(divideByZero(-1.0)); // -1.0/0.0
        System.out.println(lengthOfNullString());
        System.out.println(accessIndexOutOfBounds(10));
        System.out.println(10.0/0.0f);
    }
}