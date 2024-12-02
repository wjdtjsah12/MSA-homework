package com.sparta.msa_exam.product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductResponseDto {
    private long productId;
    private String name;
    private Integer supplyPrice;

    public ProductResponseDto(Product product) {
        this.productId = product.getId();
        this.name = product.getName();
        this.supplyPrice = product.getSupplyPrice();
    }
}
