package com.luistejada;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by luistejada on 07/12/16.
 */
public class Parchis extends JFrame {

    private ArrayList<Base> bases = new ArrayList<>();
    private ArrayList<Celda> celdas = new ArrayList<>();
    private ArrayList<Ficha> fichas = new ArrayList<>();

    public Parchis()
    {
        setLayout(null);
        setSize(900, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setSize(900, 700);
        panel.setLayout(null);


        Base baseRoja = new Base(25, 30, new Color(250, 0, 0));
        baseRoja.setLayout(new FlowLayout());

        Ficha f = new Ficha(40, 40, Color.BLACK);
        baseRoja.add(f);

        bases.add(baseRoja);


        Base baseAzul = new Base(25, 500, Color.BLUE);
        bases.add(baseAzul);

        Base baseVerde = new Base(500, 500, Color.GREEN);
        bases.add(baseVerde);

        Base baseAmarilla = new Base(500, 30, Color.YELLOW);
        bases.add(baseAmarilla);

        Base baseCentral = new Base(262, 265, Color.GRAY);
        bases.add(baseCentral);

        panel.add(baseAzul);

        panel.add(baseRoja);

        panel.add(baseVerde);

        panel.add(baseAmarilla);

        panel.add(baseCentral);

        dibujarCeldas();




        setVisible(true);
        panel.setVisible(true);

    }
    public void dibujarCeldas() {


        Celda celda = new Celda(400, 650, 100, 25, Color.BLACK);
        celdas.add(celda);
        add(celda);
        int init = 650;
        init -= 25;

        for(int i = 0; i < 7; i++)
        {
            if(i < 6)
            {
                if(i == 3)
                {
                    celda = new Celda(400, init, 100, 25, Color.GREEN);
                    add(celda);
                    celdas.add(celda);
                    init -= 25;

                } else {
                    celda = new Celda(400, init, 100, 25, Color.BLACK);
                    add(celda);
                    celdas.add(celda);
                    init -= 25;
                }
            }
            else
            {
                celda = new Celda(400, init, 75, 25, Color.BLACK);
                add(celda);
                celdas.add(celda);
                init -= 25;
            }
        }

        celda = new Celda(475, 402, 25, 100, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init = 475;
        init += 25;

        for(int i = 0; i < 7; i++)
        {
            if(i == 2)
            {
                celda = new Celda(init, 402, 25, 100, Color.GREEN);
                celdas.add(celda);
                add(celda);
                init += 25;
            }
            else
            {
                celda = new Celda(init, 402, 25, 100, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init += 25;
            }
        }
        init -=25;

        celda = new Celda(init, 305, 25, 100, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init -= 25;

        for(int i = 0; i < 7; i++) {

            celda = new Celda(init, 305, 25, 100, Color.YELLOW);
            celdas.add(celda);
            add(celda);
            init -=25;
        }

        celda = new Celda(650, 205, 25, 100, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init = 650;
        init -= 25;

        for(int i = 0; i < 7; i++) {

            if(i == 3)
            {
                celda = new Celda(init, 205, 25, 100, Color.YELLOW);
                celdas.add(celda);
                add(celda);
                init -= 25;
            }
            else if(i < 6) {
                celda = new Celda(init, 205, 25, 100, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init -= 25;

            } else {

                celda = new Celda(init, 230, 25, 75, Color.BLACK);
                add(celda);
                celdas.add(celda);
                init -= 25;
            }
        }

        init = 205;
        celda = new Celda(400, init, 100, 25, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init -= 25;

        for(int i = 0; i < 7; i++)
        {
            if(i == 2)
            {
                celda = new Celda(400, init, 100, 25, Color.YELLOW);
                celdas.add(celda);
                add(celda);
                init -= 25;
            } else {
                celda = new Celda(400, init, 100, 25, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init -= 25;
            }
        }
        init = 30;

        celda = new Celda(300, init, 100, 25, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init +=25;

        for(int i = 0; i < 7; i++) {

            celda = new Celda(300, init, 100, 25, Color.RED);
            celdas.add(celda);
            add(celda);
            init +=25;
        }

        init = 30;

        for(int i = 0; i < 8; i++) {

            if(i == 4)
            {
                celda = new Celda(200, init, 100, 25, Color.RED);
                celdas.add(celda);
                add(celda);
                init += 25;
            }

            else if(i < 7) {

                celda = new Celda(200, init, 100, 25, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init += 25;
            } else {

                celda = new Celda(225, init, 75, 25, Color.BLACK);
                celdas.add(celda);
                add(celda);
            }
        }

        init = 200;

        for(int i = 0; i < 8; i++) {

            if(i == 3)
            {
                celda = new Celda(init, 205, 25, 100, Color.RED);
                celdas.add(celda);
                add(celda);
                init -= 25;
            } else {

                celda = new Celda(init, 205, 25, 100, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init -= 25;
            }
        }

        init = 25;

        celda = new Celda(init, 305, 25, 100, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init += 25;

        for(int i = 0; i < 7; i++) {

            celda = new Celda(init, 305, 25, 100, Color.BLUE);
            celdas.add(celda);
            add(celda);
            init += 25;
        }

        init = 25;

        for(int i =0; i < 8; i++)
        {
            if(i == 4 ) {

                celda = new Celda(init, 400, 25, 100, Color.BLUE);
                celdas.add(celda);
                add(celda);
                init += 25;
            }
            else if(i < 7) {

                celda = new Celda(init, 400, 25, 100, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init += 25;
            } else {

                celda = new Celda(init, 400, 25, 75, Color.BLACK);
                celdas.add(celda);
                add(celda);
            }
        }

        init = 475;

        for(int i = 0; i < 8; i++) {

            if(i == 3)
            {
                celda = new Celda(200, init, 100, 25, Color.BLUE);
                celdas.add(celda);
                add(celda);
                init += 25;
            }
            else {

                celda = new Celda(200, init, 100, 25, Color.BLACK);
                celdas.add(celda);
                add(celda);
                init += 25;
            }
        }

        init = 650;
        celda = new Celda(300, init, 100, 25, Color.BLACK);
        celdas.add(celda);
        add(celda);
        init -=25;

        for(int i = 0; i < 7; i++) {

            celda = new Celda(300, init, 100, 25, Color.GREEN);
            celdas.add(celda);
            add(celda);
            init -= 25;
        }

    }
}
