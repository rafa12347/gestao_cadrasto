
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
                   System.out.println("***** CADASTRO DE ALUNOS *****");
                   break;
                   
                case 3:
                    System.out.println("***** LISTAR ALUNOS *****");
                    break;
                    
                case 4:
                    System.out.println("***** ALTERAR ALUNO *****");
                    break;
                
                case 5:
                    System.out.println("***** EXCLUIR ALUNO *****");
                    break;
                    
                case 6: 
                    System.out.println("***** ADICIONAR META DO ALUNO *****");
                    break;
                
                case 7: 
                    System.out.println("***** CADASTRAR PROFESSOR *****");
                    break;
                
                case 8:
                    System.out.println("");
                    
                        
        }

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
