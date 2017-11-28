/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.suporte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;



/**
 *
 * @author allan
 */
@WebServlet(name = "SuporteServlet", urlPatterns = {"/suporte"})
public class SuporteServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {
            request.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            String Assunto = request.getParameter("Assunto");
            String Mensagem = request.getParameter("Mensagem");
            enviaEmail();
        } catch (EmailException ex) {
            Logger.getLogger(SuporteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void enviaEmail() throws EmailException{
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setFrom("tardis.suporte@gmail.com");
        email.addTo("tardis.suporte@gmail.com");
        email.setSubject("teste");
        email.setMsg("teste");
        email.setSSL(true);
        email.setAuthentication("tardis.suporte@gmail.com", "tardis123");
        email.send();
}}
