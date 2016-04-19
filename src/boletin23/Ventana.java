package boletin23;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author agomezcastro
 */
public class Ventana {
    
    public void crearVentana(){
        String[] list = {"elementolista1", "elementolista2", "elementolista3"};
    
        JFrame marco = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton boton1 = new JButton("premer");
        JButton boton2 = new JButton("limpar");
        JButton boton3 = new JButton("boton");
        JLabel etiqueta1 = new JLabel("nome:");
        JLabel etiqueta2 = new JLabel("password:");
        JTextField casilla1 = new JTextField(10);
        JPasswordField contrasinal = new JPasswordField(10);
        JTextArea area = new JTextArea();
        JList lista = new JList(list);
        /*FlowLayout dis = new FlowLayout(FlowLayout.CENTER);
        panel1.setLayout(dis);*/
        
        
        
        
        boton1.setBounds(100, 150, 90, 30);
        boton2.setBounds(200, 150, 90, 30);
        boton3.setBounds(155, 360, 90, 30);
        
        etiqueta1.setBounds(130, 30, 100, 30);
        etiqueta2.setBounds(100, 80, 100, 30);
        
        casilla1.setBounds(200, 30, 100, 25);
        
        contrasinal.setBounds(200, 80, 100, 25);
        
        panel1.setBounds(1, 1, 1000, 300);
        panel2.setBounds(1 , 301, 1000, 300);
        
        lista.setBounds(5, 350, 150, 60);
        area.setBounds(245, 350, 150, 60);
        
        
        
        panel1.add(etiqueta1);
        panel1.add(casilla1);
        panel1.add(etiqueta2);
        panel1.add(contrasinal);
        panel1.add(boton1);
        panel1.add(boton2);
        panel1.setBackground(Color.red);
        panel1.setLayout(null);
        
        
        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(area);
        panel2.setBackground(Color.BLUE);
        panel2.setLayout(null);
        
        
        marco.setSize(400, 600);
        marco.add(panel1);
        marco.add(panel2);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
}
}
