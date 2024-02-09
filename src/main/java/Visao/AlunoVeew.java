/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visao;

import Controle.AlunoControle;
import com.mycompany.modelo.Aluno;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AlunoVeew {
    
    Scanner javain = new Scanner(System.in);
    AlunoControle controle = new AlunoControle();
    
    public void cadastrar(){
        
         Integer id;
         String nome;
         String cpf;
         
         System.out.println("***** CADASTRO DE ALUNOS *****");
         System.out.println("Digite o id do aluno: ");
         id = javain.nextInt();
         System.out.println("Digite o nome do aluno: ");
         nome = javain.nextLine();
         System.out.println("Digite o CPF");
         cpf = javain.nextLine();
         
         controle.salvar(id, nome, cpf);
        
    }
    public void listar(){
         System.out.println("***** LISTAR ALUNOS *****");
         List<Aluno>alunos = controle.listar(); 
        for (Aluno aluno : alunos) 
         {
             System.out.println("ID: " + aluno.getId());
             System.out.println("Nome: " + aluno.getNome());
             System.out.println("CPF: " + aluno.getCpf() + "\n");
         }  
    }
}
