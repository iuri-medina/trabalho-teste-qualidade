package com.iurimedina.trabalho_teste_qualidade.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidacaoQuantBilhetesTest {

	@Test
    void testTC1_QuantidadeZero() {
        assertFalse(ValidacaoQuantBilhetes.validarQuantBilhetes(0));
    }

    @Test
    void testTC2_QuantidadeMinimaValida() {
        assertTrue(ValidacaoQuantBilhetes.validarQuantBilhetes(1));
    }

    @Test
    void testTC3_QuantidadeMaximaValida() {
        assertTrue(ValidacaoQuantBilhetes.validarQuantBilhetes(5));
    }

    @Test
    void testTC4_QuantidadeMaiorQueMaxima() {
        assertFalse(ValidacaoQuantBilhetes.validarQuantBilhetes(6));
    }

    @Test
    void testTC5_QuantidadeIntermediariaValida() {
        assertTrue(ValidacaoQuantBilhetes.validarQuantBilhetes(3));
    }

    @Test
    void testTC6_QuantidadeNegativa() {
        assertFalse(ValidacaoQuantBilhetes.validarQuantBilhetes(-1));
    }

    @Test
    void testTC7_QuantidadeMuitoAlta() {
        assertFalse(ValidacaoQuantBilhetes.validarQuantBilhetes(100));
    }
}
