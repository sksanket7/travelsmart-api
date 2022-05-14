package com.st.travelsmartapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ts_order_table")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Order DTO")
public class Order {
    @Id
    @Column(name = "order_id_st")
    @ApiModelProperty(notes = "order_id_st")
    private int orderId;

    @Column(name = "order_id_sr")
    @ApiModelProperty(notes = "order_id_sr")
    private String orderIdSr;

    @Column(name = "ts_user_id")
    @ApiModelProperty(notes = "ts_user_id")
    private String userId;

    @Column(name = "order_date")
    @ApiModelProperty(notes = "order date")
    private String order_date;

    @Column(name = "ts_comment")
    @ApiModelProperty(notes = "ts_comment")
    private String ts_comment;

    @Column(name = "pickup_customer_name")
    @ApiModelProperty(notes = "pickup_customer_name")
    private String pickup_customer_name;

    @Column(name = "pickup_last_name")
    @ApiModelProperty(notes = "pickup_last_name")
    private String pickup_last_name;

    @Column(name = "pickup_address")
    @ApiModelProperty(notes = "pickup_address")
    private String pickup_address;

    @Column(name = "pickup_address_2")
    @ApiModelProperty(notes = "pickup_address_2")
    private String pickup_address_2;

    @Column(name = "pickup_city")
    @ApiModelProperty(notes = "pickup_city")
    private String pickup_city;

    @Column(name = "pickup_pincode")
    @ApiModelProperty(notes = "pickup_pincode")
    private String pickup_pincode;

    @Column(name = "pickup_state")
    @ApiModelProperty(notes = "pickup_state")
    private String pickup_state;

    @Column(name = "pickup_country")
    @ApiModelProperty(notes = "pickup_country")
    private String pickup_country;

    @Column(name = "pickup_email")
    @ApiModelProperty(notes = "pickup_email")
    private String pickup_email;

    @Column(name = "pickup_phone")
    @ApiModelProperty(notes = "pickup_phone")
    private String pickup_phone;

    @Column(name = "shipping_is_pickup")
    @ApiModelProperty(notes = "shipping_is_pickup")
    private Boolean shipping_is_pickup;

    @Column(name = "destination_address")
    @ApiModelProperty(notes = "destination_address")
    private String destination_address;

    @Column(name = "destination_address_2")
    @ApiModelProperty(notes = "destination_address_2")
    private String destination_address_2;

    @Column(name = "destination_city")
    @ApiModelProperty(notes = "destination_city")
    private String destination_city;

    @Column(name = "destination_pincode")
    @ApiModelProperty(notes = "destination_pincode")
    private String destination_pincode;

    @Column(name = "destination_country")
    @ApiModelProperty(notes = "destination_country")
    private String destination_country;

    @Column(name = "destination_state")
    @ApiModelProperty(notes = "destination_state")
    private String destination_state;

    @Column(name = "payment_method")
    @ApiModelProperty(notes = "payment_method")
    private String payment_method;

    @Column(name = "sub_total")
    @ApiModelProperty(notes = "sub_total")
    private long sub_total;

    @Column(name = "ts_length")
    @ApiModelProperty(notes = "ts_length")
    private int ts_length;

    @Column(name = "breadth")
    @ApiModelProperty(notes = "breadth")
    private int breadth;

    @Column(name = "height")
    @ApiModelProperty(notes = "height")
    private int height;

    @Column(name = "weight")
    @ApiModelProperty(notes = "weight")
    private float weight;

   /* @Column(name = "file")
    @ApiModelProperty(notes = "file")
    private MultipartFile file;*/

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_orderId")
    private DBFile file;*/
}
