/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import com.mycompany.modelo.Aluno;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Pagamento {
    
    private Date validade;
    private Aluno usuarioapagar;
    private String formadepagamento;

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public Aluno getUsuarioapagar() {
        return usuarioapagar;
    }

    public void setUsuarioapagar(Aluno usuarioapagar) {
        this.usuarioapagar = usuarioapagar;
    }

    public String getFormadepagamento() {
        return formadepagamento;
    }

    public void setFormadepagamento(String formadepagamento) {
        this.formadepagamento = formadepagamento;
    }
    
    
    
    
    
}
