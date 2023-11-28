public class ProcessadorDePagamento {

    private double valor;
    private int nivelSocio;

    public ProcessadorDePagamento(double valor, int nivelSocio) {
        this.valor = valor;
        this.nivelSocio = nivelSocio;
    }

    public double calcularDesconto(Desconto desconto){
        return desconto.aplicarDesconto(this.valor, this.nivelSocio);
    }
}
