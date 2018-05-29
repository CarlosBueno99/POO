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
public class Papel extends Produto {
    private String corPapel;
    private String tamanhoDoPapel;
    
    
    public void setCorPapel(String cor){
        this.corPapel = cor;
    }
    public String getCorPapel(){
        return this.corPapel;
    }
    
    public void setTamanhoDoPapel(String tamanhoDoPapel){
        this.tamanhoDoPapel = tamanhoDoPapel;
    }
    public String getTamanhoDoPapel (){
        return this.tamanhoDoPapel;
    }
}
