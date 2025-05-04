package com.basics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mouseEvents extends JFrame implements MouseListener, MouseMotionListener {
    JLabel statusLabel1, statusLabel2, statusLabel3, statusLabel4, statusLabel5, statusLabel6, statusLabel7;
    public mouseEvents(){
        JFrame frame = new JFrame("MouseEvents");
        setSize(400, 200);
        setLayout(null);
        setVisible(true);

        //to show text in jframe
        statusLabel1 = new JLabel();
        statusLabel1.setBounds(100, 20, 200, 20);
        add(statusLabel1);
        statusLabel2 = new JLabel();
        statusLabel2.setBounds(100, 40, 200, 20);
        add(statusLabel2);
        statusLabel3 = new JLabel();
        statusLabel3.setBounds(100, 60, 200, 20);
        add(statusLabel3);
        statusLabel4 = new JLabel();
        statusLabel4.setBounds(100, 100, 200, 20);
        add(statusLabel4);
        statusLabel5 = new JLabel();
        statusLabel5.setBounds(100, 120, 200, 20);
        add(statusLabel5);



        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
        statusLabel1.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
        statusLabel2.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
        statusLabel2.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered the window");
        statusLabel3.setText("Mouse Entered the window");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited from the window");
        statusLabel3.setText("Mouse Exited form the window");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        statusLabel5.setText("Mouse Dragged to: (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("MouseMoved at: " + e.getX() + ", " + e.getY());
        statusLabel4.setText("MouseMoved at: " + e.getX() + ", " + e.getY());
    }

    //main method
    public static void main(String[] args) {
        System.out.println("mouseEvents");
        new mouseEvents();
    }
}
