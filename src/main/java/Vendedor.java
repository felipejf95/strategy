public class Vendedor {

    private double valorFinal;

    public double getValorFinalVenda(){
        return this.valorFinal;
    }

    public void venderDescontoSocio1(double valor, int nivelSocio){
        ProcessadorDePagamento processador = new ProcessadorDePagamento(valor, nivelSocio);
        this.valorFinal = processador.calcularDesconto(new DescontoSocio1());
    }

    public void venderDescontoSocio2(double valor, int nivelSocio){
        ProcessadorDePagamento processador = new ProcessadorDePagamento(valor, nivelSocio);
        this.valorFinal = processador.calcularDesconto(new DescontoSocio2());
    }

    public void venderDescontoSocio3(double valor, int nivelSocio){
        ProcessadorDePagamento processador = new ProcessadorDePagamento(valor, nivelSocio);
        this.valorFinal = processador.calcularDesconto(new DescontoSocio3());
    }
}
