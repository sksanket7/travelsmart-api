package com.st.travelsmartapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="ts_user_role")
@Entity
public class UserRole {
    @Id
    @Column(name = "role_id")
    @ApiModelProperty(notes = "userRoleId")
    private String userRoleId;

    @Column(name = "role_name")
    @ApiModelProperty(notes = "userRoleName")
    private String userRoleName;
}
