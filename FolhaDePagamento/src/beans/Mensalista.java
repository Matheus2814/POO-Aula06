package beans;

// @author Matheus Machado
 
public class Mensalista extends Funcionario {
 
       protected String cargo;

    public Mensalista(String cargo, String matricula, String departamento, String dataMatriculo,
            String RG, String nome, String email, String telefone, String endereco) {
        super(matricula, departamento, dataMatriculo, RG, nome, email, telefone, endereco);
        this.cargo = cargo;
    }

    @Override
    public double calcSalarioBruto() {
        if (cargo == "auxiliar")
            return 1100;
                else if (cargo == "atendente")
                    return 1700;
                        else if (cargo == "gerente")
                            return 2500;
                                else if (cargo == "diretor")
                                    return 3500;
                                         else
                                             return 0;
    }

    @Override
    public double calcIRRF(double salario) {
        return super.calcIRRF(salario);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Mensalista{"+ super.toString() + 
                            "cargo: " + cargo +
                            "RG: " + RG + ", nome: " + nome + ", email: " + email +
                            ", telefone: " + telefone + ", endereco: " + endereco + '}';
    }
       
       
    
}
