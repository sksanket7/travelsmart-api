package com.st.travelsmartapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.st.travelsmartapi.dto.NewOrderResponse;
import com.st.travelsmartapi.entity.Order;

import java.util.List;

public interface OrderService {

    public NewOrderResponse placeNewOrder(Order order) throws JsonProcessingException;

    public List<Order> getOrders(String userId);

    Order getOrderDetails(String orderId);

    Object getEstimatedFare(Order order) throws JsonProcessingException;
}
