package com.st.travelsmartapi.entity;

import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="ts_user_data")
@Entity
public class UserData {


    @Id
    @NonNull
    @Column(name = "user_name")
    @ApiModelProperty(notes = "user_name")
    private String username;

    @Column(name = "user_password")
    @ApiModelProperty(notes = "user_password")
    private String password;

    @Column(name = "user_first_name")
    @ApiModelProperty(notes = "user_first_name")
    private String firstName;

    @Column(name = "user_last_name")
    @ApiModelProperty(notes = "user_last_name")
    private String lastName;

    @Column(name = "user_branch_name")
    @ApiModelProperty(notes = "user_branch_name")
    private String branchName;

    @Column(name = "user_email_id")
    @ApiModelProperty(notes = "user_email_id")
    private String emailId;

    @Column(name = "user_contact_number")
    @ApiModelProperty(notes = "user_contact_number")
    private String contactNumber;

    @Column(name = "user_address_line_one")
    @ApiModelProperty(notes = "user_address_line_one")
    private String addressLine1;

    @Column(name = "user_address_line_two")
    @ApiModelProperty(notes = "user_address_line_two")
    private String addressLine2;

    @Column(name = "user_pincode")
    @ApiModelProperty(notes = "user_pincode")
    private String pinCode;

    @Column(name = "user_city_name")
    @ApiModelProperty(notes = "user_city_name")
    private String cityName;

    @Column(name = "user_district_name")
    @ApiModelProperty(notes = "user_district_name")
    private String districtName;

    @Column(name = "user_state_name")
    @ApiModelProperty(notes = "user_state_name")
    private String stateName;

    @Column(name = "user_country_name")
    @ApiModelProperty(notes = "user_country_name")
    private String countryName;

    @Column(name = "user_pan_card_number")
    @ApiModelProperty(notes = "user_pan_card_number")
    private String panCardNumber;

    @Column(name = "user_adhaar_number")
    @ApiModelProperty(notes = "user_adhaar_number")
    private String adhaarCardNumber;

    @Column(name = "user_create_date_time")
    @ApiModelProperty(notes = "user_create_date_time")
    private String createdDateTime;

    @Column(name = "user_create_location")
    @ApiModelProperty(notes = "user_create_location")
    private String createdLocation;

    @Column(name = "user_status")
    @ApiModelProperty(notes = "user_status")
    private String userStatus; //active or inactive

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_role_id")
    private UserRole userRole;
}
