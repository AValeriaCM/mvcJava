/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author astrid
 */
public class Controlador implements ActionListener{
   /**
    * Instancias
    */ 
    private Vista vista;
    private Modelo modelo;
    DefaultTableModel model;
  
    /**
     * Constructor
     * @param vista
     * @param modelo 
     */
    public Controlador(Vista vista,Modelo modelo){
        /**
         * Se igualan las variables
         */
         this.vista=vista;
         this.modelo=modelo;
         this.vista.jButton1.addActionListener(this);
         /**
          * Modelo de la tabla
          */
         model = new DefaultTableModel();
         vista.jTable1.setModel(model);
        //se le da un nombre a cada columna 
        model.addColumn("Id");
  
    }
    /**
     * Metodo que inicia la aplicacion
     */
    public void iniciar (){
        vista.setTitle("mvd primer proyecto");
        vista.setLocationRelativeTo(null);
    }

    
    @Override
    /**
     * Se determinan e instancian los eventos
     */
    public void actionPerformed(ActionEvent e) {
        modelo.setTexto(vista.jTextField1.getText());
        modelo.respuesta();
        Object []object = new Object[1];
        object[0] = vista.jTextField1.getText();
        model.addRow(object); 
        limpiar();
    }
    /**
     * Metodo que vacia la caja de texto
     */
    private void limpiar(){
        vista.jTextField1.setText("");
    }
    

}
