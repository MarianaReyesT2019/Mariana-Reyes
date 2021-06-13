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
public class admin {

    
    private String sucur,name,precio,descripcion; 

    public admin(String sucur, String name, String precio, String descripcion) {
        this.sucur = sucur;
        this.name = name;
        this.precio = precio;
        this.descripcion = descripcion;
        
    }
    
    admin(){
        
    }

    public String getSucur() {
        return sucur;
    }

    public void setSucur(String sucur) {
        this.sucur = sucur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
