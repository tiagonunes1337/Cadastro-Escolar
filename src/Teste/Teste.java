package Teste;
import Entidades.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Teste {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        entrada.useLocale(java.util.Locale.US); 
        
        System.out.println("--- CADASTRO DE PROFESSOR ---");
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite a matricula: ");
        String matricula = entrada.nextLine();
        
        System.out.print("Digite o CPF: ");
        String cpf = entrada.nextLine();
        
        double salario;
        do {
            System.out.print("Digite o Salário (Mínimo R$ 2000): ");
            salario = entrada.nextDouble();

            if (salario < 2000) {
                System.out.println("Erro: O salário está incompatível para função de professor.");
            }
        } while (salario < 2000); 
        
        int idade; 
        do  { 
            System.out.println("Digite a idade (NÃO PODE SER MENOR QUE 18): ");
            idade = entrada.nextInt();
            if(idade < 18) {
                System.out.println("Erro: A idade está incompatível para função de professor.");
            }
    } while(idade < 18);
        
        

        entrada.nextLine(); 
        
        Professor p = new Professor(matricula, salario, nome, cpf, idade);

        String opcao = ""; 
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        while (!opcao.equalsIgnoreCase("sair")) {
            System.out.println("\n--- CADASTRO DO ALUNO ---");

            System.out.print("Digite o nome do aluno: ");
            nome = entrada.nextLine(); 

            System.out.print("Digite a matricula do aluno: ");
            matricula = entrada.nextLine();

            System.out.print("Digite o CPF do aluno: ");
            cpf = entrada.nextLine();
            double nota;
            do {
                
                System.out.println("Digite a nota do aluno(Tem que ser no intervalo de 0 a 10): ");
                nota = entrada.nextDouble();
                if (nota < 0 || nota > 10){
                    System.out.println("Erro: A nota deve estar no intervalo entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            System.out.print("Digite a idade do aluno: ");
            idade = entrada.nextInt();

            entrada.nextLine(); 

            Aluno a = new Aluno(matricula, nota, nome, cpf, idade);
            
            listaAlunos.add(a); /// Para guardar os alunos na lista
            ///Criterios de notas
            if(nota >= 6.0) {
                System.out.println("Status: Aprovado.");
            } else if (nota >= 3.5 && nota < 6.0) {
                System.out.println("Status: De recuperação!");
            } else {
                System.out.println("Status: Reprovado.");
            }
            
            System.out.println("\n--- Dados do Aluno Cadastrado ---");
            System.out.println(a);
            
            System.out.println("\nDeseja continuar? Digite qualquer coisa.");
            System.out.print("Se for sair, digite 'sair': ");
            opcao = entrada.nextLine(); 
        }
        
        System.out.println("\n========= RELATÓRIO FINAL =========");
        System.out.println("Professor Responsável: " + p.getNome());
        System.out.println("Total de alunos cadastrados: " + listaAlunos.size());
        
        System.out.println("\n--- LISTA DE ALUNOS ---");
        
        for (Aluno aluno : listaAlunos)  { ///alunos guardados na lista de listaAlunos 
            System.out.println(aluno);
            System.out.println("-------------------------");
        }
        
        System.out.println("\n--- ALUNOS APROVADOS ---");
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNota() >= 6.0) {
                System.out.println("Nome: " + aluno.getNome() + " | Nota: " + aluno.getNota());
            }
        }

        System.out.println("\n--- ALUNOS EM RECUPERAÇÃO ---");
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNota() >= 3.5 && aluno.getNota() < 6.0) {
                System.out.println("Nome: " + aluno.getNome() + " | Nota: " + aluno.getNota());
            }
        }

        System.out.println("\n--- ALUNOS REPROVADOS ---");
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNota() < 3.5) {
                System.out.println("Nome: " + aluno.getNome() + " | Nota: " + aluno.getNota());
            }
        }

        System.out.println("\n--- Dados do Professor ---");
        System.out.println(p);
        
        System.out.println("Sistema finalizado com sucesso.");
        entrada.close();
    }
}