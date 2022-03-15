package com.st.travelsmartapi.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "OrderResponse")
public class NewOrderResponse {

    private int order_id;
    private int shipment_id;
    private String status;
    private int status_code;
    private int onboarding_completed_now;
    private String awb_code;
    private String courier_company_id;
    private String courier_name;
}
