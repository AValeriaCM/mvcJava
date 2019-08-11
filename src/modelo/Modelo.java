/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author astrid
 */

public class Modelo {
     /*
    Propiedades del modelo
    */
    private String texto;
    private String resultado;
    
    /**
     * Metodo Set
     * @param texto 
     */
     public void setTexto(String texto) {
        this.texto = texto;
    }
    /**
     * Metodo set
     * @param resultado 
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    /**
     * Metodo Get
     * @return 
     */
    public String getTexto() {
        return texto;
    }
    /**
     * Metodo get
     * @return 
     */
    public String getResultado() {
        return resultado;
    }
    /**
     * Metodo que retorna
     * @return 
     */
    public String respuesta(){
        this.resultado=this.texto;
          return this.resultado;
        
    }

    
}
