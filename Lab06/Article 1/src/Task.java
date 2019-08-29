public class Task {
  public static boolean isDivisible(int dividend, int divisor){
    if(divisor == 0) {
      System.out.println("If-condition warning: / by zero");
      return false;
    } else
      return true;
  }

  public static void divide(int dividend, int divisor) {
    try {
      System.out.println(dividend/divisor);
      System.out.println("This line will be printed only if the code can execute.");
    } catch (Exception e) {
      e.printStackTrace(); // Display the stack trace of the instance
      System.out.println("Try-catch warning: / by zero"); // Display your own error message
    } finally {
      System.out.println("This is always printed.");
    }
  }
}