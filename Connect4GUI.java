
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Connect4 {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final char EMPTY = 'E';

    private char[][] board = new char[ROWS][COLS];
    private char currentPlayerPiece = 'X'; 

    private JFrame frame = new JFrame("Connect 4");
    private JPanel boardPanel = new JPanel(new GridLayout(ROWS, COLS));
    private JButton[] buttons = new JButton[ROWS * COLS];

    public Connect4() {
        initBoard();
        initGUI();
    }

    private void initBoard() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    private void initGUI() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int index = row * COLS + col;
                buttons[index] = new JButton("");
                buttons[index].addActionListener(new ButtonListener(col));
                boardPanel.add(buttons[index]);
            }
        }

        frame.add(boardPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        switchPlayer(); 
    }

    private class ButtonListener implements ActionListener {
        private int col;

        public ButtonListener(int col) {
            this.col = col;
        }
        public void actionPerformed(ActionEvent e) {
            int row = dropPiece(col);

            if (row != -1) {
                JButton button = (JButton) e.getSource();
                button.setText(String.valueOf(currentPlayerPiece));
                button.setEnabled(false);
                if(currentPlayerPiece=='X') {
                  button.setBackground(Color.BLACK);
                }else {
                  button.setBackground(Color.RED);
                }


                if (checkWin(row, col, currentPlayerPiece)) {
                    frame.setTitle("Player " + currentPlayerPiece + " has won!");
                    disableAllButtons();
                } else if (checkDraw()) {
                    frame.setTitle("The game is a draw.");
                    disableAllButtons();
                } else {
                    switchPlayer();
                }
            }
        }
    }

    private int dropPiece(int col) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (board[row][col] == EMPTY) {
                board[row][col] = currentPlayerPiece;
                return row;
            }
        }
        return -1; 
    }

    private boolean checkWin(int row, int col, char playerPiece) {
        int count;
        count = 0;
        for (int c = 0; c < COLS; c++) {
            if (board[row][c] == playerPiece) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        count = 0;
        for (int r = 0; r < ROWS; r++) {
            if (board[r][col] == playerPiece) {
                count++;
                if (count >= 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }


        count = 0;
        for (int d = -3; d <= 3; d++) {
            int r = row + d;
            int c = col + d;
            if (r >= 0 && r < ROWS && c >= 0 && c < COLS) {
                if (board[r][c] == playerPiece) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        count = 0;
        for (int d = -3; d <= 3; d++) {
            int r = row - d;
            int c = col + d;
            if (r >= 0 && r < ROWS && c >= 0 && c < COLS) {
                if (board[r][c] == playerPiece) {
                    count++;
                    if (count >= 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            } else {
                count = 0;
            }
        }

        return false;
    }



    private boolean checkDraw() {
        for (int col = 0; col < COLS; col++) {
            if (board[0][col] == EMPTY) {
                return false; 
            }
        }
        return true; 
    }

    private void switchPlayer() {
        currentPlayerPiece = (currentPlayerPiece == 'X') ? 'O' : 'X';
        frame.setTitle("Player " + currentPlayerPiece + " Go");
    }

    private void disableAllButtons() {
        for (JButton button : buttons) {
            button.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        new Connect4();
    }
}
