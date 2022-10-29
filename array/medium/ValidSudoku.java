package array.medium;

import java.util.HashSet;

public class ValidSudoku {
  public boolean isValidSudoku(char[][] board) {
    HashSet<String> seen = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char current_val = board[i][j];
        if (current_val != '.') {
          if (!seen.add(current_val + " in row " + i) || !seen.add(current_val + " in column " + j)
              || !seen.add(current_val + " in block " + i / 3 + "-" + j / 3)) {
            return false;
          }
        }
      }
    }
    return true;
  }
}
