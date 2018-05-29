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
public class Caneta extends Produto{
    private String corCaneta;
    private String tipoDePonta;
    
    public void setCorCaneta(String cor){
        this.corCaneta = cor;
    }
    public String getCorCaneta(){
        return this.corCaneta;
    }
    
    public void setTipoDePonta(String tipoDePonta){
        this.tipoDePonta = tipoDePonta;
    }
    public String getTipoDePonta(){
        return this.tipoDePonta;
    }
    
}
