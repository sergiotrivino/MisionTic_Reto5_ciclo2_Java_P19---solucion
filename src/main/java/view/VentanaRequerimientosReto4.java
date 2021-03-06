package view;
import model.vo.*;
import controller.ControladorRequerimientosReto4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;



public class VentanaRequerimientosReto4 extends JFrame{
    
    public static final ControladorRequerimientosReto4 controlador = new ControladorRequerimientosReto4();
    
    // Mitigar errores de instancias serializable
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea textArea;

    public VentanaRequerimientosReto4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 200, 800,650);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbltitulo = new JLabel("Reto 5");
        lbltitulo.setBounds(28, 6, 61, 16);
        contentPane.add(lbltitulo);

        // Dimensiona el contenido dentro de la ventana
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 70, 737, 455);
        contentPane.add(scrollPane);

        // Proporciona una vista desplazable de un componente en una ventana grafica
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        JButton btnConsuta1 = new JButton("Requerimiento 1");
        btnConsuta1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento1();
            }
        });
        btnConsuta1.setBounds(20, 537, 133, 29);
        contentPane.add(btnConsuta1);

        JButton btnConsuta2 = new JButton("Requerimiento 2");
        btnConsuta2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento2();
            }
        });
        btnConsuta2.setBounds(157, 537, 133, 29);
        contentPane.add(btnConsuta2);

        JButton btnConsuta3 = new JButton("Requerimiento 3");
        btnConsuta3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                requerimiento3();
            }
        });
        btnConsuta3.setBounds(294, 537, 133, 29);
        contentPane.add(btnConsuta3);

        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        btnLimpiar.setBounds(648, 537, 117, 29);
        contentPane.add(btnLimpiar);

    }

    public void requerimiento1(){
        try{
            ArrayList<Consulta1VO_19> lista = controlador.realizarConsulta1();
            String salida = "*** Consulta 1 *** \n\nid_proyector\tFecha_Inicio\tConstructora\t\tserial\n\n";
            for (Consulta1VO_19 r : lista){
                salida += r.getId_proyecto();
                salida += "\t";
                salida += r.getFecha_Inicio();
                salida += "\t";
                salida += r.getConstructora();
                if(r.getConstructora().length() <= 11){
                    salida += "\t\t";
                } else {
                    salida += "\t";
                }
                salida += r.getSerial();
                salida += "\n";
            }
            textArea.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void requerimiento2(){
        try{
            ArrayList<Consulta2VO_19> lista = controlador.realizarConsulta2();
            String salida = "*** Consulta 2 *** \n\nid_proyecto\tarea_max\n\n";
            for (Consulta2VO_19 r : lista){
                salida += r.getId_proyecto();
                salida += "\t";
                salida += r.getArea_max();
                salida += "\n";
            }
            textArea.setText(salida);

        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public void requerimiento3(){
        try{
            ArrayList<Consulta3VO_19> lista = controlador.realizarConsulta3();
            String salida = "*** Consulta 3 *** \n\nid_proyecto\tnombreapellido\n\n";
            for (Consulta3VO_19 r : lista){
                salida += r.getId_proyecto();
                salida += "\t";
                salida += r.getNombreapellido();
                salida += "\t";
                salida += "\n";
            } 
            textArea.setText(salida);   
        
        }catch(SQLException e){
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }
}



