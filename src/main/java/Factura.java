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
    private JButton button1;
    private JButton button2;
    private JButton button3;


}
