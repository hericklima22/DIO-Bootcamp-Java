package com.dio;
import com.dio.base.Order;

public class MyFirstProgram {
    public static void main(String []args) {
        String code = "1234";

        Order order = new Order(code);

        System.out.println(order);
    }
}
