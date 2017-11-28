/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets.suporte;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.internet.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author allan
 */
@WebServlet(name = "SuporteServlet", urlPatterns = {"/suporte"})
public class SuporteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String Assunto = request.getParameter("Assunto");
        String Mensagem = request.getParameter("Mensagem");

        // Recipient's email ID needs to be mentioned.
        String to = "tardis.suporte@gmail.com";

        // Sender's email ID needs to be mentioned
        String from = "tardis.suporte@gmail.com";

      // Assuming you are sending email from localhost
      String host = "localhost";
 
      // Get system properties
      Properties properties = System.getProperties();
 
      // Setup mail server
      properties.setProperty("mail.smtp.host", host);

        // Get the default Session object.
        Session session = Session.getDefaultInstance(properties);

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            // Set Subject: header field
            message.setSubject(request.getParameter("Assunto"));

            // Now set the actual message
            message.setText(request.getParameter("Mensagem"));

            // Send message
            Transport.send(message);
            
        }  catch (javax.mail.MessagingException ex) {
            System.out.println(ex.getStackTrace());
        }

            response.sendRedirect(request.getContextPath() + "/telaInicial?enviado=true");
        }
    }
