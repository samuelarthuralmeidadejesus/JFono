public class Clinica {
   private int id; 
   private String nome;
   private String cnpj;

   public Clinica(){
      
   }
   public Clinica(String nome, String cnpj) {
      this.nome = nome;
      this.cnpj = cnpj;
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
   public String getCnpj() {
      return cnpj;
   }
   public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
   }

   
}