package com.basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardDemo extends JFrame implements KeyListener {
    JTextField inputField;

    public KeyboardDemo() {
        super("Keyboard Demo"); // Set title
        setSize(400, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputField = new JTextField();
        inputField.setBounds(100, 50, 200, 30);
        inputField.addKeyListener(this); // Add KeyListener
        add(inputField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyboardDemo();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed : "+ e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed :" + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released :"+e.getKeyCode());
    }
}
