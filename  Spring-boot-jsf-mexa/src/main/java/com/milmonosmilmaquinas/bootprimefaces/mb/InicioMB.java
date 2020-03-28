/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milmonosmilmaquinas.bootprimefaces.mb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import java.io.Serializable;

/**
 * 
 * @author Daniel
 * @since 23/03/2020
 */
@Component
@ViewScoped
public class InicioMB implements Serializable {

    Logger logger = LoggerFactory.getLogger(InicioMB.class);
    
    private String holaMundo = "";
    
    @PostConstruct
    public void init(){
        //Hacemos un logeo para revisar que no se este llamando dos veces el
        //Postconstruct
        logger.info("Entra al postconstruct");
        //Inicializamos la variable que mostraremos en la pagina
        holaMundo = "Da clic aqui!";
    }
    
    /**
     * Metodo que sera llamado desde un boton de la vista
     * Para mostrar que ya esta funcionando el primefaces
     */
    public void saludar(){
        holaMundo = "Hola Mundo!!";
    }

    //<editor-fold desc="Accesores" defaultstate="collapsed">
    public String getHolaMundo() {
        return holaMundo;
    }

    public void setHolaMundo(String holaMundo) {
        this.holaMundo = holaMundo;
    }
    //</editor-fold>
}
