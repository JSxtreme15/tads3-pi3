/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.servlets;

import br.senac.pi3.entidades.Estoque;
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
@WebServlet(name = "EstoqueServlet", urlPatterns = {"/estoques"})
public class EstoqueServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");

        Estoque estoque = new Estoque("9010234","Crash Bandicoot Trilogy","149.9","Activision","Play Station 4","200");
        Estoque estoque1 = new Estoque("9411397","Horizon","164.49","Guerrilla","Play Station 4","400");
        Estoque estoque2 = new Estoque("9651605","Street Fighter V","149.99","CAPCOM","Play Station 4","200");
        Estoque estoque3 = new Estoque("9370768","Fifa 17","149.99","EA Sports","Play Station 4","400");
        Estoque estoque4 = new Estoque("9369458","The Witcher III","129.9","CD Projekt RED","Play Station 4","400");
        Estoque estoque5 = new Estoque("9639978","Injustice 2","249.9","NetherRealm Studios","Play Station 4","400");
        Estoque estoque6 = new Estoque("9440273","Persona 5","229.9","ATLUS","Play Station 4","200");
        Estoque estoque7 = new Estoque("9131985","Overwatch","179.9","Blizzard","Play Station 4","500");
        Estoque estoque8 = new Estoque("9395587","Resident Evil 7","219.9","CAPCOM","Play Station 4","600");
        Estoque estoque9 = new Estoque("9351268","Final Fantasy XV","249.9","SQUARE ENIX","Play Station 4","500");
        Estoque estoque10 = new Estoque("9523460","Outlast 2","149.9","Red Barrels","Play Station 4","500");
        Estoque estoque11 = new Estoque("9363084","PES 2017","129.9","KONAMI","Play Station 4","200");
        Estoque estoque12 = new Estoque("9370771","Fifa 17","149.9","EA Sports","Xbox One","400");
        Estoque estoque13 = new Estoque("9369461","The Witcher III","129.9","CD Projekt RED","Xbox One","400");
        Estoque estoque14 = new Estoque("9319839","Overwatch","199.9","Blizzard","Xbox One","500");
        Estoque estoque15 = new Estoque("9416811","Ghost Recon","149.9","UBISOFT","Xbox One","200");
        Estoque estoque16 = new Estoque("9384447","Watch Dogs 2","149.9","UBISOFT","Xbox One","200");
        Estoque estoque17 = new Estoque("9479054","Dark Souls III","199.9","Bandai Namco","Xbox One","200");
        Estoque estoque18 = new Estoque("9414777","For Honnor","159.9","UBISOFT","Xbox One","400");
        Estoque estoque19 = new Estoque("9487967","Injuntice 2","249.9","NetherRealm Studios","Xbox One","400");
        Estoque estoque20 = new Estoque("9369420","Gears of War 4","99.9","The Coalition","Xbox One","200");
        Estoque estoque21 = new Estoque("9351269","Final Fantasy XV","249.9","Squarce Enix","Xbox One","500");
        Estoque estoque22 = new Estoque("9280736","Mortal Kombat XL","129.9","NetherRealm Studios","Xbox One","200");
        Estoque estoque23 = new Estoque("9395590","Resident Evil 7","219.9","CAPCOM","Xbox One","500");
        Estoque estoque24 = new Estoque("9258976","The Division","99.9","UBISOFT","Xbox One","200");
        Estoque estoque25 = new Estoque("9153641","Just Dance 2017","149.9","UBISOFT","Xbox One","400");
        Estoque estoque26 = new Estoque("9380186", "Titanfall 2", "149.9", "EA Sports", "Xbox One", "400");
        Estoque estoque27 = new Estoque("9168486", "Rainbow Six Siege","129.9","UBISOFT","Play Station 4","400");
        Estoque estoque28 = new Estoque("9168487","Rainbow Six Siege","129.9","UBISOFT","Xbox One","400");
        Estoque estoque29 = new Estoque("9346537","Mario & Sonic - At The Rio 2016 Olympic Games","199.9","Nintendo","Wii U","200");
        Estoque estoque30 = new Estoque("9589296","New Super Mario Bros.U","199.9","Nintendo","Wii U","200");
        Estoque estoque31 = new Estoque("9824057","Super Smash Bros","169.9","Nintendo","Wii U","200");
        Estoque estoque32 = new Estoque("9526824","New Super Luigi.U","199.9","Nintendo","Wii U","200");
        Estoque estoque33 = new Estoque("9602978","Logo City Undercover","99.9","Nintendo","Wii U","200");
        Estoque estoque34 = new Estoque("9373776","Star Fox Zero","99.9","Nintendo","Wii U","200");
        Estoque estoque35 = new Estoque("9743226","The Legend of Zelda: Breath of the Wild","299.9","Nintendo","Wii U","500");

        List<Estoque> listaEstoque = new ArrayList<Estoque>();
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
        

        request.setAttribute("estoques", listaEstoque);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/estoqueIndex.jsp");
        dispatcher.forward(request, response);
    }
}
