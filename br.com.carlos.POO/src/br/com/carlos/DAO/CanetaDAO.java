/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.carlos.DAO;

import br.com.carlos.Model.Caneta;
import br.com.carlos.Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author carlo
 */
public class CanetaDAO {
private Connection conexao;

    public CanetaDAO(Caneta caneta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     public String inserir(Caneta produto) {
        String message = "";
        try {
            String sql = "INSERT INTO tbpcaneta (nome, preco, corcaneta, tipodeponta) VALUES(?,?,?,?)";
            conexao = ConnectionFactory.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getPreco());
            stmt.setString(3, produto.getCorCaneta());
            stmt.setString(4, produto.getTipoDePonta());

            
            stmt.execute();
            stmt.close();
            message = "Produto " + produto.getNome() + " criado com sucesso";
        } catch (SQLException e) {
            message = "Produto " + produto.getNome() + " não foi criado com sucesso. erro= " + e.getMessage();
        }
        System.out.println(message);
        return message;
    }
      public void alterar(Caneta produto) {
        try {
            String sql = "UPDATE tbpcaneta SET nome= ?, preco= ?, corcaneta= ?, tipodeponta=? WHERE tbpcaneta.nome = ?";
            conexao = ConnectionFactory.getConnection();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getPreco());
            stmt.setString(3, produto.getCorCaneta());
            stmt.setString(4, produto.getTipoDePonta());

            
            stmt.execute();
            stmt.close();
            System.out.println("Produto " + produto.getNome() + " alterado com sucesso");
        } catch (SQLException e) {
            System.out.println("Produto " + produto.getNome() + " não foi alterado com sucesso" + e.getMessage());
        }
    }

    public Caneta pesquisar(String pesquisa) {

        Caneta produto = new Caneta();

        try {
            conexao = ConnectionFactory.getConnection();
            java.sql.Statement stmt = conexao.createStatement();

            String sql = "SELECT * FROM tbpcaneta where nome = '" + pesquisa + "'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getString("preco"));
                produto.setCorCaneta(rs.getString("corcaneta"));
                produto.setTipoDePonta(rs.getString("tipodeponta"));
                
                
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
        Caneta produto = new Caneta();
        String message = "";
        try {
            conexao = ConnectionFactory.getConnection();
            java.sql.Statement stmt = conexao.createStatement();
            String sql = "SELECT * FROM tbpcaneta";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                produto.setNome(rs.getString("nome"));
                produto.setPreco(rs.getString("preco"));
                produto.setCorCaneta(rs.getString("corcaneta"));
                produto.setTipoDePonta(rs.getString("tipodecaneta"));
                
                
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {

        }
    }

    public void deletar(Caneta produto) {
        String message = "";
        try {
            String sql = "DELETE FROM tbpcaneta WHERE Nome = ?";
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
    
    


