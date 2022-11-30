public class Programador extends Funcionario {
    private String homeOffice;

    @Override
    protected double getPERCENTUAL_CUSTO() {
        return 2.0;
    }

    public void setHomeOffice(String homeOffice) {
        this.homeOffice = homeOffice;
    }


    public void imprimir() {
        System.out.println(

                getImprimir() + "olá, meu nome é " + getNome()
                        + ", meu salário é de " + getSalario()
                        + ", e meu custo é de " + getCusto()
                        + ", e eu trabalho de " + this.homeOffice);
    }

    public void imprimir(Rodape rodape) {
        imprimir();
        rodape.imprimir();


    }

    public void imprimir(Cabecalho cabecalho) {
        cabecalho.imprimir();
        imprimir();
    }

    public void imprimir(Cabecalho cabecalho, Rodape rodape) {
        cabecalho.imprimir();
        imprimir();
        rodape.imprimir();
    }

}