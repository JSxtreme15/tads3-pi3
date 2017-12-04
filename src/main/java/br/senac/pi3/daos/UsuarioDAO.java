/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.daos;

import static br.senac.pi3.daos.Conexao.FecharConexao;
import static br.senac.pi3.daos.Conexao.obterConexao;
import br.senac.pi3.entidades.UsuarioEntidade;
import br.senac.pi3.entidades.UsuarioEntidade;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allan
 */
public class UsuarioDAO extends Conexao {

    public UsuarioEntidade findWhereUsername(String username) {

        try {
            String sql = "SELECT * FROM usuarios WHERE username = ?";
            PreparedStatement comando = obterConexao().prepareStatement(sql);
            comando.setString(1, username);

            ResultSet resultado = comando.executeQuery();

            if (resultado.next()) {
                UsuarioEntidade usuario = new UsuarioEntidade(
                        resultado.getString("username"),
                        resultado.getString("nome"),
                        resultado.getString("senha"),
                        resultado.getInt("filial_id"),
                        resultado.getInt("id")
                );

                return usuario;
            }

            return null;

        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            FecharConexao();
        }

        return null;
    }
    
    public UsuarioEntidade find(int id) {
        
        try {
            String sql = "SELECT * FROM usuarios WHERE id = ?";
            PreparedStatement comando = obterConexao().prepareStatement(sql);
            comando.setInt(1, id);
            
            ResultSet resultado = comando.executeQuery();
            
            if (resultado.next()) {                
                UsuarioEntidade usuario = new UsuarioEntidade(
                    resultado.getInt("id"),
                    resultado.getString("nome"),
                    resultado.getString("email"),
                    resultado.getString("telefone"),
                    resultado.getString("username"),
                    resultado.getString("senha"),
                    resultado.getInt("filial_id")
                );
                
                return usuario;
            }
            
            return null;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            FecharConexao();
        }
        
        return null;
    }
}
