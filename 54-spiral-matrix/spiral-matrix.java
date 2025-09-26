class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse top row
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // Traverse right column
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // Traverse bottom row (if not the same row)
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) break;
                result.add(matrix[endRow][j]);
            }

            // Traverse left column (if not the same column)
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) break;
                result.add(matrix[i][startCol]);
            }

            // Move inward
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return result;
    }
}