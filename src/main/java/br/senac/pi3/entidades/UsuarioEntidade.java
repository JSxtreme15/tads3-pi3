/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.entidades;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author kaio henrique
 */
public final class UsuarioEntidade {

    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String username;
    private String hashSenha;
    private int filialId;
    private List<String> papeis;

    public UsuarioEntidade(int id, String nome, String email, String telefone, String username, String hashSenha, int filialId) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.username = username;
        this.hashSenha = hashSenha;
        this.filialId = filialId;
    }

    public UsuarioEntidade(String nomeCompleto, String username, String senha, List<String> papeis, int filial_id) {
        this.nome = nomeCompleto;
        this.username = username;
        setSenha(senha);
        this.papeis = papeis;
        this.filialId = filial_id;
    }

    public UsuarioEntidade(String username, String nome, String senha, int filial_id, int id) {
        this.username = username;
        this.nome = nome;
        this.hashSenha = senha;
        this.filialId = filial_id;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFilialId() {
        return filialId;
    }

    public void setFilialId(int filialId) {
        this.filialId = filialId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashSenha() {
        return hashSenha;
    }

    public void setHashSenha(String hashSenha) {
        this.hashSenha = hashSenha;
    }

    public void setSenha(String senha) {
        this.hashSenha = BCrypt.hashpw(senha, BCrypt.gensalt());
    }

    public List<String> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<String> papeis) {
        this.papeis = papeis;
    }

    public boolean verificarSenha(String senha) {
        return BCrypt.checkpw(senha, hashSenha);
    }

    public boolean temPapel(String papel) {
        return papeis.contains(papel);
    }

}
