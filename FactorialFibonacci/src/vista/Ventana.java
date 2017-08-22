/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import general.Marco;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import logica.Factorial;
import logica.Fibonacci;

/**
 *
 * @author Carlos G. Anguiano
 */
public class Ventana extends Marco{
    
    private JLabel tituloLab, tipoConversionLab, tipoSerieLab, instruccionesLab,
            resSerieLab, resConversionLab, instruccionTxtLab;
    private JButton convertirBtn;
    private JComboBox<String> conversionCmb;
    private JTextField numeroTxt;
    
    private String[] tipoConversionList = new String[]{
        "Fibonacci", "Factorial"
    };

    public Ventana() {
        inicializarElementos();
        configurarElementos();
        agregarElementos();
    }
    
    private void inicializarElementos(){
        //Inicializando los labels
        tituloLab = new JLabel("Fibonacci - Factorial", SwingConstants.CENTER);
        tipoConversionLab = new JLabel("Fibonacci");
        tipoSerieLab = new JLabel("Serie Fibonacci");
        instruccionesLab = new JLabel("Seleccione la serie que desea ver:");
        resSerieLab = new JLabel();
        resConversionLab = new JLabel();
        instruccionTxtLab = new JLabel();
        //Inicializando el boton
        convertirBtn = new JButton("Consultar");
        //Inicializacion de comboBox de opciones;
        conversionCmb = new JComboBox<>(tipoConversionList);
        //Inicializanco entrada de texto
        numeroTxt = new JTextField();
    }
    
    private void configurarElementos(){
        
        Font titulo = new Font("Verdana", Font.BOLD, 18);
        Font textoNormal = new Font("Verdana", Font.PLAIN, 14);
        Font resultado = new Font("Verdana", Font.BOLD, 14);
        
        tituloLab.setBounds(100, 10, 280, 30);
        tituloLab.setFont(titulo);
        
        instruccionesLab.setBounds(20, 60, 440, 20);
        instruccionesLab.setFont(textoNormal);
        
        conversionCmb.setBounds(20, 90, 440, 20);
        conversionCmb.setFont(textoNormal);
        
        instruccionTxtLab.setBounds(20, 120, 120, 20);
        instruccionTxtLab.setFont(textoNormal);
        
        numeroTxt.setBounds(160, 120, 120, 30);
        numeroTxt.setFont(resultado);
        
        tipoConversionLab.setBounds(20, 180, 120, 20);
        tipoConversionLab.setFont(textoNormal);
        
        resConversionLab.setBounds(160, 180, 120, 20);
        resConversionLab.setFont(resultado);
        
        tipoSerieLab.setBounds(20, 220, 120, 20);
        tipoSerieLab.setFont(textoNormal);
        
        resSerieLab.setBounds(160, 220, 240, 20);
        resSerieLab.setFont(resultado);
        
        convertirBtn.setBounds(100, 260, 240, 40);
        convertirBtn.setFont(titulo);
        
        //Configuracion de ActionListeners
        
        conversionCmb.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String selectedConversion = (String)conversionCmb.getSelectedItem();
                if(selectedConversion.equals("Fibonacci")){
                    crearSerie("Fibonacci");
                } else if (selectedConversion.equals("Factorial")){
                    crearSerie("Factorial");
                }
                
            }
            
        });
        
        convertirBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String c = (String)conversionCmb.getSelectedItem();
                    int n = Integer.parseInt(numeroTxt.getText());
                    if(c=="Fibonacci"){
                        Fibonacci f = new Fibonacci();
                        f.calcularFibonacci(n);
                        resConversionLab.setText(Integer.toString(f.getFibonacci()));
                        resSerieLab.setText(f.getListaFibonacci());
                    }else if(c=="Factorial"){
                        Factorial f = new Factorial();
                        f.calcularFactorial(n);
                        resConversionLab.setText(Integer.toString(f.getFactorial()));
                        resSerieLab.setText(f.getListaFactorial());
                    }
                }catch(Exception err) {
                    JOptionPane.showMessageDialog(null, "No se puede operar con ese dato", null, JOptionPane.ERROR_MESSAGE);
                }
            }
            
        });
    }
    
    private void agregarElementos(){
        this.add(tituloLab);
        this.add(instruccionesLab);
        this.add(conversionCmb);
        this.add(instruccionTxtLab);
        this.add(numeroTxt);
        this.add(tipoConversionLab);
        this.add(resConversionLab);
        this.add(tipoSerieLab);
        this.add(resSerieLab);
        this.add(convertirBtn);
        this.setVisible(true);
    }
    
    private void crearSerie(String tipo){
        if(tipo=="Fibonacci"){
            tipoSerieLab.setText("Serie Fibonacci");
            tipoConversionLab.setText("Fibonacci");
            
        } else if (tipo=="Factorial"){
            tipoSerieLab.setText("Serie Factorial");
            tipoConversionLab.setText("Factorial");
        }
    }
    
}
