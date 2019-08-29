public class OneThruNine {
    /**
     * Determine if the given array has distinct numbers from 1 to 9.
     * @param arr the input array, assumed to have length 9, and all numbers
     *            in the array are in range [1, 9]
     * @return {@code true} if {@code arr} has distinct numbers from 1 to 9;
     *          {@code false} otherwise
     */
    public static boolean hasOneThroughNine(int[] arr) {
        if (arr.length != 9) {
            // array not of length 9; return false by default
            return false;
        }

        // create a boolean array of length 9, initially false on every entry
        boolean[] present = new boolean[9];
        // loop through each entry in the given array
        for (int x : arr) {
            if (present[x-1] == true)
                return false;
            present[x-1] = true;
        }
        return true;
    }
}