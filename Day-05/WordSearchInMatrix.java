public class WordSearchInMatrix {
    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        System.out.println("Word search board result for '" + word + "': " + exist(board, word));
    }

    private static boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (search(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean search(char[][] board, String word, int index, int row, int col) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = search(board, word, index + 1, row + 1, col)
                || search(board, word, index + 1, row - 1, col)
                || search(board, word, index + 1, row, col + 1)
                || search(board, word, index + 1, row, col - 1);

        board[row][col] = temp;
        return found;
    }
}
