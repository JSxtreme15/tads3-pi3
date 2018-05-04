/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.entidades;

import java.text.NumberFormat;
import static javax.ws.rs.client.Entity.json;

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
    public Object filialId;
    public String descricao_curta;
    public String descricao_longa;
    public String imagens;
    

    public EstoqueEntidade(int id, int codigo, String nome, float valor, String desenvolvedora, String plataforma, int quantidade, String descricao_curta, String descricao_longa, String imagens) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.desenvolvedora = desenvolvedora;
        this.plataforma = plataforma;
        this.quantidade = quantidade;
        this.descricao_curta = descricao_curta;
        this.descricao_longa = descricao_longa;
        this.imagens = imagens;
    }
    
    public EstoqueEntidade(int codigo, String nome, float valor, String desenvolvedora, String plataforma, int quantidade, Object filialId,  String descricao_curta, String descricao_longa, String imagens) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.desenvolvedora = desenvolvedora;
        this.plataforma = plataforma;
        this.quantidade = quantidade;
        this.filialId = filialId;
        this.descricao_curta = descricao_curta;
        this.descricao_longa = descricao_longa;
        this.imagens = imagens;
    }
    
    public EstoqueEntidade(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Object getFilialId() {
        return filialId;
    }

    public void setFilialId(Object filialId) {
        this.filialId = filialId;
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
    
    public String getValorFormatado() {
        return NumberFormat.getCurrencyInstance().format(getValor());
    }

    public String getDescricao_curta() {
        return descricao_curta;
    }

    public void setDescricao_curta(String descricao_curta) {
        this.descricao_curta = descricao_curta;
    }

    public String getDescricao_longa() {
        return descricao_longa;
    }

    public void setDescricao_longa(String descricao_longa) {
        this.descricao_longa = descricao_longa;
    }

    public String getImagens() {
        return imagens;
    }

    public void setImagens(String imagens) {
        this.imagens = imagens;
    }

    
}
