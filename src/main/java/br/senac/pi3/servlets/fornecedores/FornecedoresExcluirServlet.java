/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.fornecedores;


import br.senac.pi3.daos.FornecedorDAO;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author allan
 */
@WebServlet(name = "FornecedorExcluirServlet", urlPatterns = { "/fornecedores/excluir" })
public class FornecedoresExcluirServlet extends HttpServlet{
    
    public FornecedorDAO fornecedoresDao = new FornecedorDAO();
    
    @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         
        int id = Integer.parseInt(request.getParameter("id"));
        fornecedoresDao.excluir(id);
         
        response.sendRedirect(request.getContextPath() + "/fornecedores");
     }
}
