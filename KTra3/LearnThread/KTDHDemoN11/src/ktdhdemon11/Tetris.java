/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktdhdemon11;

/**
 *
 * @author DELL
 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Tetris extends JFrame {

    private JLabel statusbar;

    public Tetris() {
        initUI();
    }

    private void initUI() {
        statusbar = new JLabel("Your score: 0");
        this.add(statusbar, BorderLayout.NORTH);
        
        Board board = new Board(this);
        this.add(board);
        board.start();

        setSize(500, 1000);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public JLabel getStatusBar() {
        return statusbar;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Tetris game = new Tetris();
                game.setVisible(true);
            }
        });
    }
}

