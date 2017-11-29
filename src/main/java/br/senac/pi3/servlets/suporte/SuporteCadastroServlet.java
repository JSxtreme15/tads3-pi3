/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.suporte;

import br.senac.pi3.servlets.suporte.*;
import br.senac.pi3.daos.SuporteDAO;
import br.senac.pi3.entidades.SuporteEntidade;
import java.io.IOException;
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
@WebServlet(name = "SuporteesServletNovoChamado", urlPatterns = { "/protegido/suporte/novoChamado" })
public class SuporteCadastroServlet extends HttpServlet{
    
    public SuporteDAO suporte1Dao = new SuporteDAO();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/suporteCreate.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        
        SuporteEntidade novoSuporte = new SuporteEntidade(nome, email, telefone);
        suporte1Dao.cadastrar(novoSuporte);
        
        response.sendRedirect(request.getContextPath() + "/protegido/suporte");
    }
}
