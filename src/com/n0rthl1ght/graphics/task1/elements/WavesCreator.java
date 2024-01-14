package com.n0rthl1ght.graphics.task1.elements;

public class WavesCreator {
    static int startX;
    static int startY;
    static int endX;
    static int endY;

    public static Wave createWave(int startX, int startY, int endX, int endY){
        return new Wave(startX,startY,endX,endY);
    }

}
