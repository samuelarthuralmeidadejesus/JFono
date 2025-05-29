public class Paciente {    
    private int id;
    private String nome;
    private String email;
    //Métodos de Acesso
    //Log - procedimento - retorno vazio (void)
    public void setNome(String nome){
        this.nome = nome;
    }
    //Log - função - retorno String, int, double...
    public String getNome(){
        return nome;
    }
    /* diferença entre construtor e método set
     * 
     * O método não faz tudo que o construtor faz
     * Mas o construtor faz tudo que o set faz
     * 
     * metódo set - atribue valor
     * construtor - cria o objeto e atribue valor
     * 
     * método get - recupera o valor
     * 
     * toString() - método da classe Object
     * sobrescrever (polimorfismo) - reutilizar
     * Imprime as características do objeto
     * 
     * toString()  - get
     * 
     * Construtor com sobrecarga - atribuir todos
     * ou alguns.
     * 
     * Construtor - set 
     */
    //Crie o set e o get do email


}