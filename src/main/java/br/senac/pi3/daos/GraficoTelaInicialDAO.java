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
public class GraficoTelaInicialDAO extends Conexao{
    
    public String[] todos() {        
        try {
            String sql = "select pro.plataforma, DATE_FORMAT(ved.data, '%m/%Y') as dt_Ref, cast(sum(ved.valor) as decimal(10,2)) as vl_total from vendas as ved inner join venda_estoque est on est.venda_id = ved.id inner join estoque pro on pro.id = est.estoque_id group by pro.plataforma, DATE_FORMAT(ved.data, '%m/%Y') order by YEAR(ved.data) asc, MONTH(ved.data) asc;";
            PreparedStatement comando = obterConexao().prepareStatement(sql);
            
            ResultSet resultado = comando.executeQuery();
            
            int contador = 0;
            String[] plataforma = new String[12];
            String[] data = new String[12];
            String[] valor = new String[12];
            
            while (resultado.next()) {                
                plataforma[contador] = resultado.getString("plataforma");
                data[contador] = resultado.getString("dt_Ref");
                valor[contador] = resultado.getString("vl_total");
                System.out.println(plataforma[contador]);
                System.out.println(data[contador]);
                System.out.println(valor[contador]);
                
                contador++;
                
            }
            
            return dados;
            
        } catch (SQLException ex) {
            Logger.getLogger(GraficoTelaInicialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            FecharConexao();
        }
        
        return null;
    }
}
