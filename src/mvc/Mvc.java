/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author astrid
 */
public class Mvc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod=new Modelo();
        Vista vis=new Vista();
        
        Controlador cont =new Controlador(vis,mod); 
        cont.iniciar();
        vis.setVisible(true);
    }
    
}
