package com.n0rthl1ght.graphics.task1.elements;
import java.awt.*;
import java.util.Random;

public class WavesCreator {
    static int startX = 0;
    static int startY = 0;
    static int endX = 0;
    static int endY = 0;

    public static Wave createWave(int startX, int startY, int endX, int endY){
        return new Wave(startX,startY,endX,endY);
    }

}
