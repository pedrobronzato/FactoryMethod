package org.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRecebimentoTest {

    @Test
    void deveExecutarRecebimento() {
        IServico servico = ServicoFactory.obterServico("Recebimento");
        assertEquals("Recebimento executado", servico.executar());
    }

    @Test
    void deveCancelarRecebimento() {
        IServico servico = ServicoFactory.obterServico("Recebimento");
        assertEquals("Recebimento cancelado", servico.cancelar());
    }
}