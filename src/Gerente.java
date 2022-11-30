public class Gerente extends Funcionario {
    @Override
    protected double getPERCENTUAL_CUSTO() {
        return 1.5;
    }

    private String funcao;

    public void setFuncao() {
        this.funcao = funcao;
    }
    public void imprimir() {
        System.out.println(
                "olá, meu nome é " + getNome()
                        + ", meu salário é de " + getSalario()
                        + ", e meu custo é de " + getCusto()
                        + ", e eu trabalho de " + this.funcao);
    }
}


