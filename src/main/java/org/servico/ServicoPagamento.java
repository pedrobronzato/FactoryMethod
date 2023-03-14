package org.servico;

public class ServicoPagamento implements IServico {
    public String executar() {
        return "Pagamento executado";
    }

    public String cancelar() {
        return "Pagamento cancelado";
    }
}
