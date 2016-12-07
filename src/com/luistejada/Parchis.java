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

    public Parchis()
    {
        setLayout(null);
        setSize(900, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Base baseRoja = new Base(25, 30, Color.RED);
        bases.add(baseRoja);
        add(baseRoja);
        Base baseAzul = new Base(25, 500, Color.BLUE);
        add(baseAzul);
        bases.add(baseAzul);
        Base baseVerde = new Base(500, 500, Color.GREEN);
        bases.add(baseVerde);
        add(baseVerde);
        Base baseAmarilla = new Base(500, 30, Color.YELLOW);
        add(baseAmarilla);

        dibujarCeldas();

        setVisible(true);
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
                celda = new Celda(400, init, 100, 25, Color.BLACK);
                add(celda);
                celdas.add(celda);
                init -= 25;
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
            celda = new Celda(init, 402, 25, 100, Color.BLACK);
            celdas.add(celda);
            add(celda);
            init += 25;
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

            if(i < 6) {
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
            celda = new Celda(400, init, 100, 25, Color.BLACK);
            celdas.add(celda);
            add(celda);
            init -= 25;
        }
        init = 30;

        for(int i = 0; i < 8; i++) {

            celda = new Celda(300, init, 100, 25, Color.RED);
            celdas.add(celda);
            add(celda);
            init +=25;
        }

        init = 30;

        for(int i = 0; i < 8; i++) {

            if(i < 7) {

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

            celda = new Celda(init, 205, 25, 100, Color.BLACK);
            celdas.add(celda);
            add(celda);
            init -= 25;
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
