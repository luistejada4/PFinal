package com.luistejada;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by luistejada on 07/12/16.
 */
public class Base extends JPanel {

    private FlowLayout style;
    private int posX;
    private int posY;
    private Color color;

    public Base(int x, int y, Color c)
    {
        style = new FlowLayout();
        this.setLayout(style);

        posX = x;
        posY = y;
        color = c;
        setBounds(posX, posY, 175, 175);

    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
