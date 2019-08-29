public class SudokuVerifier {
    /**
     * Determine if the given Sudoku grid is valid.
     * The verification should report the first invalid row, if any;
     * otherwise, the first invalid column, if any;
     * otherwise, the first invalid box, if any;
     * otherwise, report that the grid is valid.
     * @param grid the Sudoku grid, assumed to be of dimension 9x9, and all numbers
     *             are in range [1, 9]
     * @return {@code true} if {@code grid} is valid; {@code false} otherwise
     */
    public static boolean isValidGrid(int[][] grid) {
        boolean valid = (checkRows(grid)) && (checkColumns(grid)) && (checkBoxes(grid));
        if (valid)
            System.out.println("This grid is valid.");
        else
            System.out.println("This grid is invalid.");
        return valid;
    }

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