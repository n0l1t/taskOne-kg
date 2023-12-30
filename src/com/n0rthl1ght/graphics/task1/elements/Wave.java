package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;

public class Wave {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private Color color;

    public Wave(int startX, int startY, int endX, int endY, Color color) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color=color;
    }

    public void draw(Graphics2D g, int w, int h){
        g.setPaint(color);
        g.drawLine(startX,startY,endX,endY);
    }
}
