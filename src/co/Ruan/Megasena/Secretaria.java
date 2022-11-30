public class Secretaria extends Funcionario {
    private String atividade;

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public void imprimir() {
        System.out.println(
                "olá, meu nome é " + getNome()
                        + ", meu salário é de " + getSalario()
                        + ", e meu custo é de " + getCusto()
                        + ", e eu trabalho de " + this.atividade);

    }
}