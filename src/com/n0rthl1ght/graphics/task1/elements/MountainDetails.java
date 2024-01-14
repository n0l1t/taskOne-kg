package com.n0rthl1ght.graphics.task1.elements;
import java.awt.*;
public class MountainDetails {
    private final int[] shiftX;
    private final int[] shiftY;
    private final Color DetailColor = new Color(83,83,83);

    public MountainDetails(int[] shiftX, int[] shiftY){
        this.shiftX=shiftX;
        this.shiftY=shiftY;
    }

    public void draw(Graphics2D g){
        g.setPaint(DetailColor);
        g.drawPolyline(shiftX,shiftY,shiftY.length);
    }
}
