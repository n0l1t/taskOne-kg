package com.n0rthl1ght.graphics.task1;

import com.n0rthl1ght.graphics.task1.elements.Background;
import com.n0rthl1ght.graphics.task1.elements.Mountain;
import com.n0rthl1ght.graphics.task1.elements.MountainCreator;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {

    private int partWidth;
    private int partHeight;

    private Background bg;
    private List<Mountain> mountains;
    public DrawPanel() {
        bg = new Background();

        mountains = new ArrayList<Mountain>();
        mountains.add(MountainCreator.createM1());
        mountains.add(MountainCreator.createM2());
        mountains.add(MountainCreator.createM3());
        mountains.add(MountainCreator.createM4());
        mountains.add(MountainCreator.createM5());
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        bg.draw(g,getWidth(),getHeight());

        for(Mountain i: mountains){
            i.draw(g, getWidth(),getHeight());
        }
    }
}
