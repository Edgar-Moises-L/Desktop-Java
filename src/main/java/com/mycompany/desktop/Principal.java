package com.mycompany.desktop;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {
    private JPanel panelPrincipal;
    private JButton btnInventario;
    private JButton btnVentas;
    private JButton btnFacturas;

    public Principal(){
        iniciarPrincipal();
        btnInventario.addActionListener(this::showInventario);
        btnVentas.addActionListener(this::showVentas);
        btnFacturas.addActionListener(this::showFacturas);
    }

    private void showInventario (ActionEvent e){
        Inventario inventario = new Inventario();
        inventario.setVisible(true);
    }

    private void showVentas(ActionEvent e){
        Venta venta = new Venta();
        venta.setVisible(true);
    }

    private void showFacturas(ActionEvent e){
        Factura factura = new Factura();
        factura.setVisible(true);
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
