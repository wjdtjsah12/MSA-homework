package com.sparta.msa_exam.order.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class OrderRequestDto {
    private List<Long> orderItemIds;
}
