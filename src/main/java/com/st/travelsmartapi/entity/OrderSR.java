package com.st.travelsmartapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "NewOrder")
public class OrderSR {
    /*@Id*/
    @Column(name = "order_id")
    @ApiModelProperty(notes = "order_id")
    private String order_id;

    @Column(name = "order_date")
    @ApiModelProperty(notes = "order date")
    private String order_date;

    @Column(name = "pickup_location")
    @ApiModelProperty(notes = "pickup_location")
    private String pickup_location;

    @Column(name = "channel_id")
    @ApiModelProperty(notes = "mode of travel")
    private String channel_id;

    @Column(name = "comment")
    @ApiModelProperty(notes = "comment")
    private String comment;

    @Column(name = "billing_customer_name")
    @ApiModelProperty(notes = "billing_customer_name")
    private String billing_customer_name;

    @Column(name = "billing_last_name")
    @ApiModelProperty(notes = "billing_last_name")
    private String billing_last_name;

    @Column(name = "billing_address")
    @ApiModelProperty(notes = "billing_address")
    private String billing_address;

    @Column(name = "billing_address_2")
    @ApiModelProperty(notes = "billing_address_2")
    private String billing_address_2;

    @Column(name = "billing_city")
    @ApiModelProperty(notes = "billing_city")
    private String billing_city;

    @Column(name = "billing_pincode")
    @ApiModelProperty(notes = "billing_pincode")
    private String billing_pincode;

    @Column(name = "billing_state")
    @ApiModelProperty(notes = "billing_state")
    private String billing_state;

    @Column(name = "billing_country")
    @ApiModelProperty(notes = "billing_country")
    private String billing_country;

    @Column(name = "billing_email")
    @ApiModelProperty(notes = "billing_email")
    private String billing_email;

    @Column(name = "billing_phone")
    @ApiModelProperty(notes = "billing_phone")
    private String billing_phone;

    @Column(name = "shipping_is_billing")
    @ApiModelProperty(notes = "shipping_is_billing")
    private Boolean shipping_is_billing;

    @Column(name = "shipping_customer_name")
    @ApiModelProperty(notes = "shipping_customer_name")
    private String shipping_customer_name;

    @Column(name = "shipping_last_name")
    @ApiModelProperty(notes = "shipping_last_name")
    private String shipping_last_name;

    @Column(name = "shipping_address")
    @ApiModelProperty(notes = "shipping_address")
    private String shipping_address;

    @Column(name = "shipping_address_2")
    @ApiModelProperty(notes = "shipping_address_2")
    private String shipping_address_2;

    @Column(name = "shipping_city")
    @ApiModelProperty(notes = "shipping_city")
    private String shipping_city;

    @Column(name = "shipping_pincode")
    @ApiModelProperty(notes = "shipping_pincode")
    private String shipping_pincode;

    @Column(name = "shipping_country")
    @ApiModelProperty(notes = "shipping_country")
    private String shipping_country;

    @Column(name = "shipping_state")
    @ApiModelProperty(notes = "shipping_state")
    private String shipping_state;

    @Column(name = "shipping_email")
    @ApiModelProperty(notes = "shipping_email")
    private String shipping_email;

    @Column(name = "shipping_phone")
    @ApiModelProperty(notes = "shipping_phone")
    private String shipping_phone;

    @Column(name = "items")
    @ApiModelProperty(notes = "items")
    private List<Items> items;

    @Column(name = "payment_method")
    @ApiModelProperty(notes = "payment_method")
    private String payment_method;

    @Column(name = "shipping_charges")
    @ApiModelProperty(notes = "shipping_charges")
    private int shipping_charges;

    @Column(name = "giftwrap_charges")
    @ApiModelProperty(notes = "giftwrap_charges")
    private int giftwrap_charges;

    @Column(name = "transaction_charges")
    @ApiModelProperty(notes = "transaction_charges")
    private int transaction_charges;

    @Column(name = "total_discount")
    @ApiModelProperty(notes = "total_discount")
    private int total_discount;

    @Column(name = "sub_total")
    @ApiModelProperty(notes = "sub_total")
    private long sub_total;

    @Column(name = "length")
    @ApiModelProperty(notes = "length")
    private int length;

    @Column(name = "breadth")
    @ApiModelProperty(notes = "breadth")
    private int breadth;

    @Column(name = "height")
    @ApiModelProperty(notes = "height")
    private int height;

    @Column(name = "weight")
    @ApiModelProperty(notes = "weight")
    private float weight;
}
