package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAluguelTest {

    @Test
    void deveExecutarAluguel() {
        Hotelaria servico = ServicoFactory.obterServico("Aluguel");
        assertEquals("Aluguel efetivado", servico.executar());
    }

    @Test
    void deveCancelarAluguel() {
        Hotelaria servico = ServicoFactory.obterServico("Aluguel");
        assertEquals("Aluguel cancelado", servico.cancelar());
    }

}