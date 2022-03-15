package com.st.travelsmartapi.repository;

import com.st.travelsmartapi.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
    List<Order> findByUserId(String userId);
}
