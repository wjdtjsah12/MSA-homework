package com.sparta.msa_exam.product;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

import static com.sparta.msa_exam.product.QProduct.product;

@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<ProductResponseDto> findAllProducts() {
        List<ProductResponseDto> results = queryFactory
                .selectFrom(product)
                .fetch().stream().map(ProductResponseDto::new).collect(Collectors.toList());
        return results;
    }
}
