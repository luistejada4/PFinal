package com.luistejada;

import java.awt.*;

/**
 * Created by luistejada on 07/12/16.
 */
public class Celda extends Container {


    private int posX;
    private int posY;
    private int w;
    private int h;
    private Color color;

    public Celda(int x, int y, int w, int h, Color c)
    {
        posX = x;
        posY = y;
        this.w = w;
        this.h = h;
        color = c;

        setBounds(posX, posY, w, h);
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

        if(color == Color.BLACK) {

            g.setColor(Color.BLACK);
            g.drawRect(0, 0, getWidth(), getHeight());

            Graphics2D g2 = (Graphics2D) g;
            Stroke oldStroke = g2.getStroke();
            g2.setStroke(new BasicStroke(8));
            g2.drawRect(0, 0, getWidth(), getHeight());
            g2.setStroke(oldStroke);

        } else {

            g.setColor(color);
            g.fillRect(0, 0, getWidth(), getHeight());

            g.setColor(Color.BLACK);
            g.drawRect(0, 0, getWidth(), getHeight());

            Graphics2D g2 = (Graphics2D) g;
            Stroke oldStroke = g2.getStroke();
            g2.setStroke(new BasicStroke(8));
            g2.drawRect(0, 0, getWidth(), getHeight());
            g2.setStroke(oldStroke);
        }
    }

}
