package com.sparta.msa_exam.order;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderRepositoryImpl {
    private final JPAQueryFactory queryFactory;
}
