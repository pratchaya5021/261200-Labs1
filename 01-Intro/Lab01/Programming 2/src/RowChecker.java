public class RowChecker {
    /**
     * Determine if every row in the given grid is valid, i.e.,
     * has distinct numbers from 1 to 9.
     * If there is an invalid row, output the first such row number.
     * @param grid the Sudoku grid, assumed to be of dimension 9x9, and all numbers
     *             are in range [1, 9]
     * @return {@code true} if every row in {@code grid} is valid;
     *          {@code false} otherwise
     */
    public static boolean checkRows(int[][] grid) {
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++)
                arr[j] = grid[i][j];
            if (!hasOneThroughNine(arr)) {
                System.out.println("Row " + (i+1) + " is invalid.");
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