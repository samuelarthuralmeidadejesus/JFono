public class Profissional {
    private int id;
    private String nome;
    private String telefone;
    
    public Profissional(){

    }
    public Profissional(String nome, String telefone) {
      
        this.nome = nome;
        this.telefone = telefone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } 
    
    
     
}
