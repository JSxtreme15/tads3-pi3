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

    private String nome;
    private String email;
    private String telefone;
    private String username;
    private String hashSenha;
    private List<String> papeis;

    public UsuarioEntidade(String nomeCompleto, String username, String senha, List<String> papeis) {
        this.nome = nomeCompleto;
        this.username = username;
        setSenha(senha);
        this.papeis = papeis;
    }

    public UsuarioEntidade(String username, String nome, String senha) {
        this.username = username;
        this.nome = nome;
        this.hashSenha = senha;
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
