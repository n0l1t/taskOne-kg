package com.n0rthl1ght.graphics.task1;

import com.n0rthl1ght.graphics.task1.elements.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawPanel extends JPanel {
    private Random rnd = new Random();
    private Background bg;
    private Sea sea;
    private List<Mountain> mountains;
    private List<Wave> wv;
    public DrawPanel() {
        bg = new Background();
        sea = new Sea(0,450);

        wv = new ArrayList<Wave>();

        for (int i = 20; i < 700; i=i+rnd.nextInt(10,50)) {
            int startX = i;
            int startY = rnd.nextInt(455, 750);
            int endX = startX+rnd.nextInt(30,100);
            int endY=startY;
            wv.add(WavesCreator.createWave(startX,startY,endX,endY));
        }

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
        sea.draw(g,getWidth(),getHeight());

        for(Wave i: wv){
            i.draw(g, getWidth(),getHeight());
        }

        for(Mountain i: mountains){
            i.draw(g, getWidth(),getHeight());
        }
    }
}
