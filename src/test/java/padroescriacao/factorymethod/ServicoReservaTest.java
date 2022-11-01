package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoReservaTest {

    @Test
    void deveExecutarReserva() {
        Hotelaria servico = ServicoFactory.obterServico("Reserva");
        assertEquals("Reserva efetivada", servico.executar());
    }

    @Test
    void deveCancelarReserva() {
        Hotelaria servico = ServicoFactory.obterServico("Reserva");
        assertEquals("Reserva cancelada", servico.cancelar());
    }

}