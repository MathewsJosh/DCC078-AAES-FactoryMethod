package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVendaTest {

    @Test
    void deveExecutarVenda() {
        Hotelaria servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda efetivada", servico.executar());
    }

    @Test
    void deveCancelarVenda() {
        Hotelaria servico = ServicoFactory.obterServico("Venda");
        assertEquals("Venda cancelada", servico.cancelar());
    }

}