package com.n0rthl1ght.graphics.task1;

import com.n0rthl1ght.graphics.task1.elements.Background;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private int partWidth;
    private int partHeight;

    private Background bg;
    public DrawPanel() {
        bg = new Background(getWidth(), 0, getWidth(), getHeight());
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        partHeight = getHeight();
        partWidth = getWidth();

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        bg.draw(g,partWidth,partHeight);
    }
}
