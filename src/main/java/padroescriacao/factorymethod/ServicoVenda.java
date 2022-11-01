package padroescriacao.factorymethod;

public class ServicoVenda implements Hotelaria {

    public String executar() {
        return "Venda efetivada";
    }

    public String cancelar() {
        return "Venda cancelada";
    }
}
