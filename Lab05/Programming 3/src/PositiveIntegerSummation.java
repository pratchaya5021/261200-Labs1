// No code to write or modify for this task.  See task description on the right.

public class PositiveIntegerSummation {
    public static int calculate(int n)
    {
        if(n == 0)
            return 0;
        return calculate(n-1) + n;
    }
}