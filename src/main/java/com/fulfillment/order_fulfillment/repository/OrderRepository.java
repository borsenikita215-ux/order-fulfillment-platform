package com.fulfillment.order_fulfillment.repository;

import com.fulfillment.order_fulfillment.model.Order;
import com.fulfillment.order_fulfillment.model.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByStatus(OrderStatus status);
}
