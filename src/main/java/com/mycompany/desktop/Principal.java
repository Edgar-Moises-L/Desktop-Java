package com.mycompany.desktop;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class Principal extends JFrame {
    private JPanel panelPrincipal;
    private JButton inventarioButton;
    private JButton ventasButton;
    private JButton facturasButton;

    public Principal(){
        iniciarPrincipal();
    }

    private void iniciarPrincipal(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        FlatDarculaLaf.setup();
        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
