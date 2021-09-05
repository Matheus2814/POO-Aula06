package beans;

// @author Matheus Machado
 
public class Pessoa {
 
    protected String RG;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String endereco;

    public Pessoa(String RG, String nome, String email, String telefone, String endereco) {
        this.RG = RG;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "RG: " + RG + ", nome: " + nome + ", email: " + email +
                ", telefone: " + telefone + ", endereco: " + endereco + '}';
    }

    
    
}
