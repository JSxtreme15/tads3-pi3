/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.vendas;

import br.senac.pi3.daos.EstoqueDAO;
import br.senac.pi3.daos.VendaDAO;
import br.senac.pi3.entidades.ClienteEntidade;
import br.senac.pi3.entidades.EstoqueEntidade;
import br.senac.pi3.entidades.VendaEntidade;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
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
@WebServlet(name = "VendaServlet", urlPatterns = {"/protegido/vendas"})
public class VendaServlet extends HttpServlet {

    public EstoqueDAO estoqueDao = new EstoqueDAO();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("aqui");
        if (VendaDAO.vendas.isEmpty()) {
            List<EstoqueEntidade> produtos = estoqueDao.todos();
            ClienteEntidade cliente = new ClienteEntidade(1, "Allan Santos", "allanzi@hotmail.com", "424.768.828-60", "(11) 95802-6276", "Rua Cipolandia", 178, "05774-260");
            VendaEntidade venda1 = new VendaEntidade(1, new Date(), cliente, produtos, new BigDecimal("6171.21"), "Cartão de Débito");
            VendaEntidade venda2 = new VendaEntidade(1, new Date(), cliente, produtos, new BigDecimal("6171.21"), "Cartão de Débito");
            VendaEntidade venda3 = new VendaEntidade(1, new Date(), cliente, produtos, new BigDecimal("6171.21"), "Cartão de Débito");
            VendaEntidade venda4 = new VendaEntidade(1, new Date(), cliente, produtos, new BigDecimal("6171.21"), "Cartão de Débito");
            VendaDAO.vendas.add(venda1);
            VendaDAO.vendas.add(venda2);
            VendaDAO.vendas.add(venda3);
            VendaDAO.vendas.add(venda4);
        }

        request.setAttribute("vendas", VendaDAO.vendas);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/vendaIndex.jsp");
        dispatcher.forward(request, response);
    }
}
