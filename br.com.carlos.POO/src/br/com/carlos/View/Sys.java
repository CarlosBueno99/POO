/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.View;

import java.util.Scanner;
import br.com.carlos.Control.Vender;
import br.com.carlos.DAO.CadernoDAO;
import br.com.carlos.Model.Caderno;
import br.com.carlos.DAO.PapelDAO;
import br.com.carlos.Model.Papel;
import br.com.carlos.DAO.CanetaDAO;
import br.com.carlos.Model.Caneta;
/**
 *
 * @author carlo
 */
public class Sys {
    public static void main(String[] args) {
       Menu();
       
    }
    public static void Menu (){
        
        System.out.println("****Bem Vindo ao Plug and Pay O sistema que foi feito para facilitar sua vida****");
        System.out.println("/n/n/n");
        System.out.println("Escolha uma das opções abaixo!");
        System.out.println("1)- Realizar uma venda");
        System.out.println("2)- Gerenciar produtos");
        
        Scanner console = new Scanner (System.in);
        int escolha = console.nextInt();
        
        switch(escolha){
            case 1:
                Vender.realizarVenda();
                break;
            case 2:
                subMenuProdutos();
                break;
        }
    }

    private static void subMenuProdutos() {
        System.out.println("****Bem Vindo ao Gerencidor de produtos****");
        System.out.println("/n/n/n");
        System.out.println("Escolha uma das opções abaixo!");
        System.out.println("1)- Papel");
        System.out.println("2)- Caneta");
        System.out.println("3)- Sair");
        
        Scanner console = new Scanner (System.in);
        int escolha = console.nextInt();
        
        switch(escolha){
            case 1:
                subMenuPapel();
                break;
            case 2:
                subMenuCaneta();
                break;
            case 3:
                subMenuCaderno();
                break;
            case 4:
                break;
        }
        
        
        
    }
    
    private static void subMenuPapel() {
        System.out.println("****Bem Vindo ao Gerencidor de produtos> PAPEL****");
        System.out.println("/n/n/n");
        System.out.println("Escolha uma das opções abaixo!");
        System.out.println("1)- Inserir produto");
        System.out.println("2)- Alterar produto");
        System.out.println("3)- Consultar produto");
        System.out.println("4)- Excluir produto");
        
        Scanner console = new Scanner (System.in);
        int escolha = console.nextInt();
        Papel papel = new Papel();
        PapelDAO dao = new PapelDAO();
        
        switch(escolha){
            case 1:
                System.out.println("defina o nome, preco, cor do  Papel e tamanho do Papel separado por <enter>");
                papel.setNome(console.nextLine());
                papel.setPreco(console.nextLine());
                papel.setCorPapel(console.nextLine());
                papel.setTamanhoDoPapel(console.nextLine());
                
                String msg = dao.inserir(papel);
                break;
            case 2:
                System.out.println("Qual o nome do produto que quer alterar?");
                Papel alteracao = new Papel();
                alteracao.setNome(console.nextLine());
                System.out.println("Agora coloque o preço, cor do Papel e tamanho do Papel separados por <enter>");
                alteracao.setPreco(console.nextLine());
                alteracao.setCorPapel(console.nextLine());
                alteracao.setTamanhoDoPapel(console.nextLine());
                
                
                dao.alterar(alteracao);
                
                
                break;
            case 3:
                System.out.println("insira o nome do produto que quer consultar");
                dao.consulta(console.nextLine());
                //
                break;
            case 4:
                System.out.println("Qual o nome do produto que quer excluir?");
                Papel exclusao = new Papel();
                exclusao.setNome(console.nextLine());
                //
                break;
        }
        
    }

    private static void subMenuCaneta() {
        System.out.println("****Bem Vindo ao Gerencidor de produtos> CANETA****");
        System.out.println("/n/n/n");
        System.out.println("Escolha uma das opções abaixo!");
        System.out.println("1)- Inserir produto");
        System.out.println("2)- Alterar produto");
        System.out.println("3)- Consultar produto");
        System.out.println("4)- Excluir produto");
        
        Scanner console = new Scanner (System.in);
        int escolha = console.nextInt();
        Caneta caneta = new Caneta();
        CanetaDAO dao = new CanetaDAO(caneta);
        
        switch(escolha){
            case 1:
                System.out.println("defina o nome, preco, cor da caneta, tipo de ponta da caneta separado por <enter>");
                caneta.setNome(console.nextLine());
                caneta.setPreco(console.nextLine());
                caneta.setCorCaneta(console.nextLine());
                caneta.setTipoDePonta(console.nextLine());
                
                String msg = dao.inserir(caneta);
                break;
            case 2:
                System.out.println("Qual o nome do produto que quer alterar?");
                Caneta alteracao = new Caneta();
                alteracao.setNome(console.nextLine());
                System.out.println("Agora coloque o preço, cor da caneta e tipo de ponta da caneta separados por <enter>");
                alteracao.setPreco(console.nextLine());
                alteracao.setCorCaneta(console.nextLine());
                alteracao.setTipoDePonta(console.nextLine());
                
                
                dao.alterar(alteracao);
                
                
                break;
            case 3:
                System.out.println("insira o nome do produto que quer consultar");
                dao.consulta(console.nextLine());
                //
                break;
            case 4:
                System.out.println("Qual o nome do produto que quer excluir?");
                Caneta exclusao = new Caneta();
                exclusao.setNome(console.nextLine());
                //
                break;
        }
    }

    private static void subMenuCaderno() {
        System.out.println("****Bem Vindo ao Gerencidor de produtos> CADERNO****");
        System.out.println("/n/n/n");
        System.out.println("Escolha uma das opções abaixo!");
        System.out.println("1)- Inserir produto");
        System.out.println("2)- Alterar produto");
        System.out.println("3)- Consultar produto");
        System.out.println("4)- Excluir produto");
        
        Scanner console = new Scanner (System.in);
        int escolha = console.nextInt();
        Caderno caderno = new Caderno();
        CadernoDAO dao = new CadernoDAO();
        
        switch(escolha){
            case 1:
                System.out.println("defina o nome, preco, numero de materias e marca do caderno separado por <enter>");
                caderno.setNome(console.nextLine());
                caderno.setPreco(console.nextLine());
                caderno.setNumeroDeMaterias(console.nextLine());
                caderno.setMarcaCaderno(console.nextLine());
                
                String msg = dao.inserir(caderno);
                break;
            case 2:
                System.out.println("Qual o nome do produto que quer alterar?");
                Caderno alteracao = new Caderno ();
                alteracao.setNome(console.nextLine());
                System.out.println("Agora coloque o preço, numero de materias e marca do caderno separados por <enter>");
                alteracao.setPreco(console.nextLine());
                alteracao.setNumeroDeMaterias(console.nextLine());
                alteracao.setMarcaCaderno(console.nextLine());
                
                
                dao.alterar(alteracao);
                
                
                break;
            case 3:
                System.out.println("insira o nome do produto que quer consultar");
                dao.consulta(console.nextLine());
                //
                break;
            case 4:
                System.out.println("Qual o nome do produto que quer excluir?");
               Caderno exclusao = new Caderno();
                exclusao.setNome(console.nextLine());
                //
                break;
        }
    }
    
}
