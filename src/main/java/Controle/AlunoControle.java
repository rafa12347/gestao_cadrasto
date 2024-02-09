/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import com.mycompany.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class AlunoControle 
    {
    public void salvar(Integer id, String nome, String cpf){
        Aluno aluno = new Aluno(id,nome,cpf);
    }
    public List<Aluno> listar()
    {
        return new ArrayList<>();
    }
    
}
