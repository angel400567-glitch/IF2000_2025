/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author dylan
 */
public class Piece {
     private char color; // 'R' for Red, 'B' for Black

    public Piece(char color) {
        this.color = color;
    }

    public char getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.valueOf(color);
    }
}

