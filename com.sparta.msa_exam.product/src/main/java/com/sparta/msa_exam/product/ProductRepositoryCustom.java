package com.sparta.msa_exam.product;

import java.util.List;

public interface ProductRepositoryCustom {
    List<ProductResponseDto> findAllProducts();
}
