package com.mycompany.modelo;


public class Aluno extends Pessoa{
    public Aluno(Integer id, String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        
        
    }
    
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
   
}
