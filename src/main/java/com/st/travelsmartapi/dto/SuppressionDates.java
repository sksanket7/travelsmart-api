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
@ApiModel(description = "SuppressionDates DTO")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SuppressionDates {
    @JsonProperty(value = "action_on")
    private String action_on;

    @JsonProperty(value = "delay_remark")
    private String delay_remark;

    @JsonProperty(value = "pickup_delay_by")
    private Long pickup_delay_by;

    @JsonProperty(value = "pickup_delay_to")
    private String pickup_delay_to;

    @JsonProperty(value = "pickup_delay_days")
    private String pickup_delay_days;

    @JsonProperty(value = "pickup_delay_from")
    private String pickup_delay_from;
}
