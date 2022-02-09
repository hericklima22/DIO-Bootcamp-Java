package com.dio;
import java.math.BigDecimal;

import com.dio.base.Order;

public class MyFirstProgram {
    public static void Main(String[] args) {
        String code = "1234";

        BigDecimal decimal = new BigDecimal("100");

        Order order = new Order(code,decimal);

        System.out.println(order);
    }
}
