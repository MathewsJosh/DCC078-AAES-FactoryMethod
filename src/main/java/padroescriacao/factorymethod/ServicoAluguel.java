package padroescriacao.factorymethod;

public class ServicoAluguel implements Hotelaria {

    public String executar() {
        return "Aluguel efetivado";
    }

    public String cancelar() {
        return "Aluguel cancelado";
    }
}
