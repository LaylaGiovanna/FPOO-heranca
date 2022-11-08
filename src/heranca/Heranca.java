package heranca;

import java.time.LocalDate;

public class Heranca {

    public static void main(String[] args) {
       
        Pet pet = new Pet();
        pet.setNome("Gisele");
        pet.setPeso(2);
        pet.setDataNascimento(LocalDate.of(2020, 6, 12));
        pet.emitirSom();
        
        Gato gato = new Gato();
        gato.setNome("Mike");
        gato.setPeso(1);
        gato.setDataNascimento(LocalDate.of(2018, 11, 8));
        gato.setTemGarraRetratil(true);
        gato.emitirSom();
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Megg");
        cachorro.setPeso(15);
        cachorro.setDataNascimento(LocalDate.of(2018, 1, 4));
        cachorro.emitirSom();
        
        pet.exibirDados();
        gato.exibirDados();
        cachorro.exibirDados();
    }
    
}
