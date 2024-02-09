
import Visao.AlunoVeew;
import com.mycompany.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class Gestao {

    static Scanner javain = new Scanner(System.in);

    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        menu();
        
        int opcao;
        
        do{
            System.out.println("Digite a opção: ");
            opcao = javain.nextInt();
            
            switch (opcao) {
                case 0:
                    System.out.println("***** PROGRAMA ENCERRADO *****");
                    break;
                
                case 1:
                    
                   AlunoVeew alunoveew = new AlunoVeew();
                   alunoveew.cadastrar();
                   
                   //alunos.add(a);
                   break;
                  
                   
                case 2:
                    
                    AlunoVeew alunovew = new AlunoVeew();
                    alunovew.listar();
                    
                    break;
                    
                case 3:
                    System.out.println("***** ALTERAR ALUNO *****");
                    
                    System.out.println("Digite a id do aluno: ");
                    Integer idAluno = javain.nextInt();
                    Boolean encontrou = false;
                    
                    for (Aluno aluno : alunos) {
                        if (aluno.getId() == idAluno) 
                        {
                            javain.nextLine();
                            System.out.println("Digite o nome: ");
                            aluno.setNome(javain.nextLine());
                            System.out.println("Digite o CPF: ");
                            aluno.setCpf(javain.nextLine());
                            encontrou = true;
                        }
                    }
                    break;
                
              //  case 4:
                  //  System.out.println("***** EXCLUIR ALUNO *****");
                    //Integer posicao = buscarAlunoById(alunos);
                  //  if(posicao!=null)
                   // {
                    //    alunos.remove(alunos.get(posicao));
                    //    System.out.println("ALUNO EXCLUÍDO COM SUCESSO!");
                   // }
                    //else
                  //  {
                    //    System.out.println("ALUNO NÃO ENCONTRADO!");
                  //  }
               //     break;
                    
                case 5: 
                    System.out.println("***** ADICIONAR META DO ALUNO *****");
                    break;
                
                case 6: 
                    System.out.println("***** CADASTRAR PROFESSOR *****");
                    break;
                
                case 7:
                    System.out.println("***** ALTERAR PROFESSOR *****");
                    break;
                    
                case 8:
                    System.out.println("***** EXCLUIR PROFESSOR *****");
                    break;
                    
                case 9:
                    System.out.println("***** CRIAR TREINO *****");
                    break;
                    
                case 10:
                    System.out.println("***** ALTERAR TREINO *****");
                    break;
                  
                case 11:
                    System.out.println("***** EXCLUIR TREINO *****");
                    break;
                
                case 12:
                    System.out.println("***** ADICIONAR DADOS DE BIOIMPEDANCIA *****");
                    break;
                    
                case 13:
                    System.out.println("***** ALTERAR BIOIMPEDANCIA *****");
                    break; 
                    
                case 14:
                    System.out.println("***** MOSTRAR DADOS GERAIS DO ALUNO *****");
                    break;
        }

    }while (opcao != 0);
   }
 

    private static void menu() {
        System.out.println("----- MENU -------");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Listar Alunos");
        System.out.println("3 - Alterar Aluno");
        System.out.println("4 - Excluir Aluno");
        System.out.println("5 - Adicionar Meta do Aluno");
        System.out.println("6 - Cadastrar Professor");
        System.out.println("7 - Alterar Professor");
        System.out.println("8 - Excluir Professor");
        System.out.println("9 - Criar Treino");
        System.out.println("10 - Alterar Treino");
        System.out.println("11 - Excluir Treino");
        System.out.println("12 - Adicionar dados de Bioimpedancia");
        System.out.println("13 - Alterar Bioimpedancia do aluno");
        System.out.println("14 - Mostrar Dados Gerais do Aluno");

    }
}
    
    // private static Integer buscarAlunoById(List<Aluno> alunos)
     //{
     //   Integer posicao = null;
       // System.out.println("Digite a id do aluno: ");
       // Integer idAluno = javain.nextInt();
       // javain.nextLine();
       
         //for(int i=0; i<alunos.size(); i++)
         //{    
             //Aluno aluno = alunos.get(i);
             
             //if (aluno.getId().equals(idAluno))
            // {
               //  posicao = i;
                // break;
            // }
            // else {
             //}
     // }
       // return posicao;
   // }
//}
