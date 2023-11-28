public class DescontoSocio1 implements Desconto{

    @Override
    public double aplicarDesconto(double valor, int nivelSocio) {
        return (valor * 0.70) - nivelSocio*30;
    }

}
