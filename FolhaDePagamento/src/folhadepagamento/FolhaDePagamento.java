package folhadepagamento;

// @author Matheus Machado

import beans.Aluno;
import beans.Pessoa;
import beans.Funcionario;
import beans.Horista;
import beans.Mensalista;
 
public class FolhaDePagamento {

    public static void main(String[] args) {

        Mensalista m0 = new Mensalista("auxiliar", "12345", "almoxarifado", "12/09/2019",
                              "12.345.678", "Ana Renata Silva", "anarenata@fatec.sp.gov.br",
                              "12-987654321", "Av Italia, 150, Independencia, Taubaté - SP");
        
        Horista h0 = new Horista(20, 80, "09876", "contabilidade", "12/09/1999",
                              "12.345.678", "Ana Renata Silva", "anarenata@fatec.sp.gov.br",
                              "12-987654321", "Av Italia, 150, Independencia, Taubaté - SP");
        Funcionario funcionarios[] = {m0, h0}; 
        double total = 0;
        for(int i = 0; i < funcionarios.length; i++){
            System.out.println(funcionarios[i]);
            total+=funcionarios[i].calcSalario(funcionarios[i].calcSalarioBruto());            
        }
        System.out.println("totalSalario = " + total);
    }
        
    }
    
     
