package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Clouds {
    private final int x0;
    private final int y0;
    private final int width;

    public Clouds(int x0, int y0, int width) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
    }

    public void draw(Graphics2D g){
        Ellipse2D ellipse2D = new Ellipse2D.Double(x0, y0, 40, 30);
        Ellipse2D ellipse2D2 = new Ellipse2D.Double(x0 + width, y0, 40, 30);
        Rectangle rectangle = new Rectangle(x0 + 20, y0, width, 30);
        g.setColor(Color.WHITE);
        g.fill(ellipse2D);
        g.fill(ellipse2D2);
        g.fill(rectangle);
    }
}
