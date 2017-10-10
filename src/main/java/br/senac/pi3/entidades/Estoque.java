/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.entidades;

/**
 *
 * @author Joao Sergio
 */
public class Estoque {
    public String id;
    public String nome;
    public String valor;
    public String desenvolv;
    public String console;
    public String quantEstoque;
    public String cep;

    public Estoque(String id, String nome, String valor, String desenvolv, String console, String quantEstoque) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.desenvolv = desenvolv;
        this.console = console;
        this.quantEstoque = quantEstoque;
        
    }

    public Estoque(String felipe, String felipevieiragmailcom, String string, String _9_70707070, String rua_Manuel_da_Nobrega, String string0, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDesenvolv() {
        return desenvolv;
    }

    public void setDesenvolv(String desenvolv) {
        this.desenvolv = desenvolv;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(String quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

}
