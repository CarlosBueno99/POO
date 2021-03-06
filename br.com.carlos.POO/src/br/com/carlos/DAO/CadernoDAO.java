/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.DAO;

import br.com.carlos.Model.Caderno;
import br.com.carlos.Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author carlo
 */
public class CadernoDAO {
private Connection conexao;

     public String inserir(Caderno produto) {
        String message = "";
        try {
            String sql = "INSERT INTO tbpcaderno(nome, preco, numerodematerias, marcacaderno) VALUES(?,?,?,?)";
            conexao = ConnectionFactory.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getPreco());
            stmt.setString(3, produto.getNumeroDeMaterias());
            stmt.setString(4, produto.getMarcaCaderno());
            
            
            stmt.execute();
            stmt.close();
            message = "Produto " + produto.getNome() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Produto " + produto.getNome() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }
      public void alterar(Caderno produto) {
        try {
            String sql = "UPDATE tbpcaderno SET nome= ?, preco= ?, numerodematerias= ?, marcacaderno= ? WHERE tbpcaderno.nome = ?";
            conexao = ConnectionFactory.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getPreco());
            stmt.setString(3, produto.getNumeroDeMaterias());
            stmt.setString(4, produto.getNumeroDeMaterias());
            
            
            stmt.execute();
            stmt.close();
            System.out.println("Produto " + produto.getNome() + " alterado com sucesso");
        } catch (SQLException e) {
            System.out.println("Produto " + produto.getNome() + " não foi alterado com sucesso" + e.getMessage());
        }
    }

    public Caderno pesquisar(String pesquisa) {

        Caderno produto = new Caderno();

        try {
            conexao = ConnectionFactory.getConnection();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbpcaderno where nome = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getString("preco"));
                produto.setNumeroDeMaterias(rs.getString("numerodematerias"));
                produto.setMarcaCaderno(rs.getString("marcacaderno"));
                
                
                System.out.println("TESTE 4 "+ sql);

            }
            rs.close();
            stmt.close();
            return produto;
            
        } catch (SQLException e) {
            return null; 
        }
        
    }

    public void consulta(String pesquisa) {
        Caderno produto = new Caderno();
        String message = "";
        try {
            conexao = ConnectionFactory.getConnection();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbpcaderno";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getString("preco"));
                produto.setNumeroDeMaterias(rs.getString("numerodematerias"));
                produto.setMarcaCaderno(rs.getString("marcacaderno"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void deletar(Caderno produto) {
        String message = "";
        try {
            String sql = "DELETE FROM tbpcaderno WHERE nome = ?";
            conexao = ConnectionFactory.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.execute();
            stmt.close();
            System.out.println("TESTE 5 " + produto.getNome());
            System.out.println("Produto " + produto.getNome() + " excluído com sucesso");
        } catch (SQLException e) {
            System.out.println("Produto " + produto.getNome() + "não foi excluído com sucesso" + e.getMessage());
        }
    }
}
    
    

