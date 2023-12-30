package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;

public class Mountain {
    private int[] shiftX;
    private int[] shiftY;
    private Color colors;

    public Mountain(int[] shiftX, int[] shiftY, Color colors) {
        this.shiftX = shiftX;
        this.shiftY = shiftY;
        this.colors = colors;
    }

    public void draw(Graphics2D g, int w, int h){

        g.setPaint(colors);
        g.fillPolygon(shiftX, shiftY,shiftY.length);
        Color hui = new Color(83,83,83);
        g.setPaint(hui);
        g.setStroke(new BasicStroke(2));
        g.drawPolyline(shiftX,shiftY,shiftY.length);
        g.drawLine(shiftX[0],shiftY[0],shiftX[shiftX.length-1],shiftY[shiftY.length-1]);
    }
    private static int min(int[] arr){
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < result) result = arr[i];
        }
        return result;
    }
}
