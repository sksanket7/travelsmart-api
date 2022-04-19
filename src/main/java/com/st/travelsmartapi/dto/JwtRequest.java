package com.st.travelsmartapi.dto;

import io.swagger.annotations.ApiModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "UserData DTO")
public class JwtRequest {
    private String username;
    private String password;


}
