package com.bug.tankwar;

import javax.swing.*;
import java.awt.*;

/**
 * ClassName: GameClient.java
 * Description: TODO
 *
 * @author Vincent Liu
 * @version 1.0.0
 * @createTime 2023.04.30---16:04:00
 */
public class GameClient extends JComponent {

    private GameClient() {
        this.setPreferredSize(new Dimension(800, 600));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(new ImageIcon("assets/images/tankD.gif").getImage(),
                400, 100, null);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("A Boring Tank War!");
        frame.setIconImage(new ImageIcon("assets/images/icon.png").getImage());
        GameClient client = new GameClient();
        frame.add(client);
        client.repaint();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
