package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCadastroTest {

    @Test
    void deveExecutarCadastro() {
        Hotelaria servico = ServicoFactory.obterServico("Cadastro");
        assertEquals("Cadastro efetivado", servico.executar());
    }

    @Test
    void deveCancelarCadastro() {
        Hotelaria servico = ServicoFactory.obterServico("Cadastro");
        assertEquals("Cadastro cancelado", servico.cancelar());
    }

}