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
        posX = x;
        posY = y;
        color = c;
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

        g.setColor(color);
        g.fillOval(posX, posY, 150, 150);
    }

}
