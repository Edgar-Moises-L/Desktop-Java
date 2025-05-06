package com.mycompany.desktop;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class Inventario extends JFrame {

    private JPanel panelPrincipal;
    private JTable table1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton volverButton;

    public Inventario (){
        iniciarInventario();
    }

    private void iniciarInventario(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
    }
}
