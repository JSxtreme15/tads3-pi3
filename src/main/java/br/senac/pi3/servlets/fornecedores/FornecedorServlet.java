/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.fornecedores;

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

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        
        FornecedorEntidade fornecedor = new FornecedorEntidade("8001414", "SAMSUNG DO BRASIL LTDA", "47.474.747/0001-47");
        FornecedorEntidade fornecedor2 = new FornecedorEntidade("8001415", "APPLE DO BRASIL LTDA", "47.474.747/0001-47");
        FornecedorEntidade fornecedor3 = new FornecedorEntidade("8001416", "MOTOROLA DO BRASIL LTDA", "47.474.747/0001-47");
        
        List<FornecedorEntidade> listaFornecedores = new ArrayList<FornecedorEntidade>();
        listaFornecedores.add(fornecedor);
        listaFornecedores.add(fornecedor2);
        listaFornecedores.add(fornecedor3);
        
        request.setAttribute("fornecedor", listaFornecedores);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/fornecedorIndex.jsp");
        dispatcher.forward(request, response);
    }
}
