class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set[] row = new Set[9];
        Set[] column = new Set[9];
        Set[] subBox = new Set[9];

        int subBoxLocation;
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (column[j] == null) {
                    column[j] = new HashSet<>();
                }
                subBoxLocation = getSubBoxLocation(i,j);
                if (subBox[subBoxLocation] == null) {
                    subBox[subBoxLocation] = new HashSet<>();
                }
                if (row[i].contains(board[i][j]) 
                    || column[j].contains(board[i][j])
                    || subBox[subBoxLocation].contains(board[i][j])) {
                    return false;
                }
                row[i].add(board[i][j]);
                column[j].add(board[i][j]);
                subBox[subBoxLocation].add(board[i][j]);
            }
        }
        return true;
    }

    private int getSubBoxLocation(int i, int j) {
        int row = (i) / 3; // SubBox location
        int column = (j) / 3; // SubBox location

        return row * 3 + column;
    }
}
