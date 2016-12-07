package com.luistejada;

import javax.swing.*;
import java.awt.*;

/**
 * Created by luistejada on 07/12/16.
 */
public class Ventana extends JFrame {

    public Ventana()
    {

        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new Base(20, 10, Color.RED));

        setVisible(true);
    }
}
