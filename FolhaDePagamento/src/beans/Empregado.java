package beans;

// @author Matheus Machado
 
public interface Empregado {
 
       double calcSalario(double salarioBruto);
       double calcSalarioBruto();
       double calcINSS(double salario);
       double calcIRRF(double salario);
    
}
