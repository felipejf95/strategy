public class DescontoSocio2 implements Desconto{

    @Override
    public double aplicarDesconto(double valor, int nivelSocio) {
        return (valor * 0.80) - nivelSocio*5;
    }
}
