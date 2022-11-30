public class Main {
    public static void main(String[] args) {
        Programador ruan = new Programador();



        ruan.setImprimir("Desenvolvedor Back-end. \n");
        ruan.setNome("ruan");
        ruan.setSalario(4000);
        ruan.setHomeOffice("Home office");
        ruan.setAumento(10);


        Cabecalho cabecalho = new Cabecalho();
        cabecalho.setCabecalho("Cabeçalho");
        Rodape rodape = new Rodape();
        rodape.setRodape("Rodapé");

        ruan.imprimir(cabecalho, rodape);
    }
}




