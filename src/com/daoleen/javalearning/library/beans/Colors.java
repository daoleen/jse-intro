package com.daoleen.javalearning.library.beans;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: daoleen
 * Date: 9/29/13
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Colors extends Canvas implements Serializable {
    transient private Color color;  // непостоянный

    public boolean isRectangular() {
        return rectangular;
    }

    public void setRectangular(boolean rectangular) {
        this.rectangular = rectangular;
        repaint();
    }

    private boolean rectangular;    // постоянный

    public Colors() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                change();
            }
        });
        rectangular = false;
        setSize(200, 100);
        change();
    }

    public void change() {
        color = randomColor();
        repaint();
    }

    private Color randomColor() {
        int r = (int) (255*Math.random());
        int g = (int) (255*Math.random());
        int b = (int) (255*Math.random());
        return new Color(r, g, b);
    }

    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        int h = d.height;
        int w = d.width;
        g.setColor(color);

        if(rectangular) {
            g.fillRect(0, 0, w-1, h-1);
        }
        else {
            g.fillOval(0, 0, w-1, h-1);
        }
    }
}
