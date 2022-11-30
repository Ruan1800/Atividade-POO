
public class Funcionario {
    private String nome;
    private double salario;
    private double custo;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public final void setSalario(double salario){
        this.salario = salario;
        this.custo = salario * getPERCENTUAL_CUSTO();
    }
    public String getNome(){
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getCusto() {
        return custo;
    }
    protected double getPERCENTUAL_CUSTO() {
        return 1.8;
    }

    public void setAumento(double percentual) {
        double vezes = (100.0 + percentual ) / 100.0;
        this.setSalario(this.getSalario() * vezes);
    }
    public void setAumento(String percentual) {
        double d = Double.parseDouble(percentual);
        this.setAumento(d);
    }
    public void setAumento(){
        this.setAumento(10.0);
    }
    public void imprimir(){
        System.out.println(
                "olá, meu nome é " + this.nome
                        + ", salário é de " + this.salario
                        + ", custo é de " + this.custo);

    }

    private String imprimir;

    public String getImprimir() {
        return imprimir;
    }

    public void setImprimir(String imprimir) {
        this.imprimir = imprimir;
    }
}
