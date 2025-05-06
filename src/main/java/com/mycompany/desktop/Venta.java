package com.mycompany.desktop;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class Venta extends JFrame{

    public Venta (){
        iniciarVenta();
    }

    private void iniciarVenta(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Venta venta = new Venta();
        venta.setVisible(true);
    }

    private JPanel panelPrincipal;
    private JTable table1;
    private JButton cobrarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton agregarButton;
    private JButton eliminarButton;
    private JButton volverButton;
}
