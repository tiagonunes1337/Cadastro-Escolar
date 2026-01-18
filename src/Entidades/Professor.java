
package Entidades;

import lombok.*;

@Getter
@Setter

public class Professor extends Pessoa {
    String matricula;
    private double salario;

    public Professor(String matricula, double salario, String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.salario = salario;
        
        setIdade(idade); 
        setSalario(salario);
    }
    
    public void setIdade(int idade){
        if(idade < 18){
            System.out.println("Erro: A idade está incompatível para função de professor.");
            this.idade = 18;
        }else {
            this.idade = idade;
        }
    }
    
    public void setSalario(double salario){
        if(salario < 2000){
            System.out.println("Erro: O salário está incompatível para função de professor.");
            this.salario = 2000;
        }else {
            this.salario = salario;
        }
    }
    

    @Override
    public String toString() {
        return  
                
                "\n  Professor " + 
                "\n Nome: " + getNome() +
                "\n CPF: " + getCpf() +
                "\n Idade: " + getIdade() +
                "\n Matricula: " + matricula + 
                "\n Salário: " + salario;
    }
    
    
    
}
