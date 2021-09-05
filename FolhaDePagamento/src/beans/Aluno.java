package beans;

// @author Matheus Machado

public class Aluno extends Pessoa {
    
    protected String RA;
    protected String cruso;
    protected String dataMatricula;

    public Aluno(String RA, String cruso, String dataMatricula, String RG, String nome, String email, String telefone, String endereco) {
        super(RG, nome, email, telefone, endereco);
        this.RA = RA;
        this.cruso = cruso;
        this.dataMatricula = dataMatricula;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCruso() {
        return cruso;
    }

    public void setCruso(String cruso) {
        this.cruso = cruso;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + super.toString() +
                ", RA: " + RA + ", cruso: " + cruso + ", dataMatricula: " + dataMatricula + '}';
    }
    
    
}
