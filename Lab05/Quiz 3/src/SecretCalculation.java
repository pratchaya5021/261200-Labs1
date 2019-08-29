// No code to write or modify for this task.  See task description on the right.

public class SecretCalculation {
    private static int calculateSecret(int n)
    {
        /* Assume that n is greater than or equal to 1 */
        if(n == 1)
            return 0;
        return 1 + calculateSecret(n/2);
    }

    public static void main(String[] args) {
        System.out.println(calculateSecret(1));
        System.out.println(calculateSecret(2));
        System.out.println(calculateSecret(14));
        System.out.println(calculateSecret(112));
        System.out.println(calculateSecret(48));
    }
}