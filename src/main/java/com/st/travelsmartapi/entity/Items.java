package com.st.travelsmartapi.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity
@Table(name = "items")*/
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Items")
public class Items {
    /*@Id*/
    @Column(name = "name")
    @ApiModelProperty(notes = "name")
    private String name;

    @Column(name = "sku")
    @ApiModelProperty(notes = "sku")
    private String sku;

    @Column(name = "units")
    @ApiModelProperty(notes = "units")
    private int units;

    @Column(name = "discount")
    @ApiModelProperty(notes = "discount")
    private String discount;

    @Column(name = "tax")
    @ApiModelProperty(notes = "tax")
    private String tax;

    @Column(name = "hsn")
    @ApiModelProperty(notes = "hsn")
    private long hsn;
}
