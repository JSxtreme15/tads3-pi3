/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets;

import br.senac.pi3.entidades.EstoqueEntidade;
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
 * @author Joao Sergio
 */
@WebServlet(name = "EstoqueServlet", urlPatterns = {"/estoque"})
public class EstoqueServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");

        EstoqueEntidade estoque = new EstoqueEntidade("9010234","Crash Bandicoot Trilogy","149.9","Activision","Play Station 4","200");
        EstoqueEntidade estoque1 = new EstoqueEntidade("9411397","Horizon","164.49","Guerrilla","Play Station 4","400");
        EstoqueEntidade estoque2 = new EstoqueEntidade("9651605","Street Fighter V","149.99","CAPCOM","Play Station 4","200");
        EstoqueEntidade estoque3 = new EstoqueEntidade("9370768","Fifa 17","149.99","EA Sports","Play Station 4","400");
        EstoqueEntidade estoque4 = new EstoqueEntidade("9369458","The Witcher III","129.9","CD Projekt RED","Play Station 4","400");
        EstoqueEntidade estoque5 = new EstoqueEntidade("9639978","Injustice 2","249.9","NetherRealm Studios","Play Station 4","400");
        EstoqueEntidade estoque6 = new EstoqueEntidade("9440273","Persona 5","229.9","ATLUS","Play Station 4","200");
        EstoqueEntidade estoque7 = new EstoqueEntidade("9131985","Overwatch","179.9","Blizzard","Play Station 4","500");
        EstoqueEntidade estoque8 = new EstoqueEntidade("9395587","Resident Evil 7","219.9","CAPCOM","Play Station 4","600");
        EstoqueEntidade estoque9 = new EstoqueEntidade("9351268","Final Fantasy XV","249.9","SQUARE ENIX","Play Station 4","500");
        EstoqueEntidade estoque10 = new EstoqueEntidade("9523460","Outlast 2","149.9","Red Barrels","Play Station 4","500");
        EstoqueEntidade estoque11 = new EstoqueEntidade("9363084","PES 2017","129.9","KONAMI","Play Station 4","200");
        EstoqueEntidade estoque12 = new EstoqueEntidade("9370771","Fifa 17","149.9","EA Sports","Xbox One","400");
        EstoqueEntidade estoque13 = new EstoqueEntidade("9369461","The Witcher III","129.9","CD Projekt RED","Xbox One","400");
        EstoqueEntidade estoque14 = new EstoqueEntidade("9319839","Overwatch","199.9","Blizzard","Xbox One","500");
        EstoqueEntidade estoque15 = new EstoqueEntidade("9416811","Ghost Recon","149.9","UBISOFT","Xbox One","200");
        EstoqueEntidade estoque16 = new EstoqueEntidade("9384447","Watch Dogs 2","149.9","UBISOFT","Xbox One","200");
        EstoqueEntidade estoque17 = new EstoqueEntidade("9479054","Dark Souls III","199.9","Bandai Namco","Xbox One","200");
        EstoqueEntidade estoque18 = new EstoqueEntidade("9414777","For Honnor","159.9","UBISOFT","Xbox One","400");
        EstoqueEntidade estoque19 = new EstoqueEntidade("9487967","Injuntice 2","249.9","NetherRealm Studios","Xbox One","400");
        EstoqueEntidade estoque20 = new EstoqueEntidade("9369420","Gears of War 4","99.9","The Coalition","Xbox One","200");
        EstoqueEntidade estoque21 = new EstoqueEntidade("9351269","Final Fantasy XV","249.9","Squarce Enix","Xbox One","500");
        EstoqueEntidade estoque22 = new EstoqueEntidade("9280736","Mortal Kombat XL","129.9","NetherRealm Studios","Xbox One","200");
        EstoqueEntidade estoque23 = new EstoqueEntidade("9395590","Resident Evil 7","219.9","CAPCOM","Xbox One","500");
        EstoqueEntidade estoque24 = new EstoqueEntidade("9258976","The Division","99.9","UBISOFT","Xbox One","200");
        EstoqueEntidade estoque25 = new EstoqueEntidade("9153641","Just Dance 2017","149.9","UBISOFT","Xbox One","400");
        EstoqueEntidade estoque26 = new EstoqueEntidade("9380186", "Titanfall 2", "149.9", "EA Sports", "Xbox One", "400");
        EstoqueEntidade estoque27 = new EstoqueEntidade("9168486", "Rainbow Six Siege","129.9","UBISOFT","Play Station 4","400");
        EstoqueEntidade estoque28 = new EstoqueEntidade("9168487","Rainbow Six Siege","129.9","UBISOFT","Xbox One","400");
        EstoqueEntidade estoque29 = new EstoqueEntidade("9346537","Mario & Sonic - At The Rio 2016 Olympic Games","199.9","Nintendo","Wii U","200");
        EstoqueEntidade estoque30 = new EstoqueEntidade("9589296","New Super Mario Bros.U","199.9","Nintendo","Wii U","200");
        EstoqueEntidade estoque31 = new EstoqueEntidade("9824057","Super Smash Bros","169.9","Nintendo","Wii U","200");
        EstoqueEntidade estoque32 = new EstoqueEntidade("9526824","New Super Luigi.U","199.9","Nintendo","Wii U","200");
        EstoqueEntidade estoque33 = new EstoqueEntidade("9602978","Logo City Undercover","99.9","Nintendo","Wii U","200");
        EstoqueEntidade estoque34 = new EstoqueEntidade("9373776","Star Fox Zero","99.9","Nintendo","Wii U","200");
        EstoqueEntidade estoque35 = new EstoqueEntidade("9743226","The Legend of Zelda: Breath of the Wild","299.9","Nintendo","Wii U","500");

        List<EstoqueEntidade> listaEstoque = new ArrayList<EstoqueEntidade>();
        listaEstoque.add(estoque);
        listaEstoque.add(estoque1);
        listaEstoque.add(estoque2);
        listaEstoque.add(estoque3);
        listaEstoque.add(estoque4);
        listaEstoque.add(estoque5);
        listaEstoque.add(estoque6);
        listaEstoque.add(estoque7);
        listaEstoque.add(estoque8);
        listaEstoque.add(estoque9);
        listaEstoque.add(estoque10);
        listaEstoque.add(estoque11);
        listaEstoque.add(estoque12);
        listaEstoque.add(estoque13);
        listaEstoque.add(estoque14);
        listaEstoque.add(estoque15);
        listaEstoque.add(estoque16);
        listaEstoque.add(estoque17);
        listaEstoque.add(estoque18);
        listaEstoque.add(estoque19);
        listaEstoque.add(estoque20);
        listaEstoque.add(estoque21);
        listaEstoque.add(estoque22);
        listaEstoque.add(estoque23);
        listaEstoque.add(estoque24);
        listaEstoque.add(estoque25);
        listaEstoque.add(estoque26);
        listaEstoque.add(estoque27);
        listaEstoque.add(estoque28);
        listaEstoque.add(estoque29);
        listaEstoque.add(estoque30);
        listaEstoque.add(estoque31);
        listaEstoque.add(estoque32);
        listaEstoque.add(estoque33);
        listaEstoque.add(estoque34);
        listaEstoque.add(estoque35);
        

        request.setAttribute("estoque", listaEstoque);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/estoqueIndex.jsp");
        dispatcher.forward(request, response);
    }
}
