package com.mycompany.desktop;

import javax.swing.*;
import com.formdev.flatlaf.FlatDarculaLaf;

public class Factura extends JFrame {

    public Factura(){
        inicializarFactura();
    }
    private void inicializarFactura(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Factura factura = new Factura();
        factura.setVisible(true);
    }

    private JPanel panelPrincipal;
    private JTable table1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField1;
    private JButton aplicarFiltrosButton;
    private JButton volverButton;


}
