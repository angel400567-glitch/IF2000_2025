/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Game {
    private Board board;
    private char turn; // 'R' = red, 'B' = black

    public Game() {
        board = new Board();
        turn = 'R'; // Red starts first
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to the Checkers Game (basic version)");
        System.out.println("Type -1 in the origin row to quit.\n");

        while (true) {
            board.displayBoard();
            System.out.println("Turn: " + (turn == 'R' ? "Red (R)" : "Black (B)"));

            System.out.print("Origin row: ");
            int fromRow = sc.nextInt();
            if (fromRow == -1) break;

            System.out.print("Origin column: ");
            int fromCol = sc.nextInt();
            System.out.print("Destination row: ");
            int toRow = sc.nextInt();
            System.out.print("Destination column: ");
            int toCol = sc.nextInt();

            boolean moved = board.movePiece(fromRow, fromCol, toRow, toCol, turn);

            if (moved) {
                switchTurn();
            }

            System.out.println();
        }

        System.out.println(" Game over. Thanks for playing!");
        sc.close();
    }

    private void switchTurn() {
        turn = (turn == 'R') ? 'B' : 'R';
    }
}

