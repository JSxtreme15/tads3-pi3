/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.pi3.entidades;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author allan
 */
public class VendaEntidade {

    public int id;
    public Date data;
    public ClienteEntidade cliente;
    public List<EstoqueEntidade> produtos;
    public BigDecimal valor;
    public String pagamento;

    public VendaEntidade(int id, Date data, ClienteEntidade cliente, List<EstoqueEntidade> produto, BigDecimal valor, String pagamento) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.produtos = produto;
        this.valor = valor;
        this.pagamento = pagamento;
    }
    
    public VendaEntidade(Date data, ClienteEntidade cliente, List<EstoqueEntidade> produto, BigDecimal valor, String pagamento) {
        this.data = data;
        this.cliente = cliente;
        this.produtos = produto;
        this.valor = valor;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ClienteEntidade getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidade cliente) {
        this.cliente = cliente;
    }

    public List<EstoqueEntidade> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<EstoqueEntidade> produtos) {
        this.produtos = produtos;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
    public String getValorFormatado() {
        return NumberFormat.getCurrencyInstance().format(getValor());
    }
    
    public String getDataFormatada() {
        String dataString = "dd/MM/yyyy";
        SimpleDateFormat spd = new SimpleDateFormat(dataString); 
        return spd.format(data);
    }
}
