package heranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pet {
    
    private String nome;
    private int peso;
    private LocalDate dataNascimento;

    
    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    public void emitirSom(){
        System.out.printf("%s emitindo som... \n" , this.nome);
    }
    
    public void exibirDados(){
        System.out.println("Dados do pet");
        System.out.println("--------------------------");
        System.out.printf("Nome: %s \n" , this.nome);
        System.out.printf("Peso: %s \n" , this.peso);
        System.out.printf("Aniversário: %s \n" , this.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("--------------------------");
    }
    
}
