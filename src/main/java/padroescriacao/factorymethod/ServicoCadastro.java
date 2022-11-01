package padroescriacao.factorymethod;

public class ServicoCadastro implements Hotelaria {

    public String executar() {
        return "Cadastro efetivado";
    }

    public String cancelar() {
        return "Cadastro cancelado";
    }
}
