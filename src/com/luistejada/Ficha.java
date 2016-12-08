package com.luistejada;

import java.awt.*;

/**
 * Created by luistejada on 08/12/16.
 */
public class Ficha  extends Component {

    Color color;
    int posX;
    int posY;

    public Ficha(int posX, int posY, Color color) {

        this.posX = posY;
        this.posY = posY;
        this.color = color;
        setBounds(posX, posX, 20, 20);
    }

    public void paint(Graphics g) {

        g.setColor(color);
        g.fillOval(0, 0, getWidth(), getHeight());
    }
}
