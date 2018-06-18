package ru.geekbrains.hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Forma extends JFrame {

    int firstDotX, firstDotY, secondDotX, secondDotY;
    boolean drawLineFlag= true;// true means start of the line
    public Forma() throws HeadlessException {
        setTitle("Drawing form");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,300,400,400);
        JPanel panel = new JPanel();
        add(panel);
         panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (drawLineFlag) {
                    firstDotX=e.getX();
                    firstDotY=e.getY();
                    drawLineFlag=false;
                }
                else{
                    secondDotX=e.getX();
                    secondDotY=e.getY();
                    drawLineFlag=true;
                }
                if (drawLineFlag){
                        repaint();

                }
                System.out.println("Mouse coordinates: "+ e.getX()+' '+e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });



        setVisible(true);
    }

    public void paint(Graphics g){
        g.drawLine(firstDotX+10,firstDotY+30,secondDotX+10,secondDotY+30);
    }


}
