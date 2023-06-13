import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> listaFuncionarios;

    public Empresa(String nome, List<Funcionario> listaFuncionarios) {
        this.nome = nome;
        this.listaFuncionarios = listaFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }

    @Override
    public String toString() {
        return "Empresa [nome=" + nome + ", listaFuncionarios=" + listaFuncionarios + "]";
    }

    

    
}
