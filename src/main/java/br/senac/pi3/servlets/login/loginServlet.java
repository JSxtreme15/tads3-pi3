/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package br.senac.pi3.servlets.login;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class loginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
    RequestDispatcher dispatcher
	    = request.getRequestDispatcher("/WEB-INF/login.jsp");
    dispatcher.forward(request, response);

  }  
  

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
    String username = request.getParameter("username");
    String senha = request.getParameter("senha");

    UsuarioSistemaService service = new UsuarioSistemaServiceMock();
    UsuarioSistema usuario = null;
    
      try {
          usuario = service.autenticar(username, senha);
      } catch (UnsupportedOperationException e) {
      }
    
    if (usuario != null) {
      HttpSession sessao = request.getSession();
      sessao.setAttribute("usuario", usuario);
      response.sendRedirect(request.getContextPath() + "/telaInicial");
    } else {
      request.setAttribute("mensagemErro", "Usuário ou senha inválido");
      RequestDispatcher dispatcher
	      = request.getRequestDispatcher("/WEB-INF/login.jsp");
    }
    
    
    HttpSession sessao = request.getSession();
    sessao.setAttribute("username", username);
    if ("fodao".equals(username) && "1234".equals(senha)) {
      sessao.setAttribute("nome", "Usuário Fodão");
      response.sendRedirect(request.getContextPath() + "/telaInicial");
    } else if ("fodinha".equals(username) && "1234".equals(senha)) {
      sessao.setAttribute("nome", "Usuário Fodinha");
      response.sendRedirect(request.getContextPath() + "/telaInicial");
    } else if ("normal".equals(username) && "1234".equals(senha)) {
      sessao.setAttribute("nome", "Usuário Normal");
      response.sendRedirect(request.getContextPath() + "/telaInicial");
    } else { // Usuario inválido
      request.setAttribute("mensagemErro", "Usuário ou senha inválido");
      RequestDispatcher dispatcher
	      = request.getRequestDispatcher("/WEB-INF/login.jsp");
      dispatcher.forward(request, response);
    }
     
  }

    private static class UsuarioSistemaService {

        public UsuarioSistemaService() {
        }

        private UsuarioSistema autenticar(String username, String senha) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class UsuarioSistema {

        public UsuarioSistema() {
        }
    }

    private static class UsuarioSistemaServiceMock extends UsuarioSistemaService {

        public UsuarioSistemaServiceMock() {
        }
    }

}