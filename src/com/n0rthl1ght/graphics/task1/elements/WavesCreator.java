package com.n0rthl1ght.graphics.task1.elements;
import java.awt.*;
import java.util.Random;

public class WavesCreator {
    public static Wave createW1(){
        int startX = 25;
        int startY = 470;
        int endX = startX+100;
        int endY = startY;
        Color colors = new Color(83,83,83);
        return new Wave(startX,startY,endX,endY,colors);
    }
    public static Wave createW2(){
        int startX = 80;
        int startY = 490;
        int endX = startX+15;
        int endY = startY;
        Color colors = new Color(83,83,83);
        return new Wave(startX,startY,endX,endY,colors);
    }


    public static Wave createW3(){
        int startX = 400;
        int startY = 460;
        int endX = startX+100;
        int endY = startY;
        Color colors = new Color(83,83,83);
        return new Wave(startX,startY,endX,endY,colors);
    }

    public static Wave createW4(){
        int startX = 360;
        int startY = 530;
        int endX = startX+100;
        int endY = startY;
        Color colors = new Color(83,83,83);
        return new Wave(startX,startY,endX,endY,colors);
    }

    public static Wave createW5(){
        int startX = 120;
        int startY = 530;
        int endX = startX+30;
        int endY = startY;
        Color colors = new Color(83,83,83);
        return new Wave(startX,startY,endX,endY,colors);
    }

}
