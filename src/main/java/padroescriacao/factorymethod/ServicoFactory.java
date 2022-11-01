package padroescriacao.factorymethod;

public class ServicoFactory {

    public static Hotelaria obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroescriacao.factorymethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço inexistente");
        }
        if (!(objeto instanceof Hotelaria)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (Hotelaria) objeto;
    }
}
