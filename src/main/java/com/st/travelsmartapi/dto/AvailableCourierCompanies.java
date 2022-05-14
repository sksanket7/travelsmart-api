package com.st.travelsmartapi.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Available_courier_companies DTO")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvailableCourierCompanies {
    @JsonProperty(value = "base_courier_id")
    private String base_courier_id;

    @JsonProperty(value = "courier_type")
    private int courier_type;

    @JsonProperty(value = "courier_company_id")
    private int courier_company_id;

    @JsonProperty(value = "courier_name")
    private String courier_name;

    @JsonProperty(value = "is_rto_address_available")
    private boolean is_rto_address_available;

    @JsonProperty(value = "rate")
    private float rate;

    @JsonProperty(value = "is_custom_rate")
    private int is_custom_rate;

    @JsonProperty(value = "cod_multiplier")
    private int cod_multiplier;

    @JsonProperty(value = "cod_charges")
    private int cod_charges;

    @JsonProperty(value = "freight_charge")
    private float freight_charge;

    @JsonProperty(value = "rto_charges")
    private float rto_charges;

    @JsonProperty(value = "coverage_charges")
    private int coverage_charges;

    @JsonProperty(value = "is_surface")
    private boolean is_surface;

    @JsonProperty(value = "rating")
    private float rating;

    @JsonProperty(value = "rto_performance")
    private float rto_performance;

    @JsonProperty(value = "pickup_performance")
    private int pickup_performance;

    @JsonProperty(value = "delivery_performance")
    private float delivery_performance;

    @JsonProperty(value = "cod")
    private int cod;

    @JsonProperty(value = "description")
    private String description;

    @JsonProperty(value = "mode")
    private int mode;

    @JsonProperty(value = "blocked")
    private int blocked;

    @JsonProperty(value = "suppression_dates")
    private SuppressionDates[] suppressionDates;

    @JsonProperty(value = "min_weight")
    private int min_weight;

    @JsonProperty(value = "is_international")
    private int is_international;

    @JsonProperty(value = "is_hyperlocal")
    private boolean is_hyperlocal;

    @JsonProperty(value = "entry_tax")
    private int entry_tax;

    @JsonProperty(value = "cutoff_time")
    private String cutoff_time;

    @JsonProperty(value = "pickup_availability")
    private int pickup_availability;

    @JsonProperty(value = "seconds_left_for_pickup")
    private int seconds_left_for_pickup;

    @JsonProperty(value = "suppress_text")
    private String suppress_text;

    @JsonProperty(value = "pickup_supress_hours")
    private int pickup_supress_hours;

    @JsonProperty(value = "suppress_date")
    private String suppress_date;

    @JsonProperty(value = "supress_hours")
    private int supress_hours;

    @JsonProperty(value = "etd_hours")
    private int etd_hours;

    @JsonProperty(value = "etd")
    private String etd;

    @JsonProperty(value = "estimated_delivery_days")
    private String estimated_delivery_days;

    @JsonProperty(value = "tracking_performance")
    private float tracking_performance;

    @JsonProperty(value = "weight_cases")
    private float weight_cases;

    @JsonProperty(value = "realtime_tracking")
    private String realtime_tracking;

    @JsonProperty(value = "delivery_boy_contact")
    private String delivery_boy_contact;

    @JsonProperty(value = "pod_available")
    private String pod_available;

    @JsonProperty(value = "call_before_delivery")
    private String call_before_delivery;

    @JsonProperty(value = "rank")
    private String rank;

    @JsonProperty(value = "cost")
    private String cost;

    @JsonProperty(value = "edd")
    private String edd;

    @JsonProperty(value = "base_weight")
    private String base_weight;

    @JsonProperty(value = "pickup_priority")
    private String pickup_priority;

    @JsonProperty(value = "qc_courier")
    private int qc_courier;

    @JsonProperty(value = "odablock")
    private boolean odablock;


}