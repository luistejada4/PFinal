package com.luistejada;

import javax.swing.*;
import java.awt.*;

/**
 * Created by luistejada on 07/12/16.
 */
public class Base extends Container {

    private int posX;
    private int posY;
    private Color color;

    public Base(int x, int y, Color c)
    {
        setLayout(new FlowLayout());
        posX = x;
        posY = y;
        color = c;

        setBounds(posX, posY, 180, 180);
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

        setLayout(null);
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }

}
