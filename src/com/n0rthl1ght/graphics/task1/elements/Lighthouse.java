package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;

public class Lighthouse {
    private final int[] shiftX;
    private final int[] shiftY;
    private final Color LHElementColor;
    private final Color OutlineColor = new Color(83,83,83);

    public Lighthouse(int[] shiftX, int[] shiftY, Color LHElementColor) {
        this.shiftX = shiftX;
        this.shiftY = shiftY;
        this.LHElementColor = LHElementColor;
    }

    public void draw(Graphics2D g){
        g.setPaint(LHElementColor);
        g.fillPolygon(shiftX, shiftY,shiftY.length);
        g.setPaint(OutlineColor);
        g.setStroke(new BasicStroke(2));
        g.drawPolyline(shiftX,shiftY,shiftY.length);
        g.drawLine(shiftX[0],shiftY[0],shiftX[shiftX.length-1],shiftY[shiftY.length-1]);
    }
}
