package com.st.travelsmartapi.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.st.travelsmartapi.dto.NewOrderResponse;
import com.st.travelsmartapi.entity.Order;
import com.st.travelsmartapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public NewOrderResponse placeNewOrder(Order order) throws JsonProcessingException {
        NewOrderResponse newOrderResponse = null;
        //call shiprocket api
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://shiprocket-api.herokuapp.com/shiprocketapi/newOrder";

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        HttpEntity entity = new HttpEntity(order,headers);
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);


        // check response
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful");
            System.out.println(response.getBody());
            ObjectMapper mapper = new ObjectMapper();
            newOrderResponse = mapper.readValue(response.getBody(), NewOrderResponse.class);
            order.setOrder_id_sr(String.valueOf(newOrderResponse.getOrder_id()));
            //store shiprocket order id into the order table if it is successful
            orderRepository.save(order);
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
        }
        return newOrderResponse;
    }
//const [orderId, setOrderId] = useState('');
    @Override
    public List<Order> getOrders(String userId) {
        List<Order> orderList=new ArrayList<>();
        orderRepository.findByUserId(userId).forEach(orderList::add);
        return orderList;
    }
}
