package com.maoptech.productservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;
}

















//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
//public class ProductRequest {
//
//    private String name;
//    private String description;
//    private BigDecimal price;
//
//}