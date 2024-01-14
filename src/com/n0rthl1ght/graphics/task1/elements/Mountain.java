package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;

public class Mountain {
    private final int[] shiftX;
    private final int[] shiftY;
    private final Color MountainColor = new Color(141, 142, 134);
    private final Color OutlineColor = new Color(83,83,83);

    public Mountain(int[] shiftX, int[] shiftY) {
        this.shiftX = shiftX;
        this.shiftY = shiftY;
    }

    public void draw(Graphics2D g){
        g.setPaint(MountainColor);
        g.fillPolygon(shiftX, shiftY,shiftY.length);
        g.setPaint(OutlineColor);
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
