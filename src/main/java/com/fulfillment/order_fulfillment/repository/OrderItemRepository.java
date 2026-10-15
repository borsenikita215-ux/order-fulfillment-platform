package com.fulfillment.order_fulfillment.repository;

import com.fulfillment.order_fulfillment.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
