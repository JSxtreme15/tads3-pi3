/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.daos;

import br.senac.pi3.entidades.ClienteEntidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allan
 */
public class ClienteDAO {
    
    public Conexao conexao = new Conexao();
    
    public List<ClienteEntidade> todos() {
        List<ClienteEntidade> clientes = new ArrayList<ClienteEntidade>();
        
        try {
            String sql = "SELECT * FROM clientes ORDER BY id DESC";
            PreparedStatement comando = conexao.obterConexao().prepareStatement(sql);
            
            ResultSet resultado = comando.executeQuery();
            
            while (resultado.next()) {                
                ClienteEntidade cliente = new ClienteEntidade(
                    resultado.getInt("id"),
                    resultado.getString("nome"),
                    resultado.getString("email"),
                    resultado.getString("cpf"),
                    resultado.getString("telefone"),
                    resultado.getString("logradouro"),
                    resultado.getInt("numero"),
                    resultado.getString("cep")
                );
                
                clientes.add(cliente);
            }
            
            return clientes;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.FecharConexao();
        }
        
        return null;
    }
    
    public boolean cadastrar(ClienteEntidade cliente) {
        try {
            String sql = "INSERT INTO clientes (nome, email, telefone, cpf, cep, logradouro, numero) values(?,?,?,?,?,?,?);";
            PreparedStatement comando = conexao.obterConexao().prepareStatement(sql);

            comando.setString(1, cliente.getNome());
            comando.setString(2, cliente.getEmail());
            comando.setString(3, cliente.getTelefone());
            comando.setString(4, cliente.getCpf());
            comando.setString(5, cliente.getCep());
            comando.setString(6, cliente.getLogradouro());
            comando.setInt(7, cliente.getNumeroResidencia());

            comando.execute();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conexao.FecharConexao();
        }
        
        return false;
    }
}
