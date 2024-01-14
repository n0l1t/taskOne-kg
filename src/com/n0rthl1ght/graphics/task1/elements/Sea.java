package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;
public class Sea {
    private final int startX;
    private final int startY;
    private final Color SeaColor = new Color(180,220,220);
    private final Color OutlineColor = new Color(83,83,83);

    public Sea(int startX, int startY) {
        this.startX = startX;
        this.startY = startY;
    }

    public void draw(Graphics2D g, int w, int h){
        g.setPaint(SeaColor);
        g.fillRect(startX,startY,w,h);

        g.setPaint(OutlineColor);
        g.setStroke(new BasicStroke(2));
        g.drawLine(startX,startY,800,startY);
    }
}