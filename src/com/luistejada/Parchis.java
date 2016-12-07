package com.luistejada;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by luistejada on 07/12/16.
 */
public class Parchis extends JFrame {

    private ArrayList<Base> bases = new ArrayList<>();

    public Parchis()
    {
        setLayout(null);
        setSize(900, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Base baseRoja = new Base(0, 0, Color.RED);
        bases.add(baseRoja);
        add(baseRoja);
        Base baseAzul = new Base(0, 500, Color.BLUE);
        add(baseAzul);
        bases.add(baseAzul);
        Base baseVerde = new Base(500, 500, Color.GREEN);
        bases.add(baseVerde);
        add(baseVerde);
        Base baseAmarilla = new Base(500, 0, Color.YELLOW);
        add(baseAmarilla);



        setVisible(true);
    }
}
