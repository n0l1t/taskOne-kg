package com.n0rthl1ght.graphics.task1.elements;

import java.awt.*;
public class MountainCreator {
    public static Mountain createM1(){
        int[] x = {450,465,490,490,500,520,515,530,520,535,550,620,640,705,740,755,800,810};
        int[] y = {480,460,450,430,420,410,405,400,390,400,380,370,380,390,380,385,390,480};
        Color colors = new Color(152, 154, 144);
        return new Mountain(x,y,colors);
    }
    public static Mountain createM2(){
        int[] x = {510,530,530,545,555,580,600,610,635,645,660,675,685,715,750,770,800,810};
        int[] y = {480,460,430,425,430,415,410,390,395,390,400,405,415,420,425,435,420,480};
        Color colors = new Color(152, 154, 144);
        return new Mountain(x,y,colors);
    }
    public static Mountain createM3(){
        int[] x = {635,650,685,710,735,735,745,755,800,810};
        int[] y = {530,500,470,435,425,420,415,420,410,530};
        Color colors = new Color(152, 154, 144);
        return new Mountain(x,y,colors);
    }
    public static Mountain createM4(){
        int[] x = {510,540,555,570,595,610,625};
        int[] y = {505,480,475,480,470,480,505};
        Color colors = new Color(152, 154, 144);
        return new Mountain(x,y,colors);
    }
    public static Mountain createM5(){
        int[] x = {370,380,400,405,430,430,450};
        int[] y = {530,505,510,500,495,515,530};
        Color colors = new Color(152, 154, 144);
        return new Mountain(x,y,colors);
    }
}
