public class ColumnChecker {
    /**
     * Determine if every column in the given grid is valid, i.e.,
     * has distinct numbers from 1 to 9.
     * If there is an invalid column, output the first such column number.
     * @param grid the Sudoku grid, assumed to be of dimension 9x9, and all numbers
     *             are in range [1, 9]
     * @return {@code true} if every column in {@code grid} is valid;
     *          {@code false} otherwise
     */
    public static boolean checkColumns(int[][] grid) {
        int[] arr = new int[9];
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++)
                arr[i] = grid[i][j];
            if (!hasOneThroughNine(arr)) {
                System.out.println("Column " + (j+1) + " is invalid.");
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