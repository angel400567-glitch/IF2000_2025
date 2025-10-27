/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */
public class Board {
    
   
  
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initializeBoard();
    }

    private void initializeBoard() {
        // Red pieces (top)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    board[i][j] = new Piece('R'); // rojas arriba
                }
            }
        }

        // Black pieces (bottom) with some empty diagonals for valid moves
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 != 0) {
                    // Make (5,2) and (5,6) empty for valid black moves
                    if (i == 5 && (j == 2 || j == 6)) {
                        board[i][j] = null; // casilla vacía
                    } else {
                        board[i][j] = new Piece('B'); // negras abajo
                    }
                }
            }
        }
    }

    public void displayBoard() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null)
                    System.out.print("- ");
                else
                    System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean movePiece(int fromRow, int fromCol, int toRow, int toCol, char turn) {
        // Basic validations
        if (!isInsideBounds(fromRow, fromCol) || !isInsideBounds(toRow, toCol)) {
            System.out.println(" Move is outside the board.");
            return false;
        }

        Piece piece = board[fromRow][fromCol];
        if (piece == null) {
            System.out.println(" There is no piece at the origin position.");
            return false;
        }

        if (board[toRow][toCol] != null) {
            System.out.println(" The destination square is occupied.");
            return false;
        }

        if (piece.getColor() != turn) {
            System.out.println(" You cannot move a piece of the opposite color.");
            return false;
        }

        // Diagonal move of one square
        int rowDiff = Math.abs(toRow - fromRow);
        int colDiff = Math.abs(toCol - fromCol);

        if (rowDiff != 1 || colDiff != 1) {
            System.out.println(" The move must be diagonal and only one square.");
            return false;
        }

        // Validate direction according to color
        // Red moves upward
        if (turn == 'R' && toRow <= fromRow) {
            System.out.println("Red pieces can only move downward.");
            return false;
        }

        // Black moves downward
        if (turn == 'B' && toRow >= fromRow) {
            System.out.println("Black pieces can only move upward.");
            return false;
        }

        // Valid move → update the board
        board[toRow][toCol] = piece;
        board[fromRow][fromCol] = null;
        return true;
    }

    private boolean isInsideBounds(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}

   
    
    

