/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets;

import br.senac.pi3.entidades.ClienteEntidade;
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
@WebServlet(name = "ClienteServlet", urlPatterns = { "/clientes" })
public class ClienteServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        
        ClienteEntidade cliente = new ClienteEntidade("Felipe", "felipe.vieira@gmail.com", "551.155.515.15", "11 9 7070-7070", "Rua Manuel da Nobrega", "123", "05774-260");
        ClienteEntidade cliente2 = new ClienteEntidade("Jarvis", "tony@jarvis.com", "551.155.515.15", "11 9 7070-7070", "Rua essa", "123", "05774-260");
        ClienteEntidade cliente3 = new ClienteEntidade("Badah", "badah@jarvis.com", "551.155.515.15", "11 9 7070-7070", "Rua badah", "123", "05774-260");
        
        List<ClienteEntidade> listaClientes = new ArrayList<ClienteEntidade>();
        listaClientes.add(cliente);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        
        request.setAttribute("clientes", listaClientes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/clienteIndex.jsp");
        dispatcher.forward(request, response);
    }
}
