package gft_exercicio7;

public class Funcionario {
  String nome;
  int idade;
  double salario;
  
  public double Bonificação() {
      return salario;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario {" + "nome= " + nome + ", idade= " + idade + ", salario= " + salario + '}';
    }

}
