package com.st.travelsmartapi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity
@Table(name = "user_details")*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "User")
public class User {

    /*@Id*/
    @Column(name = "user_id")
    @ApiModelProperty(notes = "user_id")
    private long user_id;

    @Column(name = "user_email")
    @ApiModelProperty(notes = "user_email")
    private String user_email;

    @Column(name = "user_phone")
    @ApiModelProperty(notes = "user_phone")
    private String user_phone;

    @Column(name = "user_first_name")
    @ApiModelProperty(notes = "user_first_name")
    private String user_first_name;

    @Column(name = "user_last_name")
    @ApiModelProperty(notes = "user_last_name")
    private String user_last_name;

    @Column(name = "user_address")
    @ApiModelProperty(notes = "user_address")
    private String user_address;

    @Column(name = "user_address2")
    @ApiModelProperty(notes = "user_address2")
    private String user_address2;

    @Column(name = "user_pincode")
    @ApiModelProperty(notes = "user_pincode")
    private String user_pincode;

    @Column(name = "user_city")
    @ApiModelProperty(notes = "user_city")
    private String user_city;

    @Column(name = "user_state")
    @ApiModelProperty(notes = "user_state")
    private String user_state;

    @Column(name = "user_country")
    @ApiModelProperty(notes = "user_country")
    private String user_country;

}
