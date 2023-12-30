package com.n0rthl1ght.graphics.task1;

import com.n0rthl1ght.graphics.task1.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel {

    private Background bg;
    private Sea sea;
    private List<Mountain> mountains;
    private List<Wave> wave;
    public DrawPanel() {
        bg = new Background();
        sea = new Sea(0,450);

        mountains = new ArrayList<Mountain>();
        mountains.add(MountainCreator.createM1());
        mountains.add(MountainCreator.createM2());
        mountains.add(MountainCreator.createM3());
        mountains.add(MountainCreator.createM4());
        mountains.add(MountainCreator.createM5());

        wave = new ArrayList<Wave>();
        wave.add((WavesCreator.createW1()));
        wave.add((WavesCreator.createW2()));
        wave.add((WavesCreator.createW3()));
        wave.add((WavesCreator.createW4()));
        wave.add((WavesCreator.createW5()));

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        bg.draw(g,getWidth(),getHeight());
        sea.draw(g,getWidth(),getHeight());
        for(Wave i: wave){
            i.draw(g,getWidth(),getHeight());
        }
        for(Mountain i: mountains){
            i.draw(g, getWidth(),getHeight());
        }
    }
}
