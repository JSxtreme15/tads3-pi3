/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.inicio;

import br.senac.pi3.daos.GraficoTelaInicialDAO;
import java.io.IOException;
import java.util.Arrays;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kaio.hvsantos
 */
@WebServlet(name = "TelaInicial", urlPatterns = {"/protegido/telaInicial"})
public class TelaInicialServlet extends HttpServlet {

    GraficoTelaInicialDAO dao = new GraficoTelaInicialDAO();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/telaInicial.jsp");
         request.setAttribute("dadoPS4", dao.todos());
         request.setAttribute("dadoWii", dao.todos());
         request.setAttribute("dadoXboxOne", dao.todos());
        dispatcher.forward(request, response);

    }


   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        RequestDispatcher dispatcher
                    = request.getRequestDispatcher("/WEB-INF/jsp/telaInicial.jsp");
            dispatcher.forward(request, response);
    }

}
