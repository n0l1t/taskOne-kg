package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;

public class Wave {
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    private Color WaveColor = new Color(83,83,83);

    public Wave(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void draw(Graphics2D g){
        g.setPaint(WaveColor);
        g.drawLine(startX,startY,endX,endY);
    }
}
