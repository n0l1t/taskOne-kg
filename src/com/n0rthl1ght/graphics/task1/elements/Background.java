package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;
public class Background {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Background(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public void draw(Graphics2D g, int w, int h){
        g.setPaint(new LinearGradientPaint(w / 2, 0, w / 2 + 1, h,
        new float[]{0.1f,0.9f},
        new Color[] {new Color(80,184,231), new Color(237,247,252)}));
        g.fillRect(0,0,w,h);
    }
}
