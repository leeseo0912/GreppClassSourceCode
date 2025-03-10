// 2025. 03. 07(금)
package com.grepp.coffeemanager.domain.sale;

import com.grepp.coffeemanager.domain.order.Order;
import com.grepp.coffeemanager.domain.payment.Payment;

public class Sale {

  public Payment takeOrder(Order order) {
    order.proceed();
    Payment payment = new Payment(order);
    payment.proceed();
    return payment;

  }
}
