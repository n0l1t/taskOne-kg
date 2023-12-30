package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;
public class Sea {
    private int startX;
    private int startY;

    public Sea(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public void draw(Graphics2D g, int w, int h){
        Color col = new Color(103,183,212);
        g.setPaint(col);
        g.fillRect(startX,startY,w,h);

        Color c1 = new Color(83,83,83);
        g.setPaint(c1);
        g.setStroke(new BasicStroke(2));
        g.drawLine(startX,startY,800,startY);
    }
}