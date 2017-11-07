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
public class EstoqueEntidade {
    public int id;
    public int codigo;
    public String nome;
    public float valor;
    public String desenvolvedora;
    public String plataforma;
    public int quantidade;

    public EstoqueEntidade(int id, int codigo, String nome, float valor, String desenvolvedora, String plataforma, int quantidade) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.desenvolvedora = desenvolvedora;
        this.plataforma = plataforma;
        this.quantidade = quantidade;
    }
    
    public EstoqueEntidade(int codigo, String nome, float valor, String desenvolvedora, String plataforma, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.desenvolvedora = desenvolvedora;
        this.plataforma = plataforma;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}