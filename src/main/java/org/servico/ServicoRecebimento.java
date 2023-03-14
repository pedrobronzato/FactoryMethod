package org.servico;

public class ServicoRecebimento implements IServico {
    public String executar() {
        return "Recebimento executado";
    }

    public String cancelar() {
        return "Recebimento cancelado";
    }
}
