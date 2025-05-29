public class Exercicio {
    private int id;
    private String nome;
    private String descricao;
    private String som;
    private int tempoMin; 
    private String exemplo; 

  

    public Exercicio(){

    }
    
    //tecla CTRL+SHIFT+L (modificar todos)
    public Exercicio(String nome,
                     String descricao,
                     String som,
                     int tempoMin,
                     String exemplo){
            this.nome = nome;
            this.descricao = descricao;
            this.som = som;
            this.tempoMin = tempoMin;
            this.exemplo = exemplo;
    }
    public Exercicio(String nome,
                     String descricao,
                     String exemplo){
            this.nome = nome;
            this.descricao = descricao;
            this.exemplo = exemplo;
    }
    public Exercicio(String nome){
            this.nome = nome;         
    }
    /*
     * 
     * public Construtor(String , String , int){
     * 
     * }
     * public Construtor(int , String , String){
     * 
     * }
     * public Construtor(int){
     * 
     * }
     * public Construtor(String , String){
     * 
     * }
     * public Construtor(String){
     * 
     * }
     * public Construtor(String,int){
     * 
     * }
     * public Construtor(int, String){
     * 
     * }
     * public Construtor(){
     * 
     * }
     * 
     * 
     */


     //métodos de acesso
    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSom() {
        return som;
    }

    public int getTempoMin() {
        return tempoMin;
    }

    public String getExemplo() {
        return exemplo;
    }
}