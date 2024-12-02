package com.sparta.msa_exam.product;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer supplyPrice;

    public static Product createProduct(ProductRequestDto requestDto) {
        return Product.builder()
                .name(requestDto.getName())
                .supplyPrice(requestDto.getSupplyPrice())
                .build();
    }
}
