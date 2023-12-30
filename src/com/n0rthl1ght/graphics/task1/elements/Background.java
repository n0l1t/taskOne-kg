package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;
public class Background {

    public void draw(Graphics2D g, int w, int h){
        g.setPaint(new LinearGradientPaint(w / 2, 0, w / 2 + 1, h,
        new float[]{0.1f,0.9f},
        new Color[] {new Color(184,221,223), new Color(232,244,245 )}));
        g.fillRect(0,0,w,h);
    }
}
