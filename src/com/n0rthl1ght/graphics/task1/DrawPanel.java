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
    private List<Mountain> mountains2;
    private List<Wave> wv;
    private List<MountainDetails> md;
    private List<Lighthouse> lh;
    private List<Clouds> cl;
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

        cl = new ArrayList<Clouds>();
        for(int i = -30; i < 900; i=i+rnd.nextInt(60,80)){
            int x0 = i;
            int y0 = rnd.nextInt(5, 300);
            int wdth = rnd.nextInt(10,130);
            cl.add(CloudsCreator.createCloud(x0,y0,wdth));
        }

        mountains = new ArrayList<Mountain>();
        mountains.add(MountainCreator.createM6());
        mountains.add(MountainCreator.createM1());

        md = new ArrayList<MountainDetails>();
        md.add(MountainDetailsCreator.detail1());
        md.add(MountainDetailsCreator.detail2());
        md.add(MountainDetailsCreator.detail3());
        md.add(MountainDetailsCreator.detail4());
        md.add(MountainDetailsCreator.detail5());
        md.add(MountainDetailsCreator.detail6());
        md.add(MountainDetailsCreator.detail7());
        md.add(MountainDetailsCreator.detail8());
        md.add(MountainDetailsCreator.detail9());

        lh = new ArrayList<Lighthouse>();
        lh.add(LighthouseElementCreator.elementH1W());
        lh.add(LighthouseElementCreator.elementH2R());
        lh.add(LighthouseElementCreator.element1R());
        lh.add(LighthouseElementCreator.element1W());
        lh.add(LighthouseElementCreator.element2R());
        lh.add(LighthouseElementCreator.element2W());
        lh.add(LighthouseElementCreator.element3R());
        lh.add(LighthouseElementCreator.element3W());
        lh.add(LighthouseElementCreator.element4R());
        lh.add(LighthouseElementCreator.elementB1());
        lh.add(LighthouseElementCreator.element4W());
        lh.add(LighthouseElementCreator.elementB2());
        lh.add(LighthouseElementCreator.elementB3());
        lh.add(LighthouseElementCreator.element4E());
        lh.add(LighthouseElementCreator.elementW1());
        lh.add(LighthouseElementCreator.elementW2());
        lh.add(LighthouseElementCreator.elementW3());
        lh.add(LighthouseElementCreator.element5R());
        lh.add(LighthouseElementCreator.element6R());

        mountains2 = new ArrayList<Mountain>();
        mountains2.add(MountainCreator.createM2());
        mountains2.add(MountainCreator.createM3());
        mountains2.add(MountainCreator.createM4());
        mountains2.add(MountainCreator.createM5());
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        bg.draw(g,getWidth(),getHeight());
        sea.draw(g,getWidth(),getHeight());

        for(Wave i: wv){
            i.draw(g);
        }
        for(Mountain i: mountains){
            i.draw(g);
        }
        for (Lighthouse i : lh) {
            i.draw(g);
        }
        for(Mountain i: mountains2){
            i.draw(g);
        }
        for (MountainDetails i : md) {
            i.draw(g);
        }
        for (Clouds i : cl) {
            i.draw(g);
        }
    }
}
