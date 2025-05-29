import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Fono");
        Exercicio ex = new Exercicio("Soprar bolinhas de algodão",
                                     "Usar canudo para soprar bolinhas por um caminho até um alvo",
                                     "/",
                                     2,
                                     "/");
        Exercicio ex1 = new Exercicio("Vibrar lábios",
                                      "Fazer os lábios vibrarem, como um som de motor de carro, para relaxar a musculatura e aquecer a voz",
                                      "brrrrr - som de motor");
        
        System.out.println("nome:"+ex.getNome());
        System.out.println("descrição:"+ex.getDescricao());
        System.out.println("som:"+ex.getSom());
        System.out.println("tempo mínimo:"+ex.getTempoMin());
        System.out.println("exemplo:"+ex.getExemplo());

        System.out.println("nome:"+ex1.getNome());
        System.out.println("descrição:"+ex1.getDescricao());
        System.out.println("exemplo:"+ex1.getExemplo());

        //Sabendo que os construtores e getters e setters estão prontos

        //Crie mais dois objetos exercicio - Construtor e get
        //Crie mais dois objetos clinica - Construtor e get
        //Crie mais dois objetos paciente - Construtor e get
        //Crie mais dois objetos profissional - Construtor e get

        Exercicio ex2 = new Exercicio("Apito do Navio");
        System.out.println("Nome:"+ex2.getNome());

        Clinica c1 = new Clinica("FonoTech","1234567895236");
        System.out.println(c1.getNome());
        System.out.println(c1.getCnpj());

        Profissional p1 = new Profissional("Jacobson","61987789876");
        System.out.println("nome: "+p1.getNome()+ "\ntelefone:"+p1.getTelefone());


        
     
    }
}
