package com.iurimedina.trabalho_teste_qualidade.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalcularPrecoServiceTest {

	@Test
    void testTC1_IdadeCrianca() {
        assertEquals(10.0, CalcularPrecoService.calcularPreco(5));
    }

    @Test
    void testTC2_IdadeAdulto() {
        assertEquals(30.0, CalcularPrecoService.calcularPreco(30));
    }

    @Test
    void testTC3_IdadeIdoso() {
        assertEquals(15.0, CalcularPrecoService.calcularPreco(65));
    }

    @Test
    void testTC4_IdadeIdosoLimite() {
        assertEquals(15.0, CalcularPrecoService.calcularPreco(120));
    }

    @Test
    void testTC5_IdadeZeroInvalida() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            CalcularPrecoService.calcularPreco(0);
        });
        assertEquals("Idade invalida: 0", ex.getMessage());
    }

    @Test
    void testTC6_IdadeNegativa() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            CalcularPrecoService.calcularPreco(-5);
        });
        assertEquals("Idade invalida: -5", ex.getMessage());
    }

    @Test
    void testTC7_IdadeMuitoAlta() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            CalcularPrecoService.calcularPreco(130);
        });
        assertEquals("Idade invalida: 130", ex.getMessage());
    }
}
