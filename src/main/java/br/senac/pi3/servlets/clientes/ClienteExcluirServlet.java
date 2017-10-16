/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.clientes;

import br.senac.pi3.daos.ClienteDAO;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author allan
 */
@WebServlet(name = "ClienteExcluirServlet", urlPatterns = { "/clientes/excluir" })
public class ClienteExcluirServlet extends HttpServlet{
    
    public ClienteDAO clientesDao = new ClienteDAO();
    
    @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         
        int id = Integer.parseInt(request.getParameter("cliente"));
        clientesDao.excluir(id);
         
        response.sendRedirect(request.getContextPath() + "/clientes");
     }
}
