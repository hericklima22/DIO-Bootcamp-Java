package com.dio.base;

import java.math.BigDecimal;

/**
 * @author Herick Lima
 * @version 1.0.0 
 * @see BigDecimal
 * @since Release 1.0.0
*/

public class Order {

    private final BigDecimal totalValue;


    /**
     * Construtor da classe
     * 
     * @param code          Código do pedido
     * @param totalValue    Valor total do pedido
     */
    public Order(String code, BigDecimal totalValue) {
        this.totalValue = totalValue;
    }


    /**
     * Calcula o valor total de acordo com o valor total do pedido; se o valor for maior que R$100,00 uma taxa será cobrada.
     * @return                      Valor total do pedido com as taxas
     * @throws RuntimeException     Se o valor do pedido for negativo
     */ 
    public BigDecimal calculateFee() throws RuntimeException {
        if (this.totalValue.signum() < 0) {
            throw new RuntimeException("O pedido nao pode ter valor negativo");
        }

        if (this.totalValue.compareTo(new BigDecimal("100.00")) > 100) {
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }

        return this.totalValue;
    }
}
