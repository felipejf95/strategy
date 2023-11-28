import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorTest {

    @Test
    void deveCalcularDescontoSocio1(){
        Vendedor vendedor = new Vendedor();
        vendedor.venderDescontoSocio1(1000, 1);
        assertEquals(670, vendedor.getValorFinalVenda());
    }

    @Test
    void deveCalcularDescontoSocio2(){
        Vendedor vendedor = new Vendedor();
        vendedor.venderDescontoSocio2(1000, 2);
        assertEquals(790, vendedor.getValorFinalVenda());
    }

    @Test
    void deveCalcularDescontoSocio3(){
        Vendedor vendedor = new Vendedor();
        vendedor.venderDescontoSocio3(1000, 1);
        assertEquals(900, vendedor.getValorFinalVenda());
    }


}