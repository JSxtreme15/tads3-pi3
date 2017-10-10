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
            String sql = "SELECT * FROM clientes";
            PreparedStatement comando = conexao.obterConexao().prepareStatement(sql);
            
            ResultSet resultado = comando.executeQuery();
            
            while (resultado.next()) {                
                ClienteEntidade cliente = new ClienteEntidade(
                    resultado.getInt("id"),
                    resultado.getString("nome"),
                    resultado.getString("email"),
                    resultado.getString("telefone"),
                    resultado.getString("cpf"),
                    resultado.getString("cep"),
                    resultado.getString("logradouro"),
                    resultado.getString("numero")
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
}
