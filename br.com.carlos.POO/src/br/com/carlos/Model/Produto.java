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
    private double preco;
    private int quantidade;
    
    public void setNome(String nome){
        this.nome = nome; 
    }
    public String getNome (){
        return nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
}

