import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
public class GUI {
 
    JFrame frame;
    JPanel paneliz,panelde,panelab,panelar,panelex,panellist;
    JLabel nombre,apellido1, apellido2,telefono,dni, id_empleat, cargo,jornada, estudios,salario;
    JTextField text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
    JButton boton1,boton2;
    JTextArea list ;
         
    GUI(){
        
        frame = new JFrame();
        paneliz  = new JPanel();
        panelde  = new JPanel();
        panelab  = new JPanel();
        panellist  = new JPanel();
        panelar  = new JPanel();
        panelex = new JPanel();
        nombre = new JLabel();
        apellido1 = new JLabel();
        apellido2 = new JLabel();
        telefono = new JLabel();
        dni = new JLabel();
        id_empleat = new JLabel();
        cargo = new JLabel();
        jornada= new JLabel();
        estudios= new JLabel();
        salario= new JLabel();
       
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();
        text8 = new JTextField();
        text9 = new JTextField();
        text10 = new JTextField();
        boton1 = new JButton();
        boton2 = new JButton();
        list = new JTextArea();
       
        frame.setTitle("Formulario");
        frame.setLayout(new FlowLayout());     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,370);
        
        nombre.setText("Nombre");
        apellido1.setText("Apellido 1");
        apellido2.setText("Apellido 2");
        telefono.setText("Telefono");
        dni.setText("DNI");
        id_empleat.setText("ID empleado");
        cargo.setText("cargo");
        jornada.setText("jornada");
        estudios.setText("estudios");
        salario.setText("salario");
       
       
       
        boton1.setText("Aceptar");
        boton2.setText("Cancelar");
                
        paneliz.setLayout(new GridLayout(10,0));
        paneliz.add(nombre);
        paneliz.add(apellido1);
        paneliz.add(apellido2);
        paneliz.add(telefono);
        paneliz.add(dni);
        paneliz.add(id_empleat);
        paneliz.add(cargo);
        paneliz.add(jornada);
        paneliz.add(estudios);
        paneliz.add(salario);
       
        panelde.setLayout(new GridLayout(10,0));
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);
        panelde.add(text5);
        panelde.add(text6);
        panelde.add(text7);
        panelde.add(text8);
        panelde.add(text9);
        panelde.add(text10);
       
       
        panelar.setLayout(new GridLayout(1,1));
        panelar.setPreferredSize(new Dimension(350,200));
        panelar.add(paneliz);
        panelar.add(panelde);
                
        panelab.setLayout(new FlowLayout());
        panelab.setPreferredSize(new Dimension(200,50));
        panelab.add(boton1);
        panelab.add(boton2);
       
 
        panelex.setLayout(new GridLayout(2,0));
        panelex.add(panelar);
        panelex.add(panelab);
       
        boton1.addActionListener(new EscuchaBoton());       
        frame.add(panelex);
    }
     class EscuchaBoton implements ActionListener{
         public void actionPerformed(ActionEvent e){
             try {
             if ( text1.getText().matches(".*[0-9]+.*"))
                throw new Exception("los nombres no tienen numeros");
             if ( text2.getText().matches(".*[0-9]+.*"))
                 throw new Exception("los apellidos no tienen numeros");
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                     System.out.println("vaciamos nombre");
                    text1.setText("");
                }
             
            /* try {
                 
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        System.out.println("vaciamos apellido");
                        text2.setText("");
                    }*/
             
             System.out.println("Recogemos los datos y los validamos" + text1.getText() );
         }
     }
    public static void main(String[] args) {
 
        GUI pa = new GUI();
 
    }
 
}
