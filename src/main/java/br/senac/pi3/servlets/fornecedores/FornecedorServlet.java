/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.fornecedores;

import br.senac.pi3.daos.FornecedorDAO;
import br.senac.pi3.entidades.FornecedorEntidade;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author allan
 */
@WebServlet(name = "FornecedorServlet", urlPatterns = { "/fornecedores" })
public class FornecedorServlet extends HttpServlet {
    
    public FornecedorDAO fornecedorDao = new FornecedorDAO();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("fornecedores", fornecedorDao.todos());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/fornecedorIndex.jsp");
        dispatcher.forward(request, response);
    }
}
