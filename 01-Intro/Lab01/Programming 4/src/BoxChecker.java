public class BoxChecker {
    /**
     * Determine if every 3x3 box in the given grid is valid, i.e.,
     * has distinct numbers from 1 to 9.
     * If there is an invalid box, output the first such box number.
     * @param grid the Sudoku grid, assumed to be of dimension 9x9, and all numbers
     *             are in range [1, 9]
     * @return {@code true} if every box in {@code grid} is valid;
     *          {@code false} otherwise
     */
    public static boolean checkBoxes(int[][] grid) {
        int[] arr = new int[9];
        for (int b = 0; b < 9; b++) {
            for (int k = 0; k < 9; k++)
                arr[k] = grid[b/3*3 + k/3][b%3*3 + k%3];
            if (!hasOneThroughNine(arr)) {
                System.out.println("Box " + (b+1) + " is invalid.");
                return false;
            }
        }
        return true;
    }

    /**
     * Determine if the given array has distinct numbers from 1 to 9.
     * @param arr the input array, assumed to have length 9, and all numbers
     *            in the array are in range [1, 9]
     * @return {@code true} if {@code arr} has distinct numbers from 1 to 9;
     *          {@code false} otherwise
     */
    public static boolean hasOneThroughNine(int[] arr) {
        boolean[] present = new boolean[9]; // initially false on every entry
        // loop through each entry in the given array
        for (int x : arr) {
            if (present[x-1] == true)
                return false;
            present[x-1] = true;
        }
        return true;
    }
}