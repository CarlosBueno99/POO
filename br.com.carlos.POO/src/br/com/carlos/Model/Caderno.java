/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.Model;

/**
 *
 * @author carlo
 */
public class Caderno extends Produto {
    private String numeroDeMaterias;
    private String marcaCaderno;
    
    public void setNumeroDeMaterias(String numeroDeMaterias){
        this.numeroDeMaterias = numeroDeMaterias;
    }
    public String getNumeroDeMaterias (){
        return this.numeroDeMaterias;
    }
    
    public void setMarcaCaderno (String marca){
        this.marcaCaderno = marca;
    }
    public String getMarcaCaderno (){
        return this.marcaCaderno;
    }
}
