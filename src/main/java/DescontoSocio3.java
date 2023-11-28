public class DescontoSocio3 implements Desconto{

    @Override
    public double aplicarDesconto(double valor, int nivelSocio) {
        return valor * 0.9;
    }
}
