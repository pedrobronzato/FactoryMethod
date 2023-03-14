package org.servico;

public class ServicoRetirada implements IServico {

    public String executar() {
        return "Retirada executada";
    }

    public String cancelar() {
        return "Retirada cancelada";
    }
}
