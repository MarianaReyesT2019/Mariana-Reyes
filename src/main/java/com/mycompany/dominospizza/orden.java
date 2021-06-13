/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dominospizza;

/**
 *
 * @author user
 */
public class orden {
    private String surcursal,orden,pizza,descripcion, numero, jamon;

    public orden(String surcursal, String orden, String pizza, String descripcion, String numero, String jamon) {
        this.surcursal = surcursal;
        this.orden = orden;
        this.pizza = pizza;
        this.descripcion = descripcion;
        this.numero = numero;
        this.jamon = jamon;
    }
    orden(){
        
    }

    public String getSurcursal() {
        return surcursal;
    }

    public void setSurcursal(String surcursal) {
        this.surcursal = surcursal;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getnumero() {
        return numero;
    }
    
    public void setnumero(String numero) {
        this.numero = numero;
    }
    
     public String getjamon() {
        return jamon;
    }
    
    public void setjamon(String jamon) {
        this.jamon = jamon;
    }
    
     void setVisible(boolean a) {
        throw new UnsupportedOperationException("Not supported yet.");
     }

    
}
