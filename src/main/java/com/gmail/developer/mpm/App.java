package com.gmail.developer.mpm;

import javax.swing.JFrame;
/**
 * TextField with custom handler
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350,100);
        textFieldFrame.setVisible(true);
    }
}
