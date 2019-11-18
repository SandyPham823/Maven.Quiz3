package rocks.zipcode.io.quiz3.arrays;


import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] getThisRow = {board[value][0], board[value][1], board[value][2]};
        return getThisRow;
    }

    public String[] getColumn(Integer value) {
        String[] getThisColumn = {board[0][value], board[1][value], board[2][value]};
        return getThisColumn;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        for (int i = 0; i <= 2; i++) {
            if (((board[rowIndex][0] == "O") && (board[rowIndex][1] == "O") && (board[rowIndex][2] == "O") ||
                    (board[rowIndex][0] == "X") && (board[rowIndex][1] == "X") && (board[rowIndex][2] == "X"))) {
                return true;
            }
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        for (int i = 0; i <= 2; i++) {
            if (((board[0][columnIndex] == "O") && (board[1][columnIndex] == "O") && (board[2][columnIndex] == "O") ||
                    (board[0][columnIndex] == "X") && (board[1][columnIndex] == "X") && (board[2][columnIndex] == "X"))) {
                return true;
            }
        }
        return false;
    }

    public Boolean isDiagonalHomogeneous() {
        if (((board[0][0] == "O") && (board[1][1] == "O") && (board[2][2] == "O") &&
                (board[2][0] == "O") && (board[1][1] == "O") && (board[0][2] == "O")) ||
                ((board[0][0] == "X") && (board[1][1] == "X") && (board[2][2] == "X") &&
                        (board[2][0] == "X") && (board[1][1] == "X") && (board[0][2] == "X"))) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isColumnHomogeneous(0) || isRowHomogenous(0) || isDiagonalHomogeneous()) {
            return (board[0][0]);

        } else if
        (isColumnHomogeneous(1) || isRowHomogenous(1) || isDiagonalHomogeneous())
            return (board[0][1]);

        return "X";
    }// TBH this is wrong^


    public String[][] getBoard() {
        return board;
    }

}
