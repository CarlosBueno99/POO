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
public class Produto {  
    
    private String nome;
    private String preco;
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    public String getNome (){
        return nome;
    }
    public void setPreco(String preco){
        this.preco = preco;
    }
    public String getPreco(){
        return preco;
    }

}

