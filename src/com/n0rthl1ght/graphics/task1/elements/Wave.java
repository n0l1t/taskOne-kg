package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;

public class Wave {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    private Color col = new Color(83,83,83);

    public Wave(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void draw(Graphics2D g, int w, int h){
        g.setPaint(col);
        g.drawLine(startX,startY,endX,endY);
    }
}
