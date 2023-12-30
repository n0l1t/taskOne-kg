package com.n0rthl1ght.graphics.task1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow newWindow = new MainWindow();
        newWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        newWindow.setSize(1280,960);
        newWindow.setVisible(true);
    }
}