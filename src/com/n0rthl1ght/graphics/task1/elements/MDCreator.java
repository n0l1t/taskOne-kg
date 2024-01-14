package com.n0rthl1ght.graphics.task1.elements;

public class MDCreator {
    public static MountainDetails detail1(){
        int[] x = {380,300,315};
        int[] y = {535,535,525};
        return new MountainDetails(x,y);
    }
    public static MountainDetails detail2(){
        int[] x = {350,360,370};
        int[] y = {470,460,460};
        return new MountainDetails(x,y);
    }
    public static MountainDetails detail3(){
        int[] x = {370,390,400,415};
        int[] y = {480,470,470,460};
        return new MountainDetails(x,y);
    }
    public static MountainDetails detail4(){
        int[] x = {440,460,470};
        int[] y = {415,415,425};
        return new MountainDetails(x,y);
    }
    public static MountainDetails detail5(){
        int[] x = {445,450,465,480,490,510,520};
        int[] y = {515,505,510,500,510,505,510};
        return new MountainDetails(x,y);
    }
}
