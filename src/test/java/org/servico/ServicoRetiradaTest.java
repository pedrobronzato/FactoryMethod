package org.servico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRetiradaTest {

    @Test
    void deveExecutarRetirada() {
        IServico servico = ServicoFactory.obterServico("Retirada");
        assertEquals("Retirada executada", servico.executar());
    }

    @Test
    void deveCancelarPagamento() {
        IServico servico = ServicoFactory.obterServico("Retirada");
        assertEquals("Retirada cancelada", servico.cancelar());
    }
}