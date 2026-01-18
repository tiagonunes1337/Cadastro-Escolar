package Entidades;
import lombok.*;

@Getter
@Setter
public class Aluno extends Pessoa {
    String matricula;
    private double nota; 

    public Aluno(String matricula, double nota, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        
        setNota(nota); 
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) { 
            System.out.println("Erro: A nota deve estar no intervalo entre 0 e 10.");
            this.nota = 0;
            
        } else {
            this.nota = nota; 
        } 
    }

    @Override
    public String toString() {
        return "\n Aluno" + 
               "\n Nome: " + getNome() +
               "\n CPF: " + getCpf() +
               "\n Idade: " + getIdade() +
               "\n Matrícula: " + matricula + 
               "\n Nota: " + nota;
    }
}