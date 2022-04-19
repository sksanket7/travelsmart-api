package com.st.travelsmartapi.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "JwtResponse DTO")
public class JwtResponse {

    private String token;
}
