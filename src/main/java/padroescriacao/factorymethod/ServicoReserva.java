package padroescriacao.factorymethod;

public class ServicoReserva implements Hotelaria  {

    public String executar() {
        return "Reserva efetivada";
    }

    public String cancelar() {
        return "Reserva cancelada";
    }
}
