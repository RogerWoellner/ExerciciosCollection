public class Funcionario {
    private String nome, cargo;
    private int idade;
    private float salario;


    public Funcionario(String nome, String cargo, int idade, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }


    public String getCargo() {
        return cargo;
    }


    public int getIdade() {
        return idade;
    }


    public float getSalario() {
        return salario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setSalario(float salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", idade=" + idade + ", salario=" + salario + "]";
    }

    
    
}


